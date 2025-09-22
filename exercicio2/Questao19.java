package exercicio2;

import java.util.Scanner;

public class Questao19 {
    public void run() {
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[20];
        int[] idades = new int[20];

        // Leitura dos nomes e idades
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o nome da candidata " + (i + 1) + ": ");
            nomes[i] = input.nextLine();

            int idade;
            do {
                System.out.print("Digite a idade de " + nomes[i] + ": ");
                idade = input.nextInt();
                input.nextLine(); // limpar buffer
                if (idade <= 0) {
                    System.out.println("Digite uma idade válida!");
                }
            } while (idade <= 0);
            idades[i] = idade;
        }

        // Impressão das candidatas aptas
        System.out.println("\nCandidatas aptas para a campanha (18 a 20 anos):");
        boolean encontrou = false;
        for (int i = 0; i < 20; i++) {
            if (idades[i] >= 18 && idades[i] <= 20) {
                System.out.println(nomes[i]);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhuma candidata apta foi encontrada.");
        }
    }
}
