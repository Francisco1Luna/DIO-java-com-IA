package br.com.dio.POO.exercicios.exercicio5;

public class Gerente extends Usuarios{

    Vendedor vendedor;
    Atendente atendente;

    public Gerente(String nome, String email, String senha, Vendedor vendedor, Atendente atendente) {
        super(nome, email, senha,true);
        this.vendedor = vendedor;
        this.atendente = atendente;

    }

    public void gerarRelatorio() {
        System.out.println("Gerando relatorios...");
    }

    @Override
    public void consultarVendas() {
        System.out.println("qtdVendas atual: " + this.vendedor.getQtdVendas() + " " + "Caixa atual: " + this.atendente.getValorCaixa());
    }


}
