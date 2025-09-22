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
        11 -> Questão 11
        12 -> Questão 12
        13 -> Questão 13
        14 -> Questão 14
        15 -> Questão 15
        16 -> Questão 16
        17 -> Questão 17
        18 -> Questão 18
        19 -> Questão 19
        20 -> Questão 20
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
            case 11:
                Questao11 q11 = new Questao11();
                q11.run();
                break;
            case 12:
                Questao12 q12 = new Questao12();
                q12.run();
                break;
            case 13:
                Questao13 q13 = new Questao13();
                q13.run();
                break;
            case 14:
                Questao14 q14 = new Questao14();
                q14.run();
                break;
            case 15:
                Questao15 q15 = new Questao15();
                q15.run();
                break;
            case 16:
                Questao16 q16 = new Questao16();
                q16.run();
                break;
            case 17:
                Questao17 q17 = new Questao17();
                q17.run();
                break;
            case 18:
                Questao18 q18 = new Questao18();
                q18.run();
                break;
            case 19:
                Questao19 q19 = new Questao19();
                q19.run();
                break;
            case 20:
                Questao20 q20 = new Questao20();
                q20.run();
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        menu();
    }
}
