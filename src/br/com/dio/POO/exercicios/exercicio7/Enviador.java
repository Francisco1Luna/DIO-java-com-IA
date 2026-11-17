package br.com.dio.POO.exercicios.exercicio7;

public interface Enviador {

    void enviarMensagem(String mensagem);

    //implementacao da lambda(extra)
    Enviador telegram = mensagem -> System.out.println("Enviando via telegram " + mensagem);

}
