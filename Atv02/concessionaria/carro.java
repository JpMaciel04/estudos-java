package Atv02.concessionaria;

import java.util.Date;

public class carro {
    private String marca;
    private String nome;
    private Date anoFrabicacao;
    private double valor;

    public carro(String marca, String nome, Date anoFrabicacao, double valor) {
        this.marca = marca;
        this.nome = nome;
        this.anoFrabicacao = anoFrabicacao;
        this.valor = valor;
    }
    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome(){
        return nome;
    }

    public void  setNome(String nome){
        this.nome = nome;
    }

    public Date getAnoFrabicacao() {
        return anoFrabicacao;
    }

    public void setAnoFrabicacao(Date anoFrabicacao) {
        this.anoFrabicacao = anoFrabicacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}