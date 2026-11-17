package br.com.dio.POO.exercicios.exercicio9;

public class Quadrado implements Calculador{

    private double lado;

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }
}
