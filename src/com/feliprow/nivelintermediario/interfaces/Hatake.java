package com.feliprow.nivelintermediario.interfaces;

public class Hatake extends Ninja implements ISharingan {
    @Override
    public void ativarSharingan() {
        System.out.println(this.nome + " ativou seu Sharingan.");
    }
}
