package com.feliprow.nivelintermediario.exercicios.ex002;

public class NinjaAvancado extends Ninjas {
    String especialidade;

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.printf("\nEspecialidade: %s\n", especialidade);
    }

    public NinjaAvancado(String nome, int idade, String habilidade, TipoHabilidade tipoHabilidade, String especialidade) {
        super(nome, idade, habilidade, tipoHabilidade);
        this.especialidade = especialidade;
    }
}
