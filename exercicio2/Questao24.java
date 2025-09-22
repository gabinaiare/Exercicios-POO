package exercicio2;

import java.util.Scanner;

public class Questao24 {
    public static String verifica(int n) {
        if (n % 2 == 0) {
            return "PAR";
        } else {
            return "ÍMPAR";
        }
    }

    public void run() {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();

        String resultado = verifica(numero);

        System.out.println("O número " + numero + " é: " + resultado);

        input.close();
    }
}
