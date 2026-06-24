package com.feliprow.nivelintermediario.interfaces;

public class Main {
    static void main() {
        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi";

        Uchiha itachi = new Uchiha();
        itachi.nome = "Itachi";

        kakashi.ativarSharingan();
        itachi.ativarSharingan();
    }
}
