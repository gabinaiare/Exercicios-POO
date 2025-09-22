package exercicio2;

import java.util.Scanner;

public class Questao20 {
    public void run() {
        Scanner input = new Scanner(System.in);
        int n;

        // Leitura do tamanho do vetor
        do {
            System.out.print("Digite o tamanho dos vetores (máximo 50): ");
            n = input.nextInt();
            if (n <= 0 || n > 50) {
                System.out.println("Tamanho inválido! Digite um valor entre 1 e 50.");
            }
        } while (n <= 0 || n > 50);

        int[] V1 = new int[n];
        int[] V2 = new int[n];

        // Leitura dos elementos de V1
        System.out.println("Digite os elementos de V1:");
        for (int i = 0; i < n; i++) {
            System.out.print("V1[" + i + "]: ");
            V1[i] = input.nextInt();
        }

        // Leitura dos elementos de V2
        System.out.println("Digite os elementos de V2:");
        for (int i = 0; i < n; i++) {
            System.out.print("V2[" + i + "]: ");
            V2[i] = input.nextInt();
        }

        // Contagem de valores iguais nas mesmas posições
        int iguais = 0;
        for (int i = 0; i < n; i++) {
            if (V1[i] == V2[i]) {
                iguais++;
            }
        }

        System.out.println("\nQuantidade de posições com valores iguais: " + iguais);
    }
}
