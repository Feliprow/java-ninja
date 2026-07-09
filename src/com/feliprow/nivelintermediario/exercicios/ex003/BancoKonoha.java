package com.feliprow.nivelintermediario.exercicios.ex003;

public class BancoKonoha {

    public void transacao(ContaBancaria origem, ContaBancaria destino, double valor) {
        System.out.printf("Seŕa transferido o valor de R$%.2f\n", valor);
        origem.saldo -= valor;
        destino.saldo += valor;
        System.out.printf("O valor de R$%.2f, foi transferido da %s para a %s\n", valor, origem.tipoConta, destino.tipoConta);
    }

    public void transacao(ContaBancaria origem, ContaBancaria destino, double valor, String descricao) {
        System.out.printf("Seŕa transferido o valor de R$%.2f\n", valor);
        origem.saldo -= valor;
        destino.saldo += valor;
        System.out.printf("O valor de R$%.2f, foi transferido da %s para a %s\n", valor, origem.tipoConta, destino.tipoConta);
        System.out.println(descricao);
    }
}
