package exercicio2;

import java.util.Random;
import java.util.Scanner;

public class Questao21 {
    public void run() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int numeroSorteado = random.nextInt(101);
        int tentativa;
        int conttentativa = 0;

        System.out.println("Tente adivinhar o número entre 0 e 100!");

        do {
            System.out.print("Digite sua tentativa: ");
            tentativa = input.nextInt();
            conttentativa++;

            if (tentativa < numeroSorteado) {
                System.out.println("O número sorteado é MAIOR que " + tentativa);
            } else if (tentativa > numeroSorteado) {
                System.out.println("O número sorteado é MENOR que " + tentativa);
            } else {
                System.out.println("\n🎉 Parabéns! Você acertou o número " + numeroSorteado +
                                   " em " + conttentativa + " tentativas.");
            }

        } while (tentativa != numeroSorteado);
    }
}
