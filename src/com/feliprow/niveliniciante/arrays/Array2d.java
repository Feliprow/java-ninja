package com.feliprow.niveliniciante.arrays;

public class Array2d {
    public static void main(String[] args) {

        String[][] ninjasEAldeias = new String[3][3];

        //array [linha][coluna]
        ninjasEAldeias[0][0] = "Konoha";
        ninjasEAldeias[0][1] = "Naruto Uzumaki";
        ninjasEAldeias[0][2] = "Sasuke Uchiha";

        ninjasEAldeias[1][0] = "Nevoa";
        ninjasEAldeias[1][1] = "Kabuza Momochi";
        ninjasEAldeias[1][2] = "Haku ???";

        ninjasEAldeias[2][0] = "Deserto";
        ninjasEAldeias[2][1] = "Gaara";
        ninjasEAldeias[2][2] = "Temari";

        // foreach aninhado
        for (String[] linha : ninjasEAldeias) {
            for (String nome : linha) {
                System.out.println(nome + " ");
            }
            System.out.println();
        }

        // Para saber o índice e modificar o array: for tradicional
        // Para ler: foreach

        /*
        * para cada String[] linha contida em ninjasEAldeias:
          para cada String nome contida em linha:
          imprima nome
         *
         * */


/*        for (int i = 0; i < ninjasEAldeias.length; i++) {
            for (int j = 0; j < ninjasEAldeias[i].length; j++) {
                System.out.println(ninjasEAldeias[i][j]);
            }
        }
        para i começando em 0, enquanto i < número de linhas, incrementa i:
        para j começando em 0, enquanto j < número de colunas da linha i, incrementa j:
        imprima o elemento na posição [i][j]*/
    }
}
