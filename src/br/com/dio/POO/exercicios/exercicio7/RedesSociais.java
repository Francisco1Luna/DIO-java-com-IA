package br.com.dio.POO.exercicios.exercicio7;

public class RedesSociais implements Enviador {

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando via Redes Sociais... " + mensagem);

    }

}
