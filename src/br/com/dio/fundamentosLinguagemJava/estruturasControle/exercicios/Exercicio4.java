package br.com.dio.fundamentosLinguagemJava.estruturasControle.exercicios;

import java.util.Scanner;

public class Exercicio4 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o numero inicial");
        int numeInicial = scanner.nextInt();


        while (true) {
            System.out.println("escolha o proximo número: ");
            int numProx = scanner.nextInt();

            if (numProx < numeInicial) {
                continue;
            }

            if (numProx % numeInicial != 0) {
                break;
            }
        }
    }
}
