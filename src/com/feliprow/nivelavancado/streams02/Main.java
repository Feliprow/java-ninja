package com.feliprow.nivelavancado.streams02;

import com.feliprow.nivelintermediario.exercicios.ex004.Ninja;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {

        List<Ninjas> ninjas = new ArrayList<>();
        ninjas.add(new Ninjas("Naruto", 16, "Folha"));
        ninjas.add(new Ninjas("Kabuto", 18, "Folha"));
        ninjas.add(new Ninjas("Itachi", 25, "Folha"));
        ninjas.add(new Ninjas("Gaara", 16, "Folha"));
        ninjas.add(new Ninjas("Temari", 16, "Areia"));
        ninjas.add(new Ninjas("Haku", 16, "Nevoa"));
        ninjas.add(new Ninjas("Kakashi", 32, "Folha"));
        ninjas.add(new Ninjas("Guy", 32, "Folha"));
        ninjas.add(new Ninjas("Hidan", 99, "Renegado"));
        ninjas.add(new Ninjas("Kankuro", 17, "Areia"));
        ninjas.add(new Ninjas("Konan", 23, "Chuva"));
        ninjas.add(new Ninjas("Pain", 23, "Chuva"));


        for (Ninjas ninja : ninjas){
            System.out.println(ninja.nome());
        }

/*        ninjas.stream()
                .filter(ninjas1 -> ninjas1.idade() > 30)
                .forEach(System.out::println);*/


    }
}
