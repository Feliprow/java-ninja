package com.feliprow.nivelintermediario.records;

public class Main {
    static void main(String[] args) {

        Ninja cadastro = new Ninja("Naruto", "naruto@email.com", 40028922);
        NinjaRecord cadastroRecord = new NinjaRecord("Sasuke", "sasuke@email.com", 707070);

        System.out.println(cadastroRecord);

        System.out.println(cadastro);

    }
}
