package com.feliprow.nivelintermediario.exercicios.ex003;

public abstract class ContaBancaria implements Conta {
    double saldo;
    TipoConta tipoConta;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(double saldo, TipoConta tipoConta) {
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    @Override
    public void consultarSaldo() {
        System.out.printf("O saldo atual é de R$%.2f\n", saldo);
    }

    public abstract void depositar(double valor);
}
