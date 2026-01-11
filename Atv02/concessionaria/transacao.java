package Atv02.concessionaria;

public class transacao {
    private String cliente;
    private String carro;
    private double valor;

    public transacao(String cliente, String carro, double valor) {
        this.cliente = cliente;
        this.carro = carro;
        this.valor = valor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}