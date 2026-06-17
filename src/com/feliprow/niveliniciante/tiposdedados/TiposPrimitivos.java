package com.feliprow.niveliniciante.tiposdedados;

public class TiposPrimitivos {
    static void main(String[] args) {
        /*
         * Dados primitivos - int, double, float, char, boolean, short, long
         * */

        /*
         * int: Números inteiros.
         * float: Números de ponto flutuante de precisão simples.
         * double: Números de ponto flutuante de precisão dupla.
         * char: Um único caractere.
         * boolean: Valores verdadeiros ou falsos.
         * byte: Números inteiros pequenos.
         * short: Números inteiros menores que um int.
         * Long: Números inteiros maiores que um int.
         */

        int intNumeroMaximo = Integer.MAX_VALUE;
        int intNumeroMinimo = Integer.MIN_VALUE;
        System.out.println(intNumeroMinimo);
        System.out.println(intNumeroMaximo);

        long longNumeroMaximo = Long.MAX_VALUE;
        long longNumeroMinimo = Long.MIN_VALUE;
        long longNumeroAleatorio = 1203012231312L; // Colocar o 'L' no final do Long
        System.out.println(longNumeroMaximo);
        System.out.println(longNumeroMinimo);
        System.out.println(longNumeroAleatorio);

        float floatNumeroMinimo = Float.MIN_VALUE;
        float floatNumeroMaximo = Float.MAX_VALUE;
        float floatNumeroAleatorio = 1203.21f; // Colocar 'f' no final do número
        System.out.println(floatNumeroMinimo);
        System.out.println(floatNumeroMaximo);
        System.out.println(floatNumeroAleatorio);


    }
}
