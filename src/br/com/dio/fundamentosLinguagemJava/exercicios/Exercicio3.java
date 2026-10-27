package br.com.dio.fundamentosLinguagemJava.exercicios;

import java.util.Scanner;

public class Exercicio3 {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a altura do retangulo: ");
        int altura = scanner.nextInt();
        System.out.print("Insira a largura: ");
        int largura = scanner.nextInt();

        System.out.printf("O retangulo de largura %s e altura %s tem area = %s", largura, altura, largura * altura);
    }
}
