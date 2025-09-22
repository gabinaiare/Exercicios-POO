package exercicio2;

import java.util.Scanner;

public class Questao22 {
    public void run() {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o 1º caractere (A-Z): ");
        char c1 = input.next().charAt(0);

        System.out.print("Digite o 2º caractere (A-Z): ");
        char c2 = input.next().charAt(0);

        if (c1 < c2) {
            int tamanho = (c2 - c1) - 1;
            char[] vetor = new char[tamanho];

            for (int i = 0; i < tamanho; i++) {
                vetor[i] = (char) (c1 + i + 1);
            }

            System.out.printf("%c %c O número de caracteres entre eles é: %d\n", c1, c2, tamanho);

            if (tamanho > 0) {
                System.out.print("Caracteres entre eles: ");
                for (char c : vetor) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Erro: os caracteres não estão em ordem alfabética.");
        }

        input.close();
    }
}
