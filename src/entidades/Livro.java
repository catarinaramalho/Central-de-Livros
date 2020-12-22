/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Livro")
public class Livro {

    private String nome;
    private String autor;
    private String editora;
    private double preco;
    private int quantidade;

    public Livro(String nome, String autor, String editora, double preco, int quantidade) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return this.editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Livro: Nome = " + nome + ", Autor = " + autor + ", Editora =" + editora + ", Preço =" + preco
                + ", Quantidade =" + quantidade + ".";
    }

}
