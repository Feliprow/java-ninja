package com.feliprow.nivelavancado.streams02;

public record Ninjas(String nome, int idade, String vila) {

    @Override
    public String toString() {
        return """
                __________
                Ninja: %s 
                idade: %d 
                Vila: %s""".formatted(nome,idade,vila);
    }
}
