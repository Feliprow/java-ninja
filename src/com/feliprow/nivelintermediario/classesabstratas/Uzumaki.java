package com.feliprow.nivelintermediario.classesabstratas;

public class Uzumaki extends Ninja{
    public Uzumaki(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void substituicao() {
        System.out.println(nome + " se substituiu para um tronco.");
    }
}
