package com.feliprow.nivelintermediario.sobrecargadeconstrutores;

public class Uzumaki extends Ninja {
    String corDaRoupa;
    int shurikens;
    int kunais;
    int pergaminhos;

    public Uzumaki(String nome, int idade) {
        super(nome, idade);
    }

    public Uzumaki(String nome, int idade, String corDaRoupa) {
        super(nome, idade);
        this.corDaRoupa = corDaRoupa;
    }

    public Uzumaki(String nome, int idade, String corDaRoupa, int shurikens) {
        super(nome, idade);
        this.corDaRoupa = corDaRoupa;
        this.shurikens = shurikens;
    }

    // O intellij gera vários this
    public Uzumaki(String nome, int idade, String corDaRoupa, int shurikens, int kunais) {
        super(nome, idade);
        this.corDaRoupa = corDaRoupa;
        this.shurikens = shurikens;
        this.kunais = kunais;
    }

    // Boa prática para não gerar vários "this" como o intellij faz.
    public Uzumaki(String nome, int idade, String corDaRoupa, int shurikens, int kunais, int pergaminhos) {
        this(nome, idade, corDaRoupa, shurikens, kunais);
        this.pergaminhos = pergaminhos;
    }
}
