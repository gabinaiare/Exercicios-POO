package exercicio2;

import java.util.Scanner;

public class Main {
    public static int menu(){
        Scanner input = new Scanner(System.in);
        System.out.print("""
        ===== MENU =====
        1 -> Questão 1
        2 -> Questão 2
        3 -> Questão 3         
        """);
        int opcao = input.nextInt();

        return opcao;
    }

    public static void main(String[] args) {
        int opcao;
        opcao = menu();

        switch (opcao) {
            case 1:
                Questao1 q1 = new Questao1();
                q1.run();
                break;
            case 2:
                Questao2 q2 = new Questao2();
                q2.run();
                break;
            case 3:
                Questao3 q3 = new Questao3();
                q3.run();
                break;
            default:
                break;
        }
    }
}
