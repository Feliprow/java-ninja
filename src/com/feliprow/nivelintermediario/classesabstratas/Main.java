package com.feliprow.nivelintermediario.classesabstratas;

public class Main {
    public static void main() {

        //Não se pode instanciar de classe abstratas

        Uzumaki naruto = new Uzumaki("Naruto", 14);

        System.out.println(naruto);


        naruto.substituicao();
    }
}
