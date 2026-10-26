package br.com.dio.fundamentosLinguagemJava;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome e idade: ");

        String nome = scanner.nextLine();
        int idade = scanner.nextInt();

        System.out.println("Seu nome é: " + nome + "e sua idade é :" + idade);
    }
}
