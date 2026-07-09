package com.feliprow.nivelintermediario.sobrecargademetodos;

public class Main {
    static void main(String[] args) {
         Ninja hidan = new Ninja("Hidan");

         hidan.ataque(1);
         hidan.ataque(1,2);
         hidan.ataque(10,10.4f);
         //Mesmo método_ diferentes assinaturas.
    }
}
