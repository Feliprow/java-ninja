package com.feliprow.nivelintermediario.hashset;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {
    static void main(String[] args) {

        // ============================================================
        // 1) O BÁSICO: HashSet ignora duplicatas, LinkedList não
        // ============================================================
        LinkedList<String> ninjaList = new LinkedList<>();
        ninjaList.add("Naruto");
        ninjaList.add("Neji");
        ninjaList.add("Boruto");
        ninjaList.add("Neji"); // repetido -> entra

        Set<String> ninjaHash = new HashSet<>();
        ninjaHash.add("Naruto");
        ninjaHash.add("Neji");
        ninjaHash.add("Boruto");
        ninjaHash.add("Neji"); // repetido -> ignorado

        System.out.println("List (aceita repetido): " + ninjaList);
        System.out.println("Hash (sem repetido):    " + ninjaHash);

        // ============================================================
        // 2) SEM ORDEM: o HashSet não guarda a ordem de inserção.
        //    A saída pode sair em qualquer sequência.
        // ============================================================
        System.out.println("\nInseri Naruto      -> Neji -> Boruto, mas saiu: " + ninjaHash);

        // ============================================================
        // 3) contains() é O(1): a razão de existir do HashSet.
        //    Perguntar "esse ninja já está aqui?" é instantâneo,
        //    diferente da List que varre item por item (O(n)).
        // ============================================================
        System.out.println("\nTem Neji?   " + ninjaHash.contains("Neji"));
        System.out.println("Tem Sasuke? " + ninjaHash.contains("Sasuke"));

        // add() devolve boolean: true se entrou, false se já existia
        boolean entrou1 = ninjaHash.add("Gaara"); // novo
        boolean entrou2 = ninjaHash.add("Naruto"); // já tinha
        System.out.println("\nAdd Gaara (novo):     " + entrou1);
        System.out.println("Add Naruto (repetido): " + entrou2);

        // ============================================================
        // 4) MÉTODOS PRINCIPAIS
        // ============================================================
        ninjaHash.remove("Boruto");
        System.out.println("\nDepois de remover Boruto: " + ninjaHash);
        System.out.println("Tamanho:  " + ninjaHash.size());
        System.out.println("Vazio?    " + ninjaHash.isEmpty());

        // percorrendo (lembrando: ordem imprevisível)
        System.out.println("\nPercorrendo:");
        for (String ninja : ninjaHash) {
            System.out.println("  - " + ninja);
        }

        // ============================================================
        // 5) O PONTO QUE PEGA: equals() + hashCode()
        //    O HashSet não olha os campos do objeto. Ele usa
        //    hashCode() pra achar o "balde" e equals() pra comparar.
        // ============================================================

        // classe comum -> compara REFERÊNCIA de memória -> duplica
        Set<NinjaClasse> classe = new HashSet<>();
        classe.add(new NinjaClasse("Naruto", 17));
        classe.add(new NinjaClasse("Naruto", 17));
        System.out.println("\nHashSet de classe comum (esperava 1): " + classe.size());

        // record -> equals()/hashCode() de graça, com base nos campos
        Set<NinjaRecord> registro = new HashSet<>();
        registro.add(new NinjaRecord("Naruto", 17));
        registro.add(new NinjaRecord("Naruto", 17));
        System.out.println("HashSet de record (agora sim 1):      " + registro.size());
    }

    // SEM equals/hashCode -> cai no padrão do Object (referência)
    static class NinjaClasse {
        String nome;
        int idade;
        NinjaClasse(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }
    }

    // record -> equals/hashCode automáticos
    record NinjaRecord(String nome, int idade) {}
}