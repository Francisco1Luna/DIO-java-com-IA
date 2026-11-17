package br.com.dio.POO.exercicios.exercicio9;

public class Circulo implements Calculador{

    private double raio;

    @Override
    public double calcularArea() {
        return 3.14 * (raio * raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }
}
