package com.feliprow.nivelintermediario.exercicios.ex003;

public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    public ContaPoupanca(double saldo, TipoConta tipoConta) {
        super(saldo, tipoConta);
    }

    @Override
    public void depositar(double valor) {
        double custo = valor * 0.01;
        System.out.printf("Será depositado: R$%.2f com R$%.2f de custo\n" , (valor - custo) , custo);
        saldo += (valor - custo);
    }


}
