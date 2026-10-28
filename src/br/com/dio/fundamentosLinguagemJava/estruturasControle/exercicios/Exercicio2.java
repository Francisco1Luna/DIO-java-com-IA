package br.com.dio.fundamentosLinguagemJava.estruturasControle.exercicios;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Exercicio2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta = "";

        System.out.println("Insira sua altura em M: ");
        float altura = scanner.nextFloat();

        System.out.println("Insira seu peso em kg: ");
        float peso = scanner.nextFloat();

        float imc = peso/(altura * altura);

        if (imc <= 18.5) {
            resposta = "Abaixo do peso";
        } else if (imc > 18.5 && imc < 25) {
            resposta = "Peso ideal";
        } else if (imc >= 25 && imc < 30) {
            resposta = "Levemente acima do peso";
        } else if (imc >= 30 && imc < 35) {
            resposta = "Obesidade grau 1";
        } else if (imc >= 35 && imc < 40) {
            resposta = "Obesidade grau 2";
        } else {
            resposta = "Obesidade 3 (morbida)";
        }
        System.out.println(resposta);
    }
}
