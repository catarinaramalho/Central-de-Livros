package entidades;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@XStreamAlias("Cliente")
public class Cliente extends Usuario {

    private ArrayList<Livro> carrinho;
    private ArrayList<Integer> quantidadesRetiradas;

    public Cliente(String login, String senha) {
        super(login, senha);
        this.carrinho = new ArrayList<>();
        this.quantidadesRetiradas = new ArrayList<>();

    }

    public ArrayList<Livro> getCarrinho() {
        return this.carrinho;
    }

    public void setCarrinho(ArrayList<Livro> carrinho) {
        this.carrinho = carrinho;
    }

    public ArrayList<Integer> getQuantidadesRetiradas() {
        return this.quantidadesRetiradas;
    }

    public void setQuantidadesRetiradas(ArrayList<Integer> quantidadesRetiradas) {
        this.quantidadesRetiradas = quantidadesRetiradas;
    }

    public boolean adicionarCarrinho(String nomeDoLivro, int quantidadeDesejada) {
        Livro livro = Central.consultarLivro(nomeDoLivro);
        if (this.getCarrinho() == null && this.getQuantidadesRetiradas() == null) {
            this.carrinho = new ArrayList<>();
            this.quantidadesRetiradas = new ArrayList<>();
        }
        for (int i = 0; i < getCarrinho().size(); i++) {
            if (livro != null && getCarrinho().get(i).getNome().equalsIgnoreCase(livro.getNome())) {
                getQuantidadesRetiradas().set(i, (getQuantidadesRetiradas().get(i) + quantidadeDesejada));
                return true;
            }
        }
        
        if (livro != null && Central.verificarEstoque(livro, quantidadeDesejada)) {
            this.getCarrinho().add(livro);
            this.getQuantidadesRetiradas().add(quantidadeDesejada);
            return true;
        }
        return false;

    }

    public boolean editarCarrinho(Livro livro, int quantidadeDesejada) {
        for (int i = 0; i < getCarrinho().size(); i++) {
            if (livro != null && getCarrinho().get(i).getNome().equalsIgnoreCase(livro.getNome())) {
                getQuantidadesRetiradas().set(i, quantidadeDesejada);
                return true;
            }
        }
        return false;
    }

    public boolean excluirCarrinho(Livro livro) {
        for (int i = 0; i < getCarrinho().size(); i++) {
            if (livro != null && getCarrinho().get(i).getNome().equalsIgnoreCase(livro.getNome())) {
                getCarrinho().remove(livro);
                getQuantidadesRetiradas().remove(getQuantidadesRetiradas().get(i));
                return true;
            }
        }
        return false;
    }

    public boolean comprar(Livro livro, int quantidadeDesejada) {
        if (Central.removerLivro(livro, quantidadeDesejada)) {
            return true;
        }
        return false;
    }

    public void efetuarCompra() {
        int i;
        double total = 0.00;
        String registroCompras = "";
        for (i = 0; i < getCarrinho().size(); i++) {
            registroCompras = registroCompras + getCarrinho().get(i).getNome() + "(" + getQuantidadesRetiradas().get(i) + ") | ";
            total = total + getCarrinho().get(i).getPreco() * getQuantidadesRetiradas().get(i);
            comprar(getCarrinho().get(i), getQuantidadesRetiradas().get(i));
        }

        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String time = formatar.format(data);
        gerarNotaFiscal(time, total);
        Compra compra = new Compra(time, registroCompras, total, Central.getClienteLogado().getLogin());
        Central.adicionarCompra(compra);
        getCarrinho().clear();
        getQuantidadesRetiradas().clear();

    }

    public void gerarNotaFiscal(String time, double total) {
        File dir = new File(".");
        File arquivo;
        String caminho = "/Notas Fiscais/NotaFiscal" + Central.getClienteLogado().getLogin() + ".txt";
        int cont = 0;
        try {
            arquivo = new File(dir.getCanonicalFile() + caminho);
            while (arquivo.exists()) {
                cont++;
                arquivo = new File(dir.getCanonicalFile() + "/Notas Fiscais/NotaFiscal" + Central.getClienteLogado().getLogin() + cont + ".txt");
            }

            FileWriter fw = new FileWriter(arquivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("____________________________________");
            bw.newLine();
            bw.write("         CENTRAL DE LIVROS          ");
            bw.newLine();
            bw.newLine();
            bw.write("CNPJ: 02.777.444/8888-55");
            bw.newLine();
            bw.newLine();
            bw.write("               CUPOM                ");
            bw.newLine();
            bw.write("Data/Hora: " + time);
            bw.newLine();
            bw.write("Cliente: " + Central.getClienteLogado().getLogin());
            bw.newLine();
            bw.write("------------------------------------");
            bw.newLine();
            bw.write("PRODUTO       QUANTIDADE       PREÇO");
            bw.newLine();
            bw.write("------------------------------------");
            bw.newLine();
            for (int i = 0; i < getCarrinho().size(); i++) {
                if (getCarrinho().get(i).getNome().length() > 10) {
                    String troca = "";
                    for (int c = 0; c <= 10; c++) {
                        troca = troca + getCarrinho().get(i).getNome().charAt(c);
                    }
                    troca = troca + "...";
                    while (troca.length() <= 18) {
                        troca = troca + " ";
                    }
                    bw.write(troca);

                }
                if (getCarrinho().get(i).getNome().length() < 10) {
                    String troca = getCarrinho().get(i).getNome();
                    while (troca.length() <= 18) {
                        troca = troca + " ";
                    }
                    bw.write(troca);
                }
                String quant = "" + getQuantidadesRetiradas().get(i);
                if (quant.length() >= 1) {
                    while (quant.length() <= 12) {
                        quant = quant + " ";
                    }
                    bw.write(quant);

                }

                bw.write("R$" + (int) getCarrinho().get(i).getPreco());
                bw.newLine();
            }
            bw.write("------------------------------------");
            bw.newLine();
            String to = "R$" + Double.toString(total);
            String t = "Total:";
            while (t.length() <= 35 - to.length()) {
                t = t + " ";
            }

            bw.write(t + to);

            bw.newLine();
            bw.newLine();
            bw.write("      OBRIGADO, VOLTE SEMPRE!");
            bw.newLine();
            bw.write("____________________________________");
            bw.newLine();
            bw.newLine();
            bw.newLine();

            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
