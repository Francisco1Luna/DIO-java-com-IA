package br.com.dio.fundamentosLinguagemJava.exercicios;

import java.util.Scanner;

public class Exercicio4 {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("digite o nome da primeira pessoa: ");
        String nome1 = scanner.nextLine();

        System.out.print("digite a idade da primeira pessoa: ");
        int idade1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("digite o nome da segunda pessoa: ");
        String nome2 = scanner.nextLine();

        System.out.print("digite a idade da segunda pessoa: ");
        int idade2 = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("O nome da primeira pessoa é %s e da segunda é %s, e a diferenca de idade é de %s anos", nome1, nome2, Math.abs(idade1-idade2));


    }
}
