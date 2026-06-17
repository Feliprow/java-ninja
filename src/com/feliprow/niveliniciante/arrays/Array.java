package com.feliprow.niveliniciante.arrays;

public class Array {
    public static void main(String[] args) {

        String[] ninjas = {"Naruto", "Sasuke", "Sakura"};

        // Copia de referência — os dois apontam pro mesmo array
        String[] referencia = ninjas;
        referencia[0] = "Kakashi";

        System.out.println(ninjas[0]);     // Kakashi
        System.out.println(referencia[0]); // Kakashi — mesmo endereço, claro

        // Cópia real — array novo, independente
        String[] copia = new String[ninjas.length];
        for (int i = 0; i < ninjas.length; i++) {
            copia[i] = ninjas[i];
        }

        copia[0] = "Naruto"; // não afeta ninjas[]

        System.out.println(ninjas[0]); // Kakashi
        System.out.println(copia[0]);  // Naruto
    }
}