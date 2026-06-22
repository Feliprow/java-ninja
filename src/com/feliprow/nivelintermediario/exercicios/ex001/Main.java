package com.feliprow.nivelintermediario.exercicios.ex001;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Nossas garagens começam com 1 vaga livre
        Ninja[] ninjaComum = new Ninja[1];
        Uchiha[] ninjaUchiha = new Uchiha[1];

        int opcao;

        do {
            System.out.println("""
                    
                    ========= MENU NINJA =========
                    [1] - Listar ninjas
                    [2] - Cadastrar Uchihas
                    [3] - Cadastrar ninja comum
                    [4] - Alterar habilidade especial (Uchihas)
                    [5] - Sair
                    ==============================
                    """);

            opcao = Integer.parseInt(teclado.nextLine());

            switch (opcao) {
                case 1 -> {
                    if (ninjaComum[0] == null && ninjaUchiha[0] == null) {
                        System.out.println("A vila está vazia. Nenhum ninja cadastrado.");
                    } else {
                        int contador = 1;

                        System.out.println("--- Ninjas Comuns ---");
                        for (int i = 0; i < ninjaComum.length; i++) {
                            if (ninjaComum[i] != null) {
                                System.out.printf("%d° - %s\n", contador, ninjaComum[i].nome);
                                contador++;
                            }
                        }

                        System.out.println("\n--- Clã Uchiha ---");
                        for (int i = 0; i < ninjaUchiha.length; i++) {
                            if (ninjaUchiha[i] != null) {
                                System.out.printf("%d° - %s\n", contador, ninjaUchiha[i].nome);
                                contador++;
                            }
                        }
                        System.out.println("-------| FIM DA LISTA |-------");
                    }
                }

                case 2 -> {
                    System.out.println("Digite o nome do novo Uchiha:");
                    String nome = teclado.nextLine();

                    int ultimaPosicao = ninjaUchiha.length - 1;
                    boolean jaCadastrado = false;

                    for (int i = 0; i < ninjaUchiha.length; i++) {
                        if (ninjaUchiha[i] != null && nome.equals(ninjaUchiha[i].nome)) {
                            System.out.println("Ninja já cadastrado. Ação não efetuada.");
                            jaCadastrado = true;
                            break;
                        }
                    }

                    if (!jaCadastrado) {
                        ninjaUchiha[ultimaPosicao] = new Uchiha();
                        ninjaUchiha[ultimaPosicao].nome = nome;
                        ninjaUchiha = Arrays.copyOf(ninjaUchiha, ninjaUchiha.length + 1);
                        System.out.println("Uchiha cadastrado com sucesso!");
                    }
                }

                case 3 -> {
                    System.out.println("Digite o nome do novo ninja comum:");
                    String nome = teclado.nextLine();

                    int ultimaPosicao = ninjaComum.length - 1;
                    boolean jaCadastrado = false;

                    for (int i = 0; i < ninjaComum.length; i++) {
                        if (ninjaComum[i] != null && nome.equals(ninjaComum[i].nome)) {
                            System.out.println("Ninja já cadastrado. Ação não efetuada.");
                            jaCadastrado = true;
                            break;
                        }
                    }

                    if (!jaCadastrado) {
                        ninjaComum[ultimaPosicao] = new Ninja();
                        ninjaComum[ultimaPosicao].nome = nome;

                        ninjaComum = Arrays.copyOf(ninjaComum, ninjaComum.length + 1);
                        System.out.println("Ninja comum cadastrado com sucesso!");
                    }
                }

                case 4 -> {
                    int totalCadastrados = 0;

                    // Lista os Uchihas disponíveis
                    for (int i = 0; i < ninjaUchiha.length; i++) {
                        if (ninjaUchiha[i] != null) {
                            System.out.printf("%d° - %s\n", (i + 1), ninjaUchiha[i].nome);
                            totalCadastrados++;
                        }
                    }

                    if (totalCadastrados == 0) {
                        System.out.println("Nenhum Uchiha cadastrado ainda para alterar habilidades!");
                    } else {
                        System.out.println("\nSelecione o número do ninja: ");
                        int selecao = Integer.parseInt(teclado.nextLine());

                        if (selecao <= 0 || selecao > totalCadastrados) {
                            System.out.println("Seleção inválida. Tente novamente.");
                        } else {
                            System.out.println("Digite a nova habilidade especial:");
                            // Subtrai 1 pois o usuário digita 1, mas no array é a posição 0
                            ninjaUchiha[selecao - 1].habilidadeEspecial = teclado.nextLine();
                            System.out.println("Habilidade atualizada com sucesso!");
                        }
                    }
                }

                case 5 -> {
                    System.out.println("Fechando os portões de Konoha. Saindo. . .");
                }

                default -> System.out.println("Jutsu inválido! Digite uma opção válida do menu.");
            }
        } while (opcao != 5);

        teclado.close();
    }
}