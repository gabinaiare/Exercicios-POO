package exercicio; // vai ser modificado de acordo com o a pasta em que o seu arquivo foi criado.

import java.util.Scanner;

public class lista1Java {
    public static void questao1(){
        Scanner input = new Scanner(System.in);
        int quantMin, quantMax;
        double estoqueMedia;

        System.out.println("Digite a quantidade máxima e quantidade mínima.\n".toUpperCase());

        System.out.print("Quantidade Máxima: ");
        quantMax = input.nextInt();

        System.out.print("Quantidade Mínima: ");
        quantMin = input.nextInt();

        estoqueMedia = (quantMax + quantMin)/2;

        System.out.printf("\nMédia do estoque: %.2f", estoqueMedia);
    }

    public static void questao2(){
        Scanner input = new Scanner(System.in);
        double dolar, real, cotacaoDolar;

        System.out.print("Digite a cotação do dólar: ");
        cotacaoDolar = input.nextDouble();

        System.out.print("Digite o valor do dólar: ");
        dolar = input.nextDouble();

        real = dolar * cotacaoDolar;

        System.out.printf("Aqui está o valor em real: %.2f", real);
    }

    public static void questao3(){
       Scanner input = new Scanner(System.in);
       int identificacaoVendedor, codigoPeca, quantVendida;
       double precoPeca, produtoPeca, comissao;
       
       System.out.print("Digite o identificador do vendedor: ");
       identificacaoVendedor = input.nextInt();

       System.out.print("Digite o código da peça: ");
       codigoPeca = input.nextInt();

       System.out.print("Digite a quantidade vendida: ");
       quantVendida = input.nextInt();

       System.out.print("Digite o preço único da peça: ");
       precoPeca = input.nextDouble();

       produtoPeca = quantVendida * precoPeca;
       
       comissao = produtoPeca * 0.05;

       System.out.printf("""
                \n====================================
                Identificador do Vendedor | %d
                Código da Peça            | %d
                Quantidade Vendida        | %d
                Preço da Peça             | %.2f 
                Total da Venda            | %.2f
                Comissão                  | %.2f
       """, identificacaoVendedor, codigoPeca, quantVendida, precoPeca, produtoPeca, comissao);
    }

    public static void questao4(){
        Scanner input = new Scanner(System.in);
    }
    public static void main(String[] args) {
        //questao1();
        //questao2();
        questao3();

    }
}