package br.com.dio.POO.exercicios.exercicio6;

public abstract class Relogio {

    private int hora;
    private int minuto;
    private int segundo;

    public Relogio(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    protected Relogio() {
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public String consultarHora() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public abstract void sincronizar(Relogio outroRelogio);
}
