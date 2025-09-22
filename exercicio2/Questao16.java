package exercicio2;

import java.util.Scanner;

public class Questao16 {
    public void run(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int n = input.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = input.nextInt();
        }

        System.out.println("\nNúmeros na ordem inversa:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
