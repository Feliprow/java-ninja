package com.feliprow.nivelintermediario.sobrecargademetodos;

public class Ninja {
    String nome;

    public Ninja(String nome) {
        this.nome = nome;
    }

    void ataque() {
        System.out.println(nome + " atacou.");
    }

    void ataque(int kunai) {
        System.out.println(nome + " atacou com " + kunai + " kunai");
    }

    void ataque(int kunai, int shuriken) {
        System.out.println(nome + " atacou com " + kunai + " kunai e " + shuriken + " shuriken");
    }

    /* Para fazer a sobrecarga de métodos use:
     * tipos diferentes
     * quantidades diferentes de parâmetros
     * tipos diferentes + ordem diferente */

    //void ataque(int shuriken, int kunai){} ERRO!! TIPOS IGUAIS

    void ataque(int shuriken, float chakra) {
        System.out.println(nome + " atacou com " + shuriken + " shuriken com " + chakra + " de chakra");
    }


}
