package com.feliprow.niveliniciante.lacosderepeticoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        // While, do While, for

        // While (condição verdadeira) {executa}
        int idade = 12;
        while (idade <= 16) {
            System.out.println("Naruto fez aniversário! agora tem " + idade + " anos!");
            idade++;
        }

        System.out.println("-------------");
        // do {executa} while (confere se continua o loop) -> executa o loop uma vez no mínimo.
        int i = 1;
        do {
            System.out.println("Naruto fez o " + i + "º clone");
            i++;
        }while (i <= 5);


        // for (inicializador; condição {executa}; incrementa)
        for (int j = 0; j < 5; j++) {
            System.out.println("To certo!");
        }

    }
}
