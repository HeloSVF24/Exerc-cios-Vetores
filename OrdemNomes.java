/*Arrumando os nomes
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordemnomes;

/**
 *
 * @author Heloisa Silva 1 DS/AMS
 */

import java.util.Arrays;
import java.util.Scanner;

public class OrdemNomes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos nomes deseja digitar? ");
        int quantidade = entrada.nextInt();
        entrada.nextLine(); // limpar o buffer do teclado

        String[] nomes = new String[quantidade];

        // Entrada dos nomes
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = entrada.nextLine();
        }

        // Ordenar em ordem crescente (A-Z)
        Arrays.sort(nomes);

        System.out.println("\n=== NOMES EM ORDEM CRESCENTE (A-Z) ===");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Exibir em ordem decrescente (Z-A)
        System.out.println("\n=== NOMES EM ORDEM DECRESCENTE (Z-A) ===");
        for (int i = nomes.length - 1; i >= 0; i--) {
            System.out.println(nomes[i]);
        }

        entrada.close();
    }
}

