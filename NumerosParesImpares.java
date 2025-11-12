/*Odernando os números pares e impares
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerosparesimpares;

/**
 *
 * @author Heloisa Silva 1 DS/AMS
 */

import java.util.Scanner;

public class NumerosParesImpares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int quantidade;
        System.out.print("Quantos números deseja digitar? ");
        quantidade = entrada.nextInt();
        
        int[] numeros = new int[quantidade];
        
        // Leitura dos números
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = entrada.nextInt();
        }
        
        System.out.println("\n--- NÚMEROS PARES ---");
        for (int i = 0; i < quantidade; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }
        
        System.out.println("\n--- NÚMEROS ÍMPARES ---");
        for (int i = 0; i < quantidade; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println(numeros[i]);
            }
        }
        
        entrada.close();
    }
}

