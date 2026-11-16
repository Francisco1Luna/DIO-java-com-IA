package br.com.dio.POO.exercicios.exercicio6;

public class RelogioAmericano extends Relogio{

    public RelogioAmericano(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }

    @Override
    public String consultarHora() {
        if (this.getHora() > 12) {
            return String.format("%02d PM:%02d:%02d",this.getHora() - 12, getMinuto(), getSegundo());
        } else {
            return String.format("%02d AM:%02d:%02d",this.getHora() , getMinuto(), getSegundo());
        }

    }

    @Override
    public void sincronizar(Relogio outroRelogio) {
        this.setHora(outroRelogio.getHora());
        this.setMinuto(outroRelogio.getMinuto());
        this.setSegundo(outroRelogio.getSegundo());
    }

}

