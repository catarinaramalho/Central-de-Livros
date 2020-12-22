package entidades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Central {

    private static ArrayList<Livro> livros = lerLivrosXML();
    private static ArrayList<Cliente> clientes = lerClientesXML();
    private static ArrayList<Compra> compras = lerComprasXML();
    private static ArrayList<Funcionario> funcionarios = lerFuncionariosXML();
    private static Funcionario funcionarioLogado;
    private static Cliente clienteLogado;

    public Central() {
        Central.livros = lerLivrosXML();
        Central.clientes = lerClientesXML();
        Central.funcionarios = lerFuncionariosXML();
        Central.compras = lerComprasXML();
    }

    public static Funcionario getFuncionarioLogado() {
        return funcionarioLogado;
    }

    public static Cliente getClienteLogado() {
        return clienteLogado;
    }

    public static void setFuncionarioLogado(Funcionario funcionarioLogado) {
        Central.funcionarioLogado = funcionarioLogado;
    }

    public static void setClienteLogado(Cliente clienteLogado) {
        Central.clienteLogado = clienteLogado;
    }

    public static ArrayList<Compra> getCompras() {
        return Central.compras;
    }

    public static void setCompras(ArrayList<Compra> compras) {
        Central.compras = compras;
    }

    public static ArrayList<Livro> getLivros() {
        return Central.livros;
    }

    public static void setLivros(ArrayList<Livro> livros) {
        Central.livros = livros;
    }

    public static ArrayList<Cliente> getClientes() {
        return Central.clientes;
    }

    public static void setClientes(ArrayList<Cliente> clientes) {
        Central.clientes = clientes;
    }

    public static ArrayList<Funcionario> getFuncionarios() {
        return Central.funcionarios;
    }

    public static void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        Central.funcionarios = funcionarios;
    }

    public static Cliente verificarLoginCliente(String login, String senha) {
        for (Cliente c : getClientes()) {
            if (c.getLogin().equals(login) && c.getSenha().equals(senha)) {
                return c;
            }
        }
        return null;

    }

    public static Funcionario verificarLoginFuncionario(String login, String senha) {
        for (Funcionario f : getFuncionarios()) {
            if (f.getLogin().equals(login) && f.getSenha().equals(senha)) {
                return f;
            }
        }
        return null;
    }

    public static boolean verificarEstoque(Livro livro, int quantidadeDesejada) {
        for (Livro l : getLivros()) {
            if (l.getNome().equalsIgnoreCase(livro.getNome()) && l.getQuantidade() >= quantidadeDesejada) {
                return true;
            }
        }
        return false;
    }

    public static void adicionarCompra(Compra compra) {
        getCompras().add(compra);
        Central.gravarComprasXML(getCompras());
    }

    public static Livro consultarLivro(String nomeDoLivro) {
        for (Livro l : getLivros()) {
            if (l.getNome().equalsIgnoreCase(nomeDoLivro)) {
                return l;
            }

        }
        return null;

    }

    public static boolean removerLivro(Livro livro, int quantidadeDesejada) {
        for (Livro l : getLivros()) {
            if (verificarEstoque(l, quantidadeDesejada)) {
                    l.setQuantidade(l.getQuantidade() - quantidadeDesejada);
                    Central.gravarLivrosXML(getLivros());
                    return true;
                }
            }
        
        return false;
    }

    public static boolean removerCadastroLivro(String nome) {
        for (Livro l : getLivros()) {
            if (l.getNome().equalsIgnoreCase(nome)) {
                getLivros().remove(l);
                Central.gravarLivrosXML(getLivros());
                return true;

            }
        }
        return false;
    }

    public static boolean adicionarLivro(Livro livro) {
        
        for (Livro l : getLivros()) {
            if (l.getNome().equalsIgnoreCase(livro.getNome())) {
                l.setQuantidade(l.getQuantidade() + livro.getQuantidade());
                Central.gravarLivrosXML(getLivros());                               
                return true;
            }
        }
        
        getLivros().add(livro);
        Central.gravarLivrosXML(getLivros());
        return true;
       
    }

    public static boolean cadastrarCliente(Cliente cliente) {
        boolean existe = false;
        for (Cliente c : getClientes()) {
            if (cliente.getLogin().equals(c.getLogin())) {
                existe = true;
                break;
            }
        }

        if (!existe) {
            getClientes().add(cliente);

            Central.gravarClientesXML(getClientes());
        }
        return !existe;
    }

    public static boolean excluirCliente(Cliente cliente) {
        for (Cliente c : getClientes()) {
            if (cliente.getLogin().equals(c.getLogin())) {
                getClientes().remove(c);
                Central.gravarClientesXML(getClientes());
                return true;
            }
        }
        return false;
    }

    public static boolean cadastrarFuncionario(Funcionario funcionario) {
        boolean existe = false;
        for (Funcionario f : getFuncionarios()) {
            if (funcionario.getLogin().equals(f.getLogin())) {
                existe = true;
                break;
            }
        }

        if (!existe) {
            getFuncionarios().add(funcionario);
            Central.gravarFuncionariosXML(getFuncionarios());
        }
        return !existe;
    }

    public static boolean excluirFuncionario(Funcionario funcionario) {
        for (Funcionario f : getFuncionarios()) {
            if (funcionario.getLogin().equals(f.getLogin())) {
                getFuncionarios().remove(f);
                Central.gravarFuncionariosXML(getFuncionarios());
                return true;
            }
        }
        return false;

    }

    private static void gravarClientesXML(ArrayList<Cliente> clientes) {

        XStream xStream = new XStream(new DomDriver());
        xStream.alias("Clientes", List.class);
        xStream.alias("Cliente", Cliente.class);

        File arquivo = new File("Banco de Dados XML/clientes.xml");
        FileOutputStream gravar;
        try {
            gravar = new FileOutputStream(arquivo);
            gravar.write(xStream.toXML(clientes).getBytes());
            gravar.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static void gravarFuncionariosXML(ArrayList<Funcionario> funcionarios) {

        XStream xStream = new XStream(new DomDriver());
        xStream.alias("Funcionarios", List.class);
        xStream.alias("Funcionario", Funcionario.class);

        File arquivo = new File("Banco de Dados XML/funcionarios.xml");
        FileOutputStream gravar;
        try {
            gravar = new FileOutputStream(arquivo);
            gravar.write(xStream.toXML(funcionarios).getBytes());
            gravar.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static void gravarComprasXML(ArrayList<Compra> compras) {
        XStream xStream = new XStream(new DomDriver());
        xStream.alias("Compras", List.class);
        xStream.alias("Compra", Compra.class);

        File arquivo = new File("Banco de Dados XML/compras.xml");
        FileOutputStream gravar;
        try {
            gravar = new FileOutputStream(arquivo);
            gravar.write(xStream.toXML(compras).getBytes());
            gravar.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static void gravarLivrosXML(ArrayList<Livro> livros) {

        XStream xStream = new XStream(new DomDriver());
        xStream.alias("Livros", List.class);
        xStream.alias("Livro", Livro.class);

        File arquivo = new File("Banco de Dados XML/livros.xml");
        FileOutputStream gravar;
        try {
            gravar = new FileOutputStream(arquivo);
            gravar.write(xStream.toXML(livros).getBytes());
            gravar.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static ArrayList<Cliente> lerClientesXML() {
        try {
            XStream xStream = new XStream(new DomDriver());
            xStream.alias("Clientes", List.class);
            xStream.alias("Cliente", Cliente.class);
            xStream.processAnnotations(Cliente.class);

            ArrayList<Cliente> listaClientes;
            try (BufferedReader input = new BufferedReader(new FileReader("Banco de Dados XML/clientes.xml"))) {
                listaClientes = (ArrayList) xStream.fromXML(input);
            }
            return listaClientes;

        } catch (IOException ex) {
            gravarClientesXML(getClientes());
        }
        return new ArrayList<>();
    }

    private static ArrayList<Compra> lerComprasXML() {
        try {
            XStream xStream = new XStream(new DomDriver());
            xStream.alias("Compras", List.class);
            xStream.alias("Compra", Compra.class);
            xStream.processAnnotations(Compra.class);

            ArrayList<Compra> listaCompras;
            try (BufferedReader input = new BufferedReader(new FileReader("Banco de Dados XML/compras.xml"))) {
                listaCompras = (ArrayList) xStream.fromXML(input);
            }
            return listaCompras;

        } catch (IOException ex) {
            gravarComprasXML(getCompras());
        }
        return new ArrayList<>();
    }

    private static ArrayList<Funcionario> lerFuncionariosXML() {
        try {
            XStream xStream = new XStream(new DomDriver());
            xStream.alias("Funcionarios", List.class);
            xStream.alias("Funcionario", Funcionario.class);
            xStream.processAnnotations(Funcionario.class);

            ArrayList<Funcionario> listaFuncionarios;
            try (BufferedReader input = new BufferedReader(new FileReader("Banco de Dados XML/funcionarios.xml"))) {
                listaFuncionarios = (ArrayList) xStream.fromXML(input);
            }
            return listaFuncionarios;

        } catch (IOException ex) {
            gravarFuncionariosXML(getFuncionarios());
        }
        return new ArrayList<>();
    }

    private static ArrayList<Livro> lerLivrosXML() {
        try {
            XStream xStream = new XStream(new DomDriver());
            xStream.alias("Livros", ArrayList.class);
            xStream.alias("Livro", Livro.class);
            xStream.processAnnotations(Livro.class);

            ArrayList<Livro> listaLivros;
            try (BufferedReader input = new BufferedReader(new FileReader("Banco de Dados XML/livros.xml"))) {
                listaLivros = (ArrayList) xStream.fromXML(input);
            }
            return listaLivros;

        } catch (IOException ex) {
            gravarLivrosXML(getLivros());
        }
        return new ArrayList<>();
    }

}
