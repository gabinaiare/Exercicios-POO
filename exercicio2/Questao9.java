package exercicio2;

import java.util.Scanner;

public class Questao9 {
    public void run(){
        Scanner input = new Scanner(System.in);
        int num, somapares = 0, somaimpares = 0;

        do {
            System.out.println("Digite um valor inteiro positivo (digite um negativo caso queira encerrar): ");
            num = input.nextInt();

            if (num >= 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " é par.\n");
                    somapares+= num;
                }else{
                    System.out.println(num + " é ímpar.\nS");
                    somaimpares+= num;
                }
                
            }
        } while (num > 0);

        System.out.println("\nSoma dos números pares: " + somapares);
        System.out.println("Soma dos números ímpares: " + somaimpares);
    }
}
