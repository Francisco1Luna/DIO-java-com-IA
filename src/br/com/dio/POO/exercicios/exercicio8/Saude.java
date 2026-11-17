package br.com.dio.POO.exercicios.exercicio8;

public class Saude implements Tributador{

    @Override
    public double calcularTributo(double valor) {
        return valor * 0.015;
    }

}
