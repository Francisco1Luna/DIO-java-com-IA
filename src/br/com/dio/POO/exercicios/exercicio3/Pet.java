package br.com.dio.POO.exercicios.exercicio3;

public class Pet {
    private String nomePet;
    private boolean limpo;

    public Pet(String nomePet) {
        this.nomePet = nomePet;
        this.limpo = false;
    }

    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public boolean isLimpo() {
        return limpo;
    }

    public void setLimpo(boolean limpo) {
        this.limpo = limpo;
    }
}
