package br.com.alura.conversaodemoedas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);
        Conversao conversao = new Conversao();
        List<Moeda> moedas = new ArrayList<>();

        while (true) {
           
            System.out.println("Digite uma opção: ");
             ExibirMenu.exibirMenu();
              String escolha = entrada.nextLine();

             if (escolha.isBlank()) {
                System.out.println("Opção inválida. Tente novamente.\n");
                continue;
             }
    
                if (escolha.equalsIgnoreCase("sair")) {
                    break;
                }
    
                MoedaInput.MoedaInput(escolha, conversao, moedas, entrada);
            }

    }
}
