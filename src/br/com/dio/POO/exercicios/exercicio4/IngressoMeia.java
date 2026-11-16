package br.com.dio.POO.exercicios.exercicio4;

public class IngressoMeia extends Ingresso{

    private double valorMeia;

    public IngressoMeia(double valorBase, String nomeFilme, String linguagem) {

        this.valorMeia = valorBase / 2;
        super(valorBase, nomeFilme, linguagem);
    }

    public double getValorMeia() {
        return valorMeia;
    }

    public void setValorMeia(double valorMeia) {
        this.valorMeia = valorMeia;
    }

    @Override
    public double preco() {
        return this.getValorMeia();
    }

}
