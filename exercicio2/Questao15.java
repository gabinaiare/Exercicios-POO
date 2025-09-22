package exercicio2;

import java.util.Scanner;

public class Questao15 {
    public void run() {
        Scanner input = new Scanner(System.in);
        double indice;

        do {
            System.out.print("Digite o índice de poluição medido (0.0 para encerrar): ");
            indice = input.nextDouble();

            if (indice == 0.0) {
                System.out.println("Programa encerrado devido ao índice 0.0.");
                break;
            }

            if (indice >= 0.05 && indice <= 0.25) {
                System.out.println("Índice aceitável. Nenhuma notificação necessária.");
            } else if (indice >= 0.3 && indice < 0.4) {
                System.out.println("Notificação: Suspender atividades do 1º grupo de indústrias.");
            } else if (indice >= 0.4 && indice < 0.5) {
                System.out.println("Notificação: Suspender atividades do 1º e 2º grupo de indústrias.");
            } else if (indice >= 0.5) {
                System.out.println("Notificação: Todos os grupos devem paralisar suas atividades.");
            } else {
                System.out.println("Índice abaixo do aceitável.");
            }

        } while (true);
    }
}
