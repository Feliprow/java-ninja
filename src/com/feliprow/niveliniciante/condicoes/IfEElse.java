package com.feliprow.niveliniciante.condicoes;

public class IfEElse {
    static void main(String[] args) {
        /*
         * IF & Else
         * descobrir como funcionam as condicionais
         * */

        String nome = "Naruto Uzumaki";
        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 1;

        // se (condição) {faça isso}
        if (numeroDeMissoes >= 10) {
            System.out.println("O " + nome + " esta pronto para passar de nível!");
        } else {
            System.out.println("O " + nome + " não completou o número de missões suficientes para passar de nível.");
        }
//        -------------- testando -------------

        System.out.println("-------------------");
        nome = "Kankuro";
        idade = 17;
        numeroDeMissoes = 10;

        if (numeroDeMissoes >= 20 && idade >= 18) {
            System.out.println(nome + " se tornou um Chunin");
        } else if (numeroDeMissoes >= 10 && idade >= 10) {
            System.out.println(nome + " se tornou um Genin");
        } else {
            System.out.println(nome + " ainda precisa treinar mais");
        }
    }
}
