package com.feliprow.nivelintermediario.heranca;

public class Main {
    static void main(String[] args) {

        // Criando Uchiha sasuke
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 16;
        sasuke.aldeia = "Aldeia da folha";

        sasuke.mostarKunais();
        sasuke.adicionarKunai();
        sasuke.mostarKunais();
        sasuke.jutsuSubstituicao();
        sasuke.ativarSharingan();

        System.out.println();

        // Criando Haruno sakura
        Haruno sakura = new Haruno();
        sakura.nome = "Sakura Haruno";
        sakura.aldeia = "Aldeia da folha";
        sakura.idade = 16;
        sakura.curar(sasuke.nome);

        System.out.println();

        //Criando Uzumaki naruto
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da folha";
        naruto.idade = 16;
        naruto.rasengan();
    }
}
