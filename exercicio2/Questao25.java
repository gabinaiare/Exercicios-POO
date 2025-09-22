package exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao25 {
    public static int menu(Scanner input){
        System.out.print("""
                Selecione uma das opções:
                 1 - Carregar Vetor
                 2 - Listar Vetor
                 3 - Exibir apenas os números pares do vetor
                 4 - Exibir apenas os números ímpares do vetor
                 5 - Exibir a quantidade de números pares nas posições ímpares
                 6 - Exibir a quantidade de números ímpares nas posições pares
                 0 - Sair

                 Opção: """);
        return input.nextInt();
    }

    public static List<Integer> carregarVetor(Scanner input){
        List<Integer> vetor = new ArrayList<>();
        int cont = 0;

        while(true){
            System.out.printf("Número para o vetor posição[%d] (negativo para encerrar): ", cont);
            int valor = input.nextInt();
            if(valor < 0) break;
            vetor.add(valor);
            cont++;
        }

        return vetor;
    }

    public static void listarVetor(List<Integer> vetor){
        if(vetor.isEmpty()){
            System.out.println("Vetor vazio!");
            return;
        }
        for(int i = 0; i < vetor.size(); i++){
            System.out.printf("Índice[%d]: %d\n", i, vetor.get(i));
        }
    }

    public static void listaPar(List<Integer> vetor){
        for(Integer valor : vetor){
            if(valor % 2 == 0){
                System.out.println(valor);
            }
        }
    }

    public static void listaImpar(List<Integer> vetor){
        for(Integer valor : vetor){
            if(valor % 2 != 0){
                System.out.println(valor);
            }
        }
    }

    public static int listarParImpar(List<Integer> vetor){
        int cont = 0;
        for(int i = 0; i < vetor.size(); i++){
            if(i % 2 != 0 && vetor.get(i) % 2 == 0){
                System.out.printf("Valor do índice[%d]: %d\n", i, vetor.get(i));
                cont++;
            }
        }
        return cont;
    }

    public static int listarImparPar(List<Integer> vetor){
        int cont = 0;
        for(int i = 0; i < vetor.size(); i++){
            if(i % 2 == 0 && vetor.get(i) % 2 != 0){
                System.out.printf("Valor do índice[%d]: %d\n", i, vetor.get(i));
                cont++;
            }
        }
        return cont;
    }

    public void run(){
        Scanner input = new Scanner(System.in);
        List<Integer> vetor = new ArrayList<>();
        boolean continuar = true;

        while(continuar){
            int opcao = menu(input);

            switch (opcao){
                case 1:
                    System.out.println("Carregando vetor...");
                    vetor = carregarVetor(input);
                    break;
                case 2:
                    System.out.println("Listar vetor:");
                    listarVetor(vetor);
                    break;
                case 3:
                    System.out.println("Números pares do vetor:");
                    listaPar(vetor);
                    break;
                case 4:
                    System.out.println("Números ímpares do vetor:");
                    listaImpar(vetor);
                    break;
                case 5:
                    System.out.printf("Pares em posições ímpares: %d\n", listarParImpar(vetor));
                    break;
                case 6:
                    System.out.printf("Ímpares em posições pares: %d\n", listarImparPar(vetor));
                    break;
                case 0:
                    System.out.println("Saindo...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }

        input.close();
    }
}
