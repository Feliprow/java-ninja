package com.feliprow.nivelintermediario.exercicios.ex003;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public ContaCorrente(double saldo, TipoConta tipoConta) {
        super(saldo, tipoConta);
    }

    @Override
    public void depositar(double valor) {
        System.out.printf("Será depositado: R$%.2f\n" , valor);
        saldo += valor;
    }

}
