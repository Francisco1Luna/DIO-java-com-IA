package br.com.dio.POO.exercicios.exercicio1;

public class ContaBancaria {

    private float saldo;
    private float chequeEspecial;
    private float limiteConta;
    private float chequeEspecialUsado;

    public ContaBancaria(float saldoInicial) {
        this.saldo = saldoInicial;
        if (saldo <= 500) {
            this.chequeEspecial = 50;
        } else {
            this.chequeEspecial = (float) saldo * 0.5f;
        }
        this.limiteConta = saldo + chequeEspecial;
        this.chequeEspecialUsado = 0;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(float chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public float getLimiteConta() {
        return limiteConta;
    }

    public void setLimiteConta(float limiteConta) {
        this.limiteConta = limiteConta;
    }

    public float getChequeEspecialUsado() {
        return chequeEspecialUsado;
    }

    public void setChequeEspecialUsado(float chequeEspecialUsado) {
        this.chequeEspecialUsado = chequeEspecialUsado;
    }

    public void sacarDinheiro(float quantia) {
        if (this.saldo + this.chequeEspecial >= quantia) {
            if (this.saldo >= quantia) {
                this.saldo = saldo - quantia;
            } else {
                float valorUsadoCheque = quantia - this.saldo;
                this.chequeEspecialUsado = chequeEspecialUsado + valorUsadoCheque;
                this.saldo = 0;
                this.chequeEspecial = chequeEspecial - valorUsadoCheque;
            }

        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void depositarDinheiro(float quantia) {

        if (this.chequeEspecialUsado == 0) {
            this.saldo = saldo + quantia;

        } else {

            if (quantia <= this.chequeEspecialUsado) {
            this.chequeEspecialUsado = chequeEspecialUsado - quantia;
            this.chequeEspecial = chequeEspecial + quantia;

            } else {
                float valorSobresalente = quantia - chequeEspecialUsado;
                this.chequeEspecial = chequeEspecial + chequeEspecialUsado;
                this.chequeEspecialUsado = 0;
                this.saldo = saldo + valorSobresalente;
                cobrarTaxaCheque();
            }
        }


    }

    public void consultarSaldo() {
        System.out.println(this.getSaldo());
    }

    public void consultarCheque() {
        System.out.println(this.getChequeEspecial());
    }

    public void pagarBoleto(float valorBoleto) {
        if (this.saldo + this.chequeEspecial >= valorBoleto ) {
            if (this.saldo >= valorBoleto){
                this.saldo = saldo - valorBoleto;
            } else {
                float valorUsadoCheque = valorBoleto - this.saldo;
                this.chequeEspecialUsado = chequeEspecialUsado + valorUsadoCheque;
                this.saldo = 0;
                this.chequeEspecial = chequeEspecial - valorUsadoCheque;
            }
        } else {
            System.out.println("saldo insuficiente");
        }
    }

    public void cobrarTaxaCheque() {
        if (this.chequeEspecialUsado > 0 && this.saldo > this.chequeEspecialUsado * 0.2f) {
            this.saldo = saldo - chequeEspecialUsado * 0.2f ;
        }
    }
}