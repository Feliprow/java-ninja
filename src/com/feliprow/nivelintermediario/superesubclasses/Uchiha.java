package com.feliprow.nivelintermediario.superesubclasses;

public class Uchiha extends Ninja {
    String tipoSharingan;

    /* Para se usar o construtor corretamente
    * usamos a palavra -> super() com os argumentos da super classe
    * ese foi um mix com atributos proprios + superclasse
    */
    public Uchiha(String nome, int idade, String aldeia, String tipoSharingan) {
        super(nome, idade, aldeia);
        this.tipoSharingan = tipoSharingan;
    }
}
