package com.feliprow.niveliniciante.entradadedados;

// importar objeto

import java.util.Scanner;

public class EntradaDeDados {
    static void main() {

        // Iniciar objeto
        Scanner telado = new Scanner((System.in));

        // Recebendo nome do ninja
        System.out.println("Digite o nome do ninja:");
        String nome = telado.nextLine();
        System.out.println("Nome do ninja: " + nome);

        // Recebendo inteiros + Parse
        System.out.println("Digite a idade do ninja:");
        /* Integer (nao primitivo) usa função parse
        * parse -> serve para fazer a conversão de uma string á um
        * tipo primitivo determinado.
        * parse recebe uma string como parâmetro.
        */
        int idade = Integer.parseInt(telado.nextLine());
        System.out.println("Idade: " + idade);

        if (idade >=18){
            System.out.println(nome + " esta apto para missões de rank S");
        } else {
            System.out.println(nome + " só pode executar missões até o rank A");
        }


        // fechar entrada do teclado
        telado.close();
    }
}
