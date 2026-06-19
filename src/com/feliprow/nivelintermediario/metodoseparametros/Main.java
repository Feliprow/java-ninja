package com.feliprow.nivelintermediario.metodoseparametros;

public class Main {
    public static void main(String[] args) {

        Ninja sasuke = new Ninja();

        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 16;
        sasuke.aldeia = "Aldeia da folha";

        sasuke.jutsuSubsticuicao();

        Ninja naruto = new Ninja();

        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 16;
        naruto.aldeia = "Aldeia da folha";

        naruto.jutsuSubsticuicao();
        naruto.mostrarKunais();
        naruto.adicionarKunais();
        naruto.mostrarKunais();

    }
}
