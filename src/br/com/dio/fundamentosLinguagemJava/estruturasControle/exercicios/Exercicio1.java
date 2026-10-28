package br.com.dio.fundamentosLinguagemJava.estruturasControle.exercicios;

import java.util.Scanner;

public class Exercicio1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um numero: ");
        int escolha = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.printf("%s * %s = %s\n", escolha, i, escolha * i);
        }
    }
}
