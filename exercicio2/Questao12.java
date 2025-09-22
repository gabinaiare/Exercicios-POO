package exercicio2;

import java.util.Scanner;

public class Questao12 {
    public void run(){
        Scanner input = new Scanner(System.in);

        int num, menor = Integer.MAX_VALUE, maior = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Digite um número (caso seja negativo o programa encerra): ");
            num = input.nextInt();

            if (num < 0) {
                break;
            }
            if(num < menor){
                menor = num;
            }
            if(num > maior){
                maior = num;
            }
        }

        System.out.println("Menor número: " + menor);
        System.out.println("Maior número: " + maior);
    }
}
