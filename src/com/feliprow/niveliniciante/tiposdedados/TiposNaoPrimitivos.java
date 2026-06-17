package com.feliprow.niveliniciante.tiposdedados;

public class TiposNaoPrimitivos {
    static void main(String[] args) {
        /*
        * Dados não primitivos: String, Array, Class, enum
        * */

//      Tipos não primitivos aceitam métodos
        String nome = "Naruto Uzumaki";
        System.out.println(nome.replace("Na", "Bo"));

        String nome2 = "Sasuke Uchiha";
        String nome3 = nome2.toUpperCase();

        System.out.printf(nome3);
    }
}
