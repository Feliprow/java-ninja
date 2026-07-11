package com.feliprow.nivelintermediario.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static void main(String[] args) {

        // Fila - Queue
        // Queue faz parte de uma linked list
        // basicamente é uma lista encadeada
        Queue<String> ninjasQueue = new LinkedList<>();

        ninjasQueue.add("Tobirama");
        ninjasQueue.add("Hashirama");
        ninjasQueue.add("Shikamaru");

        System.out.println(ninjasQueue);
        System.out.println(ninjasQueue.peek());

        ninjasQueue.poll();
        System.out.println(ninjasQueue.peek());


        System.out.println(ninjasQueue);
    }
}
