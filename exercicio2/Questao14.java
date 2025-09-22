package exercicio2;

import java.util.Scanner;

public class Questao14 {
    public void run(){
        Scanner input = new Scanner(System.in);
        int soma = 0, menor = Integer.MAX_VALUE, maior = Integer.MIN_VALUE;

        System.out.println("Digite 10 números inteiros e positivos: ");

        for (int i = 1; i <= 10; i++) {
            int num;
            do {
                System.out.print("Número " + i + ": ");
                num = input.nextInt();
                if (num <= 0) {
                    System.out.println("Digite apenas números positivos!");
                }
            } while (num <= 0);

            soma += num;

            if(num < menor){
                menor = num;
            }
            if(num > maior){
                maior = num;
            }
        }

        double media = soma / 10.0;
        
        System.out.println("\nMaior valor: " + maior);
        System.out.println("\nMenor valor: " + menor);
        System.out.println("\nMédia dos números: " + media);
    }
}
