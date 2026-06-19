package com.feliprow.nivelintermediario.metodoseparametros;

public class Ninja {
    String nome;
    int idade;
    String aldeia;
    int kunais;

    // Criando um método_ publico personalizado
    public void jutsuSubsticuicao(){
        System.out.println(nome + " usou o jutsu de substituição!");
    }
    //estrutura: privacidade; tipo função; nome função; () parametros;

    public int adicionarKunais(){
        System.out.println(nome + " coletou uma kunai.");
        return kunais++;
    }

    public void mostrarKunais(){
        System.out.println(nome + " tem " + kunais + " kunais.");
    }

}
