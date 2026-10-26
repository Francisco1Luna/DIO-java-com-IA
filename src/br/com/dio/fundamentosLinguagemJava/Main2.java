package br.com.dio.fundamentosLinguagemJava;

import java.util.Scanner;

public class Main2 {
    static void main(String[] args) {
        //aula sobre operadores

        var scanner = new Scanner(System.in);
        System.out.print("quanto é 2 + 2? :");
        var resultado = scanner.nextInt();
        System.out.printf("O resultado é 4, você acertou? (%s)", resultado == 4); //retorna true caso certo

        System.out.println("");
        System.out.println("quantos anos vc tem? :");
        int idade = scanner.nextInt();
        System.out.println("vc é emancipado? (1 para sim ; 2 para nao) :");
        int checador = scanner.nextInt();
        if (idade >= 18 || (checador == 1 && idade >= 16)) {
            System.out.println("você pode dirigir");
        } else {
            System.out.println("você nao pode dirigir");
        }



    }
}
