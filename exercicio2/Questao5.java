package exercicio2;

import java.util.Scanner;

public class Questao5{
    public void run(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de número que deverá ser processador: ");
        int quant = input.nextInt();

        for (int i = 1; i <= quant; i++) {
            System.out.print("Digite o número: ");
            int num = input.nextInt();
            
            long fatorial = 1;

            for (int j = 1; j <= num; j ++){
                fatorial *= j;
                System.out.printf("%d ", fatorial);
            }

            System.out.printf("\nO fatorial é %d é: %d \n\n", num, fatorial);
        }
    }
}