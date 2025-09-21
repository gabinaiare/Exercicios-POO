package exercicio2;

import java.util.Scanner;

public class Questao3 {
    public void run(){
    Scanner input = new Scanner(System.in);
    
    System.out.print("""
    Qual o seu gênero?
    1 -> Homem
    2 -> Mulher    
    """);
    int genero = input.nextInt();

    System.out.print("Digite sua altura: ");
    float h = input.nextFloat();

    if (genero == 1) {
        System.out.printf("Peso ideal: %.2f ", (72.2*h) - 58);
    }else{
        System.out.printf("Peso ideal: %.2f ", (62.1*h) - 44);
    }
    }
}
