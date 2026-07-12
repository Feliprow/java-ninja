package com.feliprow.nivelintermediario.exercicios.ex004;

public class Ninja {
    private String nome, vila;
    private int idade;

    public Ninja(String nome, int idade, String vila) {
        this.nome = nome;
        this.idade = idade;
        this.vila = vila;
    }

    public String getNome() {
        return nome;
    }

    public String getVila() {
        return vila;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "NINJA"+
                "\nnome: " + nome +
                "\nidade: " + idade +
                "\nvila: " + vila + "\n";
    }
}
