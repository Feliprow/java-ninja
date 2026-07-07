package com.feliprow.nivelintermediario.exercicios.ex002;

public class Main {
    public static void main(String[] args) {

        NinjaBasico figurante = new NinjaBasico("Kirito", 18, "Massagem", TipoHabilidade.TAIJUTSU);
        figurante.mostrarInformacoes();
        figurante.executarHabilidade();

        System.out.println();

        NinjaAvancado ambu = new NinjaAvancado("??", 19, "Camuflagem", TipoHabilidade.NINJUTSU, "Infiltração");
        ambu.mostrarInformacoes();
        ambu.executarHabilidade();
    }
}
