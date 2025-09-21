package exercicio2;

import java.util.Scanner;
public class Questao10 {
    public void run(){
        Scanner input = new Scanner(System.in);
        int num, soma = 0, cont = 0;

        do {
            System.out.println("Digite um número maior que 0 e menor 10: ");
            num = input.nextInt();
        } while (num <= 0 || num >= 10);

        if (num % 2 == 0) {
            num++;
        }

        int atual = num;

        while (cont < 20) {
            soma += atual * atual;
            atual += 2;
            cont++;
        }

        System.out.println("A soma dos quadrados dos 20 primeiros números ímpares a partir de " + num + " é: " + soma);
    }
}
