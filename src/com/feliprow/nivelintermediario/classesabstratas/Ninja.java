package com.feliprow.nivelintermediario.classesabstratas;

// classes abstratas não podem ser instânciadas.
public abstract class Ninja {
    String nome;
    int idade;

    // metosos abstratos não podem ter corpos
    public abstract void substituicao();

    public Ninja(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
