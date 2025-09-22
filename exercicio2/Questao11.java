package exercicio2;

import java.util.Scanner;

public class Questao11 {
    public void run() {
        Scanner input = new Scanner(System.in);
        float somamedia = 0;
        int matricula, cont = 0;

        do {
            System.out.print("Digite a matrícula do aluno (matricula negativa encerra): ");
            matricula = input.nextInt();

            if (matricula >= 0) {
                System.out.print("Digite a nota do aluno: ");
                float nota = input.nextFloat();

                somamedia += nota;
                cont++; 
            }
           
        } while (matricula >= 0);

        System.out.printf("Média da turma: %.2f", somamedia / cont);
    }
}