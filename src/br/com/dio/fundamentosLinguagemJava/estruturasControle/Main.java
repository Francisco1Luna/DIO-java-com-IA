package br.com.dio.fundamentosLinguagemJava.estruturasControle;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Diga sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("você pode dirigir");
        } else {
            System.out.println("você nao pode dirigir");
        }
    }
}
