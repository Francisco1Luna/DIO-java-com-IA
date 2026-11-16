package br.com.dio.POO.exercicios.exercicio5;

public class Vendedor extends Usuarios{

    private int qtdVendas;

    public Vendedor(String nome, String email, String senha, int qtdVendas) {
        this.qtdVendas = qtdVendas;
        super(nome, email, senha, false);
    }

    public int getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    public void realizarVenda() {
        this.qtdVendas++;
    }

    @Override
    public void consultarVendas() {
        System.out.println("qtd Vendas atual: " + this.getQtdVendas());
    }
}
