package com.feliprow.nivelintermediario.linkedlist;

import java.util.LinkedList;

public class Main {
    static void main(String[] args) {


        LinkedList<String> ninjaLinked = new LinkedList<>();

        ninjaLinked.add("naruto");
        ninjaLinked.add("neji");
        ninjaLinked.add("hidan");

        System.out.println(ninjaLinked);
        // Linked list funcionam apontando o endereço do proximo item, assim recomendado para um grande volume de dados
        // Seu funcionamento é igual ao ArrrayList.
    }
}
