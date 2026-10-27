package br.com.dio.fundamentosLinguagemJava.exercicios;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exercicio1 {
    static void main(String[] args) {

        System.out.print("Insira seu nome: ");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();

        System.out.print("Insira seu ano de nascimento: ");

        LocalDate dataNascimento = LocalDate.parse(scanner.next());
        LocalDate dataAtual = LocalDate.now();

        long idade = ChronoUnit.YEARS.between(dataNascimento, dataAtual);

        System.out.printf("Ola %s! você tem %s anos! ", nome, idade);
    }
}
