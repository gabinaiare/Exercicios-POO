package exercicio2;

import java.util.Scanner;

public class Questao17 {
    public void run() {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de elementos dos vetores: ");
        int n = input.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite x[" + i + "]: ");
            x[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Digite y[" + i + "]: ");
            y[i] = input.nextInt();
        }

        int produtoEscalar = 0;
        for (int i = 0; i < n; i++) {
            produtoEscalar += x[i] * y[i];
        }

        System.out.println("\nProduto escalar dos vetores: " + produtoEscalar);
    }
}
