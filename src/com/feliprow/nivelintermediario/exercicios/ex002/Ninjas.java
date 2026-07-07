package com.feliprow.nivelintermediario.exercicios.ex002;

public abstract class Ninjas implements Ninja {
    String nome;
    int idade;
    String habilidade;
    TipoHabilidade tipoHabilidade;

    @Override
    public void mostrarInformacoes() {
        String ficha = """
                -----------------
                Ninja: %s
                Idade: %d anos
                Habilidade: %s
                Tipo Habilidade: %s""".formatted(nome, idade, habilidade, tipoHabilidade);

        System.out.print(ficha);
    }

    @Override
    public void executarHabilidade() {
        System.out.println(nome + " ativou sua habilidade (" + habilidade + ").");
    }

    public Ninjas(String nome, int idade, String habilidade, TipoHabilidade tipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.tipoHabilidade = tipoHabilidade;
    }
}
