package br.com.dio.POO.exercicios.exercicio8;

public class Alimentacao implements Tributador{

    @Override
    public double calcularTributo(double valor) {
    return valor * 0.01;
    }

}
