package com.feliprow.nivelintermediario.heranca;
public class
Ninja {
    String nome;
    int idade;
    String aldeia;
    int kunais;

    void jutsuSubstituicao(){
        System.out.println(nome + " fez o jutsu de substituição!");
    }

    void mostarKunais(){
        System.out.println(nome + " tem " + kunais + " kunais.");
    }

    int adicionarKunai(){
        System.out.println(nome + " coletou uma kunai.");
        return kunais++;
    }


}
