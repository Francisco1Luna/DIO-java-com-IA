package br.com.dio.POO.exercicios.exercicio7;

public class Email implements Enviador{

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando via Email... " + mensagem);

    }

}
