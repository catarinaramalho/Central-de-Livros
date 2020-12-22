package entidades;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Compra")
public class Compra {

    private String data;
    private String livrosComprados;
    private double total;
    private String cliente;

    public Compra(String data, String livrosComprados, double total, String cliente) {
        this.data = data;
        this.livrosComprados = livrosComprados;
        this.total = total;
        this.cliente = cliente;
    }

    public double getTotal() {
        return this.total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCliente() {
        return this.cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getLivrosComprados() {
        return this.livrosComprados;
    }

    public void setLivrosComprados(String livrosComprados) {
        this.livrosComprados = livrosComprados;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        String texto = "COMPRA:\n Livros comprados:\n" + livrosComprados + "\nTotal: " + total + "\nData da compra:" + data + "\nCliente:" + cliente;
        return texto;
    }

}
