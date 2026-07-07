package com.feliprow.nivelintermediario.superesubclasses;

public class Ninja {
    String nome;
    int idade;
    String aldeia;

    // Para referênciar o próprio atributo -> this. na super classe
    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }
}
