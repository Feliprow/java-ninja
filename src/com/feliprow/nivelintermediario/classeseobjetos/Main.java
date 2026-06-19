package com.feliprow.nivelintermediario.classeseobjetos;

public class Main {
    public static void main(String[] args) {

        // Criando objeto ninja1
        Ninja ninja1 = new Ninja();

        // Dando valores aos atributos do objeto Ninja
        ninja1.nome = "Naruto";
        ninja1.aldeia = "Aldeia da folha";
        ninja1.idade = 16;

        System.out.println(ninja1.nome);

        Ninja kakashi = new Ninja();

        kakashi.nome = "Kakashi Hatake";
        kakashi.aldeia = "Aldeia da folha";
        kakashi.idade = 30;

        System.out.println(kakashi.toString());
    }
}
