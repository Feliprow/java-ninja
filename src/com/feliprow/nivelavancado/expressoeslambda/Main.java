package com.feliprow.nivelavancado.expressoeslambda;

import java.util.*;

public class Main {
    static void main(String[] args) {


        List<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto");
        ninjas.add("Kabuto");
        ninjas.add("Itachi");
        ninjas.add("Gaara");
        ninjas.add("Temari");
        ninjas.add("Haku");
        ninjas.add("Kakashi");
        ninjas.add("Guy");
        ninjas.add("Hidan");
        ninjas.add("Kankuro");
        ninjas.add("Konan");
        ninjas.add("Pain");


        ninjas.removeIf(n -> n.length() > 5);
        System.out.println(ninjas);

        ninjas.add(0 , "Lee");


        ninjas.forEach(System.out::println);

        // Printando a lista inteira programação normal:
/*        for (Ninjas ninja : ninjas){
            System.out.println(ninja.nome());
        }*/
        // 3 linhas apenas para printar em loop

//        ninjas.forEach((Ninjas ninja) -> System.out.println(ninja.nome()));
//        ninjas.forEach((ninja) -> System.out.println(ninja.nome()));
        // não precisamos declarar explicitamente a expressão no ForEach


        List<Integer> listaDeNumeros = List.of(1, 2, 2, 3, 5, 6, 7, 8, 2, 12, 10);

        List<Integer> listaPar = new ArrayList<>();

        listaDeNumeros.forEach(numero -> {
            if (numero % 2 == 0) {
                listaPar.add(numero);
            }
        });


        System.out.println(listaPar);


        // Exercicio

        LinkedHashSet<Integer> inteiros = new LinkedHashSet<>();
        inteiros.add(1);
        inteiros.add(2);
        inteiros.add(12);
        inteiros.add(13);
        inteiros.add(18);
        inteiros.add(113);

        inteiros.removeIf(n -> n % 2 == 0);

        System.out.println(inteiros);


    }
}
