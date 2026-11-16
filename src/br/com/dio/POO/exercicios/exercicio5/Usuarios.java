package br.com.dio.POO.exercicios.exercicio5;

public abstract class Usuarios {

    private String nome;
    private String email;
    private String senha;
    private boolean admin;

    public Usuarios(String nome, String email, String senha, boolean admin) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.admin = admin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public void realizarLogin() {
        System.out.println("logando...");
    }
    public void realizarLogoff() {
        System.out.println("Deslogando...");
    }
    public void alterarDados() {
        System.out.println("Alterando dados...");
    }
    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
    }

    public void consultarVendas() {

    }
}
