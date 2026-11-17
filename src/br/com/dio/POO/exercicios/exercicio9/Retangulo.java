package br.com.dio.POO.exercicios.exercicio9;

public class Retangulo implements Calculador{

    private double base;
    private double altura;

    @Override
    public double calcularArea() {
        return base * altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
}
