package com.feliprow.nivelintermediario.interfaces;

public class Uchiha extends Ninja  implements ISharingan {
    @Override
    public void ativarSharingan() {
        System.out.println("O Uchiha " + this.nome + " ativou o Sharingan natural.");
    }
}
