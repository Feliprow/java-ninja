package com.feliprow.nivelintermediario.construtores;

public class Hokages {
    String nome;
    int idade;
    boolean vivoOuNao;

    // All args constructor
    public Hokages(String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }

    public Hokages(int idade) {
        this.idade = idade;
    }

    public Hokages() {
    }
}
