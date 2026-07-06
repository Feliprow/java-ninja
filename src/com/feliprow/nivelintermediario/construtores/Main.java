package com.feliprow.nivelintermediario.construtores;

public class Main {
    public static void main(String[] args) {

        Hokages hashirama = new Hokages();
        hashirama.nome = "Hashirama";

        Hokages tobirama = new Hokages("Tobirama",34, false);
        System.out.println(tobirama.nome);



    }
}
