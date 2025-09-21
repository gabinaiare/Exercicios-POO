package exercicio2;

import java.util.Scanner;

public class Questao1 {
    public void run() {
        Scanner input = new Scanner(System.in);

        System.out.print("""
        Selecione a operação:
        1 -> Adição
        2 -> Subtração
        3 -> Multiplicação
        4 -> Divisão
        Opção: """);
        int opcao = input.nextInt();

        System.out.print("Digite o primeiro número: ");
        float x = input.nextFloat();

        System.out.print("Digite o segundo número: ");
        float y = input.nextFloat();

        switch (opcao) {
            case 1:
                System.out.printf("Resultado da soma: %.2f", x + y);
                break;
            case 2:
                System.out.printf("Resultado da subtração: %.2f", x - y);
                break;
            case 3:
                System.out.printf("Resultado da multiplicação: %.2f", x * y);
                break;
            case 4:
                System.out.printf("Resultado da divisão: %.2f", x / y);
                break;
            default:
                System.out.print("Opção inválida!");
                break;
        }
        input.close();
    }
}
