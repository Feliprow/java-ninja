package com.feliprow.nivelintermediario.exercicios.ex004;

import java.util.LinkedList;

public final class Sistema {

    private final LinkedList<Ninja> ninjas = new LinkedList<>();

    public Sistema() {
        ninjasPlaceholder();
    }

    /**
     * Adiciona placeholder de 7 ninjas na lista
     */
    private void ninjasPlaceholder() {
        ninjas.add(new Ninja("Shikamaru", 16, "Folha"));
        ninjas.add(new Ninja("Kiba", 16, "Folha"));
        ninjas.add(new Ninja("Temari", 17, "Areia"));
        ninjas.add(new Ninja("Haku", 14, "Névoa"));
        ninjas.add(new Ninja("Sasori", 21, "Areia"));
        ninjas.add(new Ninja("Hidan", 99, "Renegado"));
        ninjas.add(new Ninja("Naruto", 16, "Folha"));
    }

    /**
     * Remove o head
     */
    public void removerHead() {
        if (ninjas.isEmpty()){
            System.out.println("Lista vazia.");
        }else {
            ninjas.removeFirst();
        }
    }

    /**
     * Adiciona o head
     */
    public void adicionarHead(String nome, int idade, String vila) {
        ninjas.addFirst(new Ninja(nome, idade, vila));
    }

    /**
     * Listar Ninjas
     *
     */
    public void listar() {
        if (ninjas.isEmpty()){
            System.out.println("A lista está vazia.");
            return;
        }

        int index = 0;
        for (Ninja ninja : ninjas) {
            System.out.print((index + 1) + "º");
            System.out.println(ninja.toString());
            index++;
        }
    }

    /**
     * Busca por nome ou aldeia
     *
     */
    public void buscar(String busca) {
        int resultadoBusca = 0;

        for (Ninja ninja : ninjas) {
            if ((ninja.getNome().equals(busca)) || (ninja.getVila().equals(busca))) {
                System.out.println(ninja);
                resultadoBusca++;
            }
        }

        if (resultadoBusca == 0) {
            System.out.println("Nenhum ninja correspondente");
        } else {
            System.out.printf("Foram achados (%d) resultados.\n",  resultadoBusca );
        }
    }

    /**
     * Overload:
     * busca por idade
     *
     */
    public void buscar(int idade) {
        int resultadoBusca = 0;

        for (Ninja ninja : ninjas) {
            if (ninja.getIdade() == idade) {
                System.out.println(ninja);
                resultadoBusca++;
            }
        }

        if (resultadoBusca == 0) {
            System.out.println("Nenhum ninja correspondente");
        } else {
            System.out.printf("Foram achados (%d) resultados.\n",  resultadoBusca );
        }
    }
}
