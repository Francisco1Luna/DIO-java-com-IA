package br.com.dio.POO.exercicios.exercicio2;

public class Carro {

    private int velocidade;
    private int marcha;
    private boolean ligado;

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligarCarro() {
        if (!this.isLigado()) {
            this.ligado = true;
        } else {
            System.out.println("ja esta ligado");
        }
    }

    public void desligarCarro() {
        if (this.isLigado() && this.marcha == 0 && this.velocidade == 0) {
            this.ligado = false;
        } else {
            System.out.println("ja esta desligado");
        }
    }

    public void acelerar() {
        if (this.isLigado()) {
            this.velocidade += 1;
        } else {
            System.out.println("O carro esta desligado");
        }
    }

    public void freiar() {
        if (this.isLigado()) {
            this.velocidade -= 1;
        } else {
            System.out.println("O carro esta desligado");
        }
    }

    public void virar() {
        if (this.isLigado() && this.velocidade > 0 && this.velocidade < 41) {
            System.out.println("virando..");
        } else {
            System.out.println("O carro precisa estar ligado e com velocidade maior que 0 e menor que 41.");
        }
    }

    public void verificarVelocidade() {
        if (this.isLigado()) {
            System.out.println("velocidade: " + this.velocidade);
        } else {
            System.out.println("O carro deve estar ligado");
        }
    }

    public void passarMarcha(int novaMarcha) {
        if (this.isLigado()) {
           if (novaMarcha == this.marcha + 1 || novaMarcha == this.marcha - 1) {
               if (novaMarcha >= 0 && novaMarcha <= 6) {

                   int velocidadeMinima = (novaMarcha == 0) ? 0 : (novaMarcha - 1) * 20 + 1;
                   int velocidadeMaxima = novaMarcha * 20;

                   if (this.velocidade >= velocidadeMinima && this.velocidade <= velocidadeMaxima) {
                       this.marcha = novaMarcha;
                   } else {
                       System.out.println("velocidade nao permite trocar de faixa");
                   }
               } else {
                   System.out.println("marcha invalida");
               }
           } else {
               System.out.println("a marcha so pode ser alterada para uma depois ou uma antes");
           }
        } else {
            System.out.println("o carro deve estar ligado");
        }
    }
}
