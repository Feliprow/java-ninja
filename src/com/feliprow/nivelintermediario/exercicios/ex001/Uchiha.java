package com.feliprow.nivelintermediario.exercicios.ex001;

public class Uchiha extends Ninja{
    String habilidadeEspecial;

    @Override
    public void mostrarInformacao() {
        super.mostrarInformacao();
        System.out.println("-------------");
        System.out.println("Extra: " + habilidadeEspecial);
    }
}
