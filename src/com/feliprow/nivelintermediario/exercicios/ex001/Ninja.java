package com.feliprow.nivelintermediario.exercicios.ex001;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDeDificuldade;
    String statusMissao;

    public void mostrarInformacao(){
        System.out.printf("""
                Nome: %s
                Idade: %d
                Missão: %s
                Nível de dificuldade: %s
                Status da missão: %s
                """, nome, idade, missao, nivelDeDificuldade, statusMissao);
    }
}
