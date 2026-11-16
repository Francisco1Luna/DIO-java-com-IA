package br.com.dio.POO.exercicios.exercicio4;

public class IngressoFamilia extends Ingresso{

    private int qtdMembros;
    private double valorIngressoFamilia;

    public IngressoFamilia(double valorBase, String nomeFilme, String linguagem, int qtdMembros) {
        this.qtdMembros = qtdMembros;
        if (qtdMembros > 3) {
            this.valorIngressoFamilia = ((valorBase * qtdMembros) * 0.95);
        } else {
            this.valorIngressoFamilia = valorBase * qtdMembros;
        }
        super(valorBase, nomeFilme, linguagem);
    }

    public int getQtdMembros() {
        return qtdMembros;
    }

    public void setQtdMembros(int qtdMembros) {
        this.qtdMembros = qtdMembros;
    }


    public double getValorIngressoFamilia() {
        return valorIngressoFamilia;
    }

    public void setValorIngressoFamilia(double valorIngressoFamilia) {
        this.valorIngressoFamilia = valorIngressoFamilia;
    }

    @Override
    public double preco() {
        return this.getValorIngressoFamilia();
    }
}
