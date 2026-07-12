package com.feliprow.nivelintermediario.exercicios.ex004;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Iniciando sistema");
        Sistema sistema = new Sistema();

        String menu = """
                
                [1] - Listar ninjas
                [2] - Adicionar ninja
                [3] - Remover ninja
                [4] - Buscar ninjas
                [5] - Encerrar
                
                Digite sua opção:""";


        int opcao;
        do {
            System.out.println(menu);

            switch (opcao = Integer.parseInt(teclado.nextLine())) {
                case 1 -> sistema.listar();
                case 2 -> {
                    System.out.println("Digite o nome ninja:");
                    String nome = teclado.nextLine();
                    System.out.println("Digite a idade:");
                    int idade = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite a vila:");
                    String vila = teclado.nextLine();

                    sistema.adicionarHead(nome, idade, vila);
                }
                case 3 -> sistema.removerHead();
                case 4 -> {
                    System.out.println("Busque por nome, vila ou idade: ");
                    String busca = teclado.nextLine();

                    boolean ehNumero = true;
                    for (char c : busca.toCharArray()) {
                        if (!Character.isDigit(c)) {
                            ehNumero = false;
                            break;
                        }
                    }

                    if (ehNumero) {
                        sistema.buscar(Integer.parseInt(busca));
                    } else sistema.buscar(busca);

                }
                case 5 -> System.out.println("Programa encerrado.");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 5);

    }
}
