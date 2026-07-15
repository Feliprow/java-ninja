package com.feliprow.nivelavancado.streams;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {

        List<Ninja> ninjas = new ArrayList<>();

        ninjas.add(new Ninja("Naruto", "Konoha", 16));
        ninjas.add(new Ninja("Gaara", "Suna", 16));
        ninjas.add(new Ninja("Kabuto", "Konoha", 19));
        ninjas.add(new Ninja("Kakashi", "Konoha", 30));
        ninjas.add(new Ninja("Guy", "Konoha", 30));
        ninjas.add(new Ninja("Hidan", "Desertor", 99));


        // .stream
        // Filtragem de ninjas por vila
        /*ninjas.stream()
                .filter(ninja -> ninja.getAldeia().equals("Konoha"))
                .forEach(System.out::println);
        */

        /*// Ordenação
        ninjas.stream()
                .sorted((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .forEach(System.out::println);//Duas coisas para comparar
*/

        ninjas.stream()
                .sorted((n1, n2) -> String.CASE_INSENSITIVE_ORDER.compare(n1.getNome(), n2.getNome()))
                .forEach(System.out::println);

        // OU

        ninjas.stream()
                .sorted((n1,n2) -> n1.getNome().compareTo(n2.getNome()))
                .forEach(System.out::println);
    }
}
