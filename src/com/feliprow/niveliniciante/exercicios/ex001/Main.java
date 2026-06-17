package com.feliprow.niveliniciante.exercicios.ex001;

public class Main {

    public static void mostrarNinja(String nomeNinja, int idade, String nomeMissao, char nivelMissao, boolean statusConclusao) {
        System.out.println("Nome do ninja: " + nomeNinja);
        System.out.println("idade do ninja: " + idade);
        System.out.println("Missão: " + nomeMissao);
        System.out.println("Nível da missão: " + nivelMissao);
        System.out.println("Concluída: " + statusConclusao);
        System.out.println("-------------------------------------");
    }

    public static void missao(String nomeNinja, int idade, String nomeMissao, char nivelMissao, boolean statusConclusao) {
        if (idade >= 18) {
            statusConclusao = true;
        } else if (idade > 15 && (nivelMissao != 'S')) {
            statusConclusao = true;
        } else if (idade <= 15 && (nivelMissao == 'C' || nivelMissao == 'D')) {
            statusConclusao = true;
        } else {
            statusConclusao = false;
        }
        mostrarNinja(nomeNinja, idade, nomeMissao, nivelMissao, statusConclusao);


    }

    public static void main(String[] args) {
        String nome1 = "Naruto Uzumaki", nome2 = "Sasuke Uchiha", nome3 = "Sakura Haruno";
        int idade1 = 13, idade2 = 12, idade3 = 13;
        String nomeMissao1 = "Pegar Guizo.", nomeMissao2 = "Matar um certo alguém.", nomeMissao3 = "Namorar Sasuke.";
        char nivelMissao1 = 'C', nivelMissao2 = 'S', nivelMissao3 = 'S';

        missao(nome1,idade1,nomeMissao1,nivelMissao1,false);
        missao(nome2,idade2,nomeMissao2,nivelMissao2,false);
        missao(nome3,idade3,nomeMissao3,nivelMissao3,false);
    }
}

/*
*  melhor forma de printar grandes quantidades de println:[
*
* System.out.printf("""
        Nome do ninja: %s
        Idade do ninja: %d
        Missão: %s
        Nível da missão: %c
        Concluída: %b
        -------------------------------------
        """, nomeNinja, idade, nomeMissao, nivelMissao, statusConclusao);
*
*
* */