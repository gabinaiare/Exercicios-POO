package exercicio2;

import java.util.Scanner;

public class Questao18 {
    public void run() {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];

        System.out.println("Digite 10 números inteiros positivos (maiores que zero):");
        for (int i = 0; i < 10; i++) {
            int num;
            do {
                System.out.print("Número " + (i + 1) + ": ");
                num = input.nextInt();
                if (num <= 0) {
                    System.out.println("Digite apenas números positivos!");
                }
            } while (num <= 0);
            vetor[i] = num;
        }

        int x;
        do {
            System.out.print("Digite o número X (positivo e maior que zero): ");
            x = input.nextInt();
            if (x <= 0) {
                System.out.println("Número inválido! Digite um número positivo.");
            }
        } while (x <= 0);

        int maiores = 0, menores = 0, iguais = 0;
        for (int i = 0; i < 10; i++) {
            if (vetor[i] > x) {
                maiores++;
            } else if (vetor[i] < x) {
                menores++;
            } else {
                iguais++;
            }
        }

        System.out.println("\nQuantidade de números maiores que X: " + maiores);
        System.out.println("Quantidade de números menores que X: " + menores);
        System.out.println("Quantidade de números iguais a X: " + iguais);
    }
}
