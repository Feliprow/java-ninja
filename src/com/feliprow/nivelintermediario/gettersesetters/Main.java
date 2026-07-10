package com.feliprow.nivelintermediario.gettersesetters;

public class Main {
    static void main(String[] args) {

        System.out.println("---------- Naruto Uzumaki ----------");
        Uzumaki naruto = new Uzumaki("Naruto", "Aldeia da folha", 16,10,1.60);
        naruto.setIdade(17);
        System.out.println(naruto.getAldeia()); // Printando via getAldeia
        System.out.println(naruto);

        System.out.println("---------- Sasuke Uchiha ----------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da folha", 16, 18, 1.65);
        sasuke.setIdade(18); // alterador via setIdade
        sasuke.setAldeia("Renegado");
        System.out.println(sasuke);

    }
}
