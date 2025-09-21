package exercicio2;

import java.util.Scanner;

public class Questao2 {
    public void run(){
        Scanner input = new Scanner(System.in);
        int n1, n2, opcao;

        System.out.print("Digite o primeiro número inteiro: ");
        n1 = input.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        n2 = input.nextInt();
        
        do{
        System.out.print("""
        === MENU ===
        1 -> Verificar se um dos números lidos é ou não múltiplo do outro
        2 -> Verificar se os dois números lidos são pares
        3 -> Verificar se a média dos dois números é maior ou igual a 7
        4 -> Sair        
        Opcão: 
        """);
        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                if (n1 % n2 == 0 || n2 % n1 == 0) {
                    System.out.println("Um dos números é multiplo do outro");
                }else{
                    System.out.println("Nenhum número é multiplo do outro");
                }
                break;
            case 2:
                if (n1 % 2 == 0 && n2 % 2 == 0) {
                    System.out.println("Os dois números são pares");
                }else{
                    System.out.println("Apenas um ou nenhum número é par");
                }
                break;
            case 3:
                int media = (n1 + n2) / 2;
                if (media >= 7) {
                    System.out.println("A média é maior ou igual a 7");
                    
                }else{
                    System.out.println("A média é menor que 7");
                }
                break;
            case 4:
                System.out.print("Saindo do programa...");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        }while(opcao != 4);
    }
}
