package br.com.dio.fundamentosLinguagemJava;

import java.util.Scanner;

public class Main3 {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        float valor1 = scanner.nextFloat();

        System.out.println("Informe o segundo numero: ");
        float valor2 = scanner.nextFloat();

        System.out.printf("%s + %s = %s\n", valor1, valor2, valor1 + valor2);
        System.out.printf("%s - %s = %s\n", valor1, valor2, valor1 - valor2);
        System.out.printf("%s * %s = %s\n", valor1, valor2, valor1 * valor2);
        System.out.printf("%s divide com %s com resto %s\n", valor1, valor2, valor1 % valor2);
        System.out.printf("%s / %s = %s\n", valor1, valor2, valor1 / valor2);
    }
}
