package exercicio2;

import java.util.Scanner;

public class Main {
    public static void menu(){
        Scanner input = new Scanner(System.in);
        System.out.print("""
        ===== MENU =====
        1 -> Questão 1
        2 -> Questão 2
        3 -> Questão 3
        4 -> Questão 4
        5 -> Questão 5
        6 -> Questão 6
        7 -> Questão 7
        8 -> Questão 8
        9 -> Questão 9
        10 -> Questão 10                 
        """);
        int opcao = input.nextInt();

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
            case 4:
                Questao4 q4 = new Questao4();
                q4.run();
                break;
            case 5:
                Questao5 q5 = new Questao5();
                q5.run();
                break;
            case 6:
                Questao6 q6 = new Questao6();
                q6.run();
                break;
            case 7:
                Questao7 q7 = new Questao7();
                q7.run();
                break;
            case 8:
                Questao8 q8 = new Questao8();
                q8.run();
                break;
            case 9:
                Questao9 q9 = new Questao9();
                q9.run();
                break;
            case 10:
                Questao10 q10 = new Questao10();
                q10.run();
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        menu();
    }
}
