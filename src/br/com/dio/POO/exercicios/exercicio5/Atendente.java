package br.com.dio.POO.exercicios.exercicio5;

public class Atendente extends Usuarios{

    private double valorCaixa;

    public Atendente(String nome, String email, String senha, double valorCaixa) {
        this.valorCaixa = valorCaixa;
        super(nome, email, senha, false);
    }

    public double getValorCaixa() {
        return valorCaixa;
    }

    public void setValorCaixa(double valorCaixa) {
        this.valorCaixa = valorCaixa;
    }

    public void receberPagamento(double valor) {
        this.valorCaixa += valor;
    }

    public void fecharCaixa() {
        System.out.println("fechando caixa");
    }
}
