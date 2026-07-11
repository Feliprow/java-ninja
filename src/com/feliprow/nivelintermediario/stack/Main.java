package com.feliprow.nivelintermediario.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    static void main(String[] args) {

        // Array
        // Tamanho fixo com referência de memória
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto";

        // Listas
        // Tamanho dinâmico
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto");

        // Stack
        // lifo last in first out
        Stack<String> ninjasStack = new Stack<>();
        ninjasStack.push("Naruto");
        ninjasStack.push("Sakura");
        System.out.println(ninjasStack);
        System.out.println(ninjasStack.peek());
        ninjasStack.pop();
        System.out.println("Removeu com .pop()");
        System.out.println(ninjasStack.peek());
    }
}
