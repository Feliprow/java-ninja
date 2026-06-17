package com.feliprow.niveliniciante.condicoes;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha seu ninja: ");
        System.out.println("""
                1 - Naruto
                2 - Sasuke
                3 - Sakura
                """);

        int opcao = Integer.parseInt(teclado.nextLine());

        // Switch como expressão — retorna um valor direto pra variável
        // Sintaxe moderna (Java 14+): usa -> no lugar de case/break
        String ninja = switch (opcao) {
            case 1 -> "Naruto";
            case 2 -> "Sasuke";
            case 3 -> "Sakura";
            default -> "Ninja desconhecido";
        };
        System.out.println("Você escolheu: " + ninja);

        System.out.println("Digite o número do dia da semana:");
        int dia = Integer.parseInt(teclado.nextLine());

        // Switch clássico — requer break em cada case
        // Sem o break, o Java continua executando os cases seguintes (fall-through)
        switch (dia) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            default:
                System.out.println("Outro dia");
                break;
        }

        System.out.println("Digite um número entre 1 e 2:");
        int numero = Integer.parseInt(teclado.nextLine());

        // Switch moderno como statement — não retorna valor, só executa
        // Chaves {} permitem múltiplas linhas em um case
        switch (numero) {
            case 1 -> System.out.println("Você digitou 1");
            case 2 -> {
                System.out.println("Você digitou 2");
                System.out.println("Múltiplas linhas no case moderno precisam de chaves");
            }
            default -> System.out.println("Número fora dos casos previstos");
        }

        teclado.close();
    }
}