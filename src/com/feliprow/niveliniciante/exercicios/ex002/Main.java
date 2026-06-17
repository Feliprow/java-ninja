package com.feliprow.niveliniciante.exercicios.ex002;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void mostrarMenu() {
        System.out.println("""
                ----------| SISTEMA KONOHA |----------
                [1] - Visualizar ninjas
                [2] - Cadastrar ninjas
                [3] - Alterar ninja
                [4] - Sair
                ======================================
                """);
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] ninjas = new String[1];
        boolean loop = true;
        while (loop) {
            mostrarMenu();
            int opcao = Integer.parseInt(teclado.nextLine());
            switch (opcao) {
                case 1 -> {
                    if (ninjas[0] == null) {
                        System.out.println("Lista vazia, adicione algum ninja");
                    } else {
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.printf("%d - %s\n", (i + 1), ninjas[i]);
                        }
                        System.out.println("FIM DA LISTA");
                        System.out.println("Digite para continuar.");
                        teclado.nextLine();
                    }
                }
                case 2 -> {
                    System.out.println("Digite o nome do ninja:");
                    String nomeTemp = teclado.nextLine();
                    if (ninjas[0] == null) {
                        ninjas[0] = nomeTemp;
                        System.out.println("Ninja cadastrado!");
                    } else {
                        boolean duplicado = false;
                        for (int i = 0; i < ninjas.length; i++) {
                            if (nomeTemp.equals(ninjas[i])) {
                                duplicado = true;
                                break;
                            }
                        }
                        if (duplicado) {
                            System.out.println("Nome já cadastrado.");
                        } else {
                            String[] ninjacopia = Arrays.copyOf(ninjas, ninjas.length + 1);
                            ninjacopia[ninjacopia.length - 1] = nomeTemp;
                            ninjas = ninjacopia;
                            System.out.println("Ninja cadastrado!");
                        }
                    }
                }
                case 3 -> {
                    if (ninjas[0] != null) {
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.printf("%d - %s\n", (i + 1), ninjas[i]);
                        }
                        System.out.println("Digite índice do ninja que deseja alterar: ");
                        int indice = Integer.parseInt(teclado.nextLine());
                        indice--;
                        if (indice < 0 || indice >= ninjas.length) {
                            System.out.println("Índice inválido.");
                            break;
                        }
                        System.out.printf("Alterar [%s] ? [s/n]\n", ninjas[indice]);
                        char escolha = teclado.nextLine().charAt(0);
                        if (escolha == 's' || escolha == 'S') {
                            System.out.println("Digite a alteração do nome");
                            ninjas[indice] = teclado.nextLine();
                            System.out.println("Nome alterado!");
                        } else {
                            System.out.println("Nome não alterado, voltando ao menu.");
                        }
                    } else {
                        System.out.println("A lista está vazia.");
                    }
                }
                case 4 -> {
                    System.out.println("Saindo do sistema...");
                    loop = false;
                }
                default -> System.out.println("Digite uma opção válida!");
            }
        }
    }
}