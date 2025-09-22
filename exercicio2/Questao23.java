package exercicio2;

import java.util.Scanner;

public class Questao23 {
    public static double reajuste(double salario, double indice) {
        return salario + (salario * (indice / 100));
    }

    public void run() {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o salário atual: R$ ");
        double salario = input.nextDouble();

        System.out.print("Digite o índice de reajuste (%): ");
        double indice = input.nextDouble();

        double novoSalario = reajuste(salario, indice);

        System.out.printf("O salário atualizado é: R$ %.2f%n", novoSalario);

        input.close();
    }
}
