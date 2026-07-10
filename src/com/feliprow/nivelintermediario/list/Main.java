package com.feliprow.nivelintermediario.list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {

        //Array
        // São estáticos, não alteram tamanho.
        String[] ninjasArray =  new String[3];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";

        for (String ninjas : ninjasArray){
            System.out.println(ninjas);
        }

        // Listas
        // Listas tem tamanho flexível
        // List <T> Generic
        List <String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");
        ninjasList.add("Tobirama Senju");

        ninjasList.remove(0);
        ninjasList.remove("Sakura Haruno");
        System.out.println(ninjasList);
        ninjasList.removeLast();
        System.out.println(ninjasList);
        ninjasList.set(0, "Itachi Uchiha");
        System.out.println(ninjasList);
        System.out.println(ninjasList.size());

    }
}
