package br.com.dio.fundamentosLinguagemJava.exercicios;

import java.util.Scanner;

public class Exercicio2 {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("insira o tamanho do lado: ");

        int aresta = scanner.nextInt();

        int area = aresta * aresta;

        System.out.printf("O quadrado de lado lado %s possui área = %s", aresta, area);

    }
}
