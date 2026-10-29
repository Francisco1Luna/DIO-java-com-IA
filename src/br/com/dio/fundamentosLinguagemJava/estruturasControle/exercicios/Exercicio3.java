package br.com.dio.fundamentosLinguagemJava.estruturasControle.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        System.out.println("Insira um número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Insira outro numero maior que o anterior: ");
        int numero2 = scanner.nextInt();

        if (numero1 < numero2) {
            for (int i = numero1; i <= numero2; i ++) {
                if (i % 2 == 0) {
                    pares.add(i);
                } else {
                    impares.add(i);
                }
            }


            Collections.sort(pares, Collections.reverseOrder());
            Collections.sort(impares,Collections.reverseOrder());

            System.out.println("qual lista vc deseja ver? : ");
            String escolha = scanner.next();

            if (escolha.equalsIgnoreCase("par")) {
                System.out.println(pares);
            } else if (escolha.equalsIgnoreCase("impar")) {
                System.out.println(impares);
            }
        }
    }
}
