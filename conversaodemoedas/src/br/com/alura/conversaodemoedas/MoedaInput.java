package br.com.alura.conversaodemoedas;

import java.util.List;
import java.util.Scanner;

public class MoedaInput {
    public static void MoedaInput(String opcao, Conversao conversao, List<Moeda> moedas, Scanner entrada) {

        String moedaOrigem = "";
        String moedaDestino = "";
        double valor = 0;

        switch (opcao) {
            case "1" -> {
                moedaOrigem = "BRL";
                moedaDestino = "USD";
                break;
            }

            case "2" -> {
                moedaOrigem = "BRL";
                moedaDestino = "EUR";
                break;
            }

            case "3" -> {
                moedaOrigem = "USD";
                moedaDestino = "EUR";
                break;
            }

            case "4" -> {
                moedaOrigem = "USD";
                moedaDestino = "BRL";
                break;
            }

            case "5" -> {
                moedaOrigem = "GBP";
                moedaDestino = "USD";
                break;
            }

            case "6" -> {
                moedaOrigem = "GBP";
                moedaDestino = "EUR";
                break;
            }

            case "7" -> {
                moedaOrigem = "GBP";
                moedaDestino = "BRL";
                break;
            }

            case "8" -> {
                if (moedas.isEmpty()) {
                    System.out.println("Nenhuma conversão realizada ainda.\n");
                } else {
                    System.out.println("=== Histórico de Conversões ===");
                    for (Moeda registro : moedas) {
                        System.out.println(registro);
                    }
                }
                break;
            }
            default -> {
                System.out.println("Opção inválida. Tente novamente.\n");
            }
        }

        System.out.print("Digite o valor a ser convertido: ");

       String entradaValor = entrada.nextLine();
        if (entradaValor.isBlank()) {
            System.out.println("Valor em branco. Tente novamente.\n");
            return;
        }

        try {
            valor = Double.parseDouble(entradaValor);
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido. Tente novamente.\n");
        } catch (Exception e) {

            System.out.println("Erro inesperado: " + e.getMessage());
        }

        try {

            Moeda moedaConvertida = conversao.conversao(moedaOrigem, moedaDestino, valor);
            System.out.println("Conversão realizada com sucesso!");

            System.out.printf("o valor da conversão de %.2f %s é %.2f %s\n", valor, moedaOrigem, moedaConvertida.valor(),
                    moedaConvertida.MoedaDestino());
            moedas.add(moedaConvertida);

        } catch (Exception e) {
            System.out.println("Erro na conversão: " + e.getMessage());
        }

    }
}