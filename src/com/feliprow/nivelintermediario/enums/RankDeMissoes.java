package com.feliprow.nivelintermediario.enums;

public enum RankDeMissoes {
    /*podemos usar para, dias da semana, meios de pagamento, tipos de conta e etc*/
    D("Baixo", 5),
    C("Baixo" , 4),
    B("Moderada", 3),
    A("Alta", 2),
    S("Impossível", 1);

    private String descricao;
    private int dificuldade;

    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }
}
