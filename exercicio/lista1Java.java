package exercicio;

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
        int A, B, C, D;

        System.out.println("Digite quatro valores");

        System.out.print("Primeiro valor: ");
        A = input.nextInt();

        System.out.print("Segundo valor: ");
        B = input.nextInt();

        System.out.print("Terceiro valor: ");
        C = input.nextInt();

        System.out.print("Quarto valor: ");
        D = input.nextInt();

        System.out.println("==== Soma ====");
        System.out.printf("%d + %d = %d\n", A, B, (A + B));
        System.out.printf("%d + %d = %d\n", A, C, (A + C));
        System.out.printf("%d + %d = %d\n", A, D, (A + D));
        System.out.printf("%d + %d = %d\n", B, C, (B + C));
        System.out.printf("%d + %d = %d\n", B, D, (B + D));
        System.out.printf("%d + %d = %d\n", C, D, (C + D));

        System.out.println("==== Multiplicação ====");
        System.out.printf("%d * %d = %d\n", A, B, (A * B));
        System.out.printf("%d * %d = %d\n", A, C, (A * C));
        System.out.printf("%d * %d = %d\n", A, D, (A * D));
        System.out.printf("%d * %d = %d\n", B, C, (B * C));
        System.out.printf("%d * %d = %d\n", B, D, (B * D));
        System.out.printf("%d * %d = %d\n", C, D, (C * D));
    }

    public static void questao5(){
        Scanner input = new Scanner(System.in);
        double velocidade, distancia, litrosUsados, tempo;

        System.out.print("Informe o tempo gasto (horas): ");
        tempo = input.nextDouble();

        System.out.print("Informe a velocidade média: ");
        velocidade = input.nextDouble();

        distancia = tempo * velocidade;

        litrosUsados = distancia / 12;

        System.out.printf("\nVelocidade Média: %.2f\n", velocidade);
        System.out.printf("Tempo gasto: %.2f\n", tempo);
        System.out.printf("Distância pecorrida: %.2f\n", distancia);
        System.out.printf("Quantidade de litros usados: %.2f\n", litrosUsados);
    }

    public static void questao6(){
        Scanner input = new Scanner(System.in);
        double c, f;

        System.out.print("Informe a temperatura em graus Celsius: ");
        c = input.nextDouble();

        f = (9 * c + 160) / 5;

        System.out.printf("Temperatura em graus Fahrenheit: %.2f", f);
    }

    public static void questao7(){
        Scanner input = new Scanner(System.in);
        double c, f;

        System.out.print("Informe a temperatura em graus Fahrenheit: ");
        f = input.nextDouble();

        c = (f - 32) * 5 / 9;

        System.out.printf("Temperatura em graus Celsius: %.2f", c);
    }

    public static void questao8(){
        Scanner input = new Scanner(System.in);
        double V, R, A;

        System.out.print("Informe o raio: ");
        R = input.nextDouble();

        System.out.print("Informe a altura: ");
        A = input.nextDouble();

        V = 3.14159 * R * R * A;

        System.out.printf("O volume de uma lata de óleo é %.2f.", V);
    }

    public static void questao9(){
        Scanner input = new Scanner(System.in);
        int anos, meses, dias;

        System.out.print("Digite os anos: ");
        anos = input.nextInt();

        System.out.print("Digite os mêses: ");
        meses = input.nextInt();

        System.out.print("Digite os dias: ");
        dias = input.nextInt();

        System.out.printf("Dias totais: %d", (anos * 365) + (meses * 30) + dias);
    }

    public static void questao10(){
        Scanner input = new Scanner(System.in);
        int a, b;

        System.out.print("Informe o primeiro número: ");
        a = input.nextInt();

        System.out.print("Informe o primeiro número: ");
        b = input.nextInt();

        if (a == b) {
            System.out.printf("\n%d é igual a %d", a, b);
        }
        if (a != b) {
            System.out.printf("\n%d não é igual a %d", a, b);
        }
        if (a > b) {
            System.out.printf("\n%d é maior que %d", a, b);
        }
        if (a < b) {
            System.out.printf("\n%d é menor que %d", a, b);
        }
        if (a >= b) {
            System.out.printf("\n%d é maior ou igual a %d", a, b);
        }
        if (a <= b) {
            System.out.printf("\n%d é menor ou igual a %d", a, b);
        }
    }

    //A partir daqui são as questões do nível 2

    public static void questao11(){
        Scanner input = new Scanner(System.in);
        int A, B, temp;

        System.out.print("Digite o primeiro valor: ");
        A = input.nextInt();
        System.out.print("Digite o segundo valor: ");
        B = input.nextInt();

        System.out.printf("Antes da troca: %d %d", A, B);

        temp = A;
        A = B;
        B = temp;

        System.out.printf("\nDepois da troca: %d %d", A, B);
    }

    public static void questao12(){
        Scanner input = new Scanner(System.in);
        int numero, modulo;

        System.out.print("Digite um valor: ");
        numero = input.nextInt();

        if (numero >= 0) {
            modulo = numero;
        }else{
            modulo = numero * -1;
        }

        System.out.printf("O módulo de %d é %d ", numero, modulo);
    }

    public static void questao13(){
        Scanner input = new Scanner(System.in);
        int a, b, c, d, e, temp;

        System.out.print("Digite cinco valores: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        e = input.nextInt();

        if (a < b) {
            temp = a;
            a = b;
            b = temp;  
        }
        if (a < c) {
            temp = a;
            a = c;
            c = temp;  
        }
        if (a < d) {
            temp = a;
            a = d;
            d = temp;  
        }
        if (a < e) {
            temp = a;
            a = e;
            e = temp;  
        }
        if (b < c) {
            temp = b;
            b = c;
            c = temp;  
        }
        if (b < d) {
            temp = b;
            b = d;
            d = temp;  
        }
        if (b < e) {
            temp = b;
            b = e;
            e = temp;  
        }
        if (c < d) {
            temp = c;
            c = d;
            d = temp;  
        }
        if (c < e) {
            temp = c;
            c = e;
            e = temp;  
        }
        if (d < e) {
            temp = d;
            d = e;
            e = temp;  
        }

        System.out.printf("\nordem crescente: %d, %d, %d, %d, %d\n", e, d, c, b, a);

        System.out.printf("\nordem decrescente: %d, %d, %d, %d, %d\n", a, b, c, d, e);
    }

    public static void questao14(){
        Scanner input = new Scanner(System.in);
        int a, b;

        System.out.print("Digite dois valores: ");
        a = input.nextInt();
        b = input.nextInt();

        if (a > b) {
            System.out.printf("O maior é %d e o menor é %d, sua diferença é %d", a, b, a - b);
        }
        if (a < b) {
            System.out.printf("O maior é %d e o menor é %d, sua diferença é %d", b, a, b - a);
        }
    }

    public static void questao15(){
        Scanner input = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, recuperacao, media, novamedia;

        System.out.print("Digite as quatro notas: ");
        nota1 = input.nextDouble();
        nota2 = input.nextDouble();
        nota3 = input.nextDouble();
        nota4 = input.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7){
            System.out.print("Aprovado!");
        }else{
            System.out.print("Digite a nota da recuperação: ");
            recuperacao = input.nextDouble();

            novamedia = (media + recuperacao) / 2;

            if (novamedia >= 7){
                System.out.print("Aprovado!");
            }else{
                System.out.print("Reprovado!");
            }
        }
    }

    public static void questao16(){
        Scanner input = new Scanner(System.in);
         int a, b;

        System.out.print("Digite o primeiro número: ");
        a = input.nextInt();

        System.out.print("Digite o segundo número: ");
        b = input.nextInt();

        if (a > b) {
            System.out.printf("Maior número: %d\nMenor número: %d\n", a, b);
        } else if (b > a) {
            System.out.printf("Maior número: %d\nMenor número: %d\n", b, a);
        } else {
            System.out.print("Os dois números são iguais");
        }

    }

    public static void questao17(){
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número: ");
        numero = input.nextInt();

        if (numero >= 0 && numero <= 9){
            System.out.print("Valor válido!");
        }else if(numero < 0 || numero > 9) {
            System.out.print("Valore inválido!");
        }else{
            System.out.print("Erro!");
        }
    }

    public static void questao18(){
        Scanner input = new Scanner(System.in);
        int codigo;

        System.out.print("Digite o código: ");
        codigo = input.nextInt();

        if(codigo == 1 || codigo == 2 || codigo == 3){
            System.out.print("Código Válido!");

            switch (codigo) {
                case 1:
                    System.out.print("Um!");
                    break;
                case 2:
                    System.out.print("Dois!");
                    break;
                case 3:
                    System.out.print("Três!");
                    break;
                default:
                    System.out.print("Erro!");
                    break;
            }
        }else{
            System.out.print("Código inválido!");
        }

    }

    public static void questao19(){
        Scanner input = new Scanner(System.in);
        int A, B, C;

        System.out.print("Digite o lado A: ");
        A = input.nextInt();

        System.out.print("Digite o lado B: ");
        B = input.nextInt();

        System.out.print("Digite o lado C: ");
        C = input.nextInt();

        if(A < B + C && B < A + C && C < A + B){
            if(A == B && B == C){
                System.out.println("Triângulo Equilátero");
            }else if(A == B || A == C || B == C) {
                System.out.println("Triângulo Isósceles");
            }else{
                System.out.println("Triângulo Escaleno");
            }
        }else{
            System.out.print("Os valores não formam um triângulo");
        }
    }

    public static void questao20(){
        Scanner input = new Scanner(System.in);
        int a, b, c;
        
        System.out.print("Digite o valor de a (maior que 0): ");
        a = input.nextInt();
        if(a <= 0){
            do{
                System.out.println("Valor inválido!");
                a = input.nextInt();
            }while (a <= 0);
        }

        System.out.print("Digite o valor de b (maior que 0): ");
        b = input.nextInt();
        if(b <= 0){
            do{
                System.out.println("Valor inválido!");
                b = input.nextInt();
            }while (b <= 0);
        }

        System.out.print("Digite o valor de c (maior que 0): ");
        c = input.nextInt();
        if(c <= 0){
            do{
                System.out.println("Valor inválido!");
                c = input.nextInt();
            }while (c <= 0);
        }
  
        int maior = a;
        if (b > maior) maior = b;
        if (c > maior) maior = c;

        int menor = a;
        if (b < menor) menor = b;
        if (c < menor) menor = c;

        double divisao = maior / menor;
        System.out.printf("Menor * Maior = %d", menor * maior);
        System.out.printf("Maior / Menor = %.2f", divisao);
    }

    public static void questao21(){
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número: ");
        numero = input.nextInt();

        if(numero > 0){
            System.out.printf("%d é positivo", numero);
        }else if(numero < 0){
            System.out.printf("%d é negativo", numero);
        }
    }

    public static void questao22(){
        Scanner input = new Scanner(System.in);
        int numero, A = 0, B = 0;

        System.out.print("Digite um número: ");
        numero = input.nextInt();

        if(numero > 0){
            A = numero;
        }else if(numero < 0){
            B = numero;
        }

        System.out.printf("A = %d B = %d", A, B);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Selecione o nível de 1 à 2: ");
        int nivel = input.nextInt();

        System.out.print("""
            Escola a questão:
            1 à 10 no nível 1
            1 à 12 no nível 2
        """);
        int questao = input.nextInt();

        if (nivel == 1) {
            switch (questao) {
            case 1:
                questao1();
                break;
            case 2:
                questao2();
                break;
            case 3:
                questao3();
                break;
            case 4:
                questao4();
                break;
            case 5:
                questao5();
                break;
            case 6:
                questao6();
                break;
            case 7:
                questao7();
                break;
            case 8:
                questao8();
                break;
            case 9:
                questao9();
                break;
            case 10:
                questao10();
                break;
            default:
                System.out.print("Questão inválida!");
            }
        }else{
            switch (questao) {
            case 1:
                questao11();
                break;
            case 2:
                questao12();
                break;
            case 3:
                questao13();
                break;
            case 4:
                questao14();
                break;
            case 5:
                questao15();
                break;
            case 6:
                questao16();
                break;
            case 7:
                questao17();
                break;
            case 8:
                questao18();
                break;
            case 9:
                questao19();
                break;
            case 10:
                questao20();
                break;
            case 11:
                questao21();
                break;
            case 12:
                questao22();
                break;
            default:
                System.out.print("Questão inválida!");
                break;
            }
        }

    }
}