package com.feliprow.nivelintermediario.polimorfismo;

public class Main {
    public static void main(String[] args){

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke";
        sasuke.habilidadeEspecial();

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto";
        naruto.habilidadeEspecial();

        Ninja generico = new Ninja();
        generico.nome = "Ninja generico";
        generico.habilidadeEspecial();
    }
}
