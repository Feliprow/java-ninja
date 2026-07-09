package com.feliprow.nivelintermediario.exercicios.ex003;

public class Main {
    static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(100);
        contaCorrente.tipoConta = TipoConta.CORRENTE;
        contaCorrente.consultarSaldo();
        contaCorrente.depositar(50);
        contaCorrente.consultarSaldo();

        System.out.println();
        ContaPoupanca contaPoupanca = new ContaPoupanca(100, TipoConta.POUPANCA); // Instanciando pelo construtor com sobrecarga
        contaPoupanca.consultarSaldo();
        contaPoupanca.depositar(10);
        contaPoupanca.consultarSaldo();
        System.out.println();

        BancoKonoha bancoKonoha = new BancoKonoha();
        bancoKonoha.transacao(contaCorrente, contaPoupanca, 5);

        contaPoupanca.consultarSaldo();

        contaCorrente.consultarSaldo();




    }
}
