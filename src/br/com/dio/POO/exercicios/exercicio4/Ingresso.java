package br.com.dio.POO.exercicios.exercicio4;

public class Ingresso {

    private double valorBase;
    private String nomeFilme;
    private String linguagem;

    public Ingresso(double valorBase, String nomeFilme, String linguagem) {
        this.valorBase = valorBase;
        this.nomeFilme = nomeFilme;
        this.linguagem = linguagem;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }


    public double preco() {
        return this.getValorBase();
    }

}
