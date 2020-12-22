package entidades;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Funcionario")
public class Funcionario extends Usuario {

    public Funcionario(String login, String senha) {
        super(login, senha);

    }

    public boolean cadastrarLivro(String nome, String autor, String editora, double preco, int quantidade) {
        if (nome.equals("") || autor.equals("") || editora.equals("") || preco == 0.00 || quantidade <= 0) {
            return false;
        } else {
            Livro livro = new Livro(nome, autor, editora, preco, quantidade);
            return Central.adicionarLivro(livro);
        }
    }


}
