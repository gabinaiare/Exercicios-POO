package exercicio2;

import java.util.Scanner;

public class Questao26 {
    public static boolean isEquilatero(int a, int b, int c) {
        return a == b && b == c;
    }

    public static boolean isIsosceles(int a, int b, int c) {
        return (a == b && a != c) || (a == c && a != b) || (b == c && b != a);
    }

    public static boolean isEscaleno(int a, int b, int c) {
        return a != b && b != c && a != c;
    }

    public void run() {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        int a = input.nextInt();
        System.out.print("Digite o segundo lado: ");
        int b = input.nextInt();
        System.out.print("Digite o terceiro lado: ");
        int c = input.nextInt();

        if(isEquilatero(a, b, c)) {
            System.out.println("O triângulo é Equilátero.");
        } else if(isIsosceles(a, b, c)) {
            System.out.println("O triângulo é Isósceles.");
        } else if(isEscaleno(a, b, c)) {
            System.out.println("O triângulo é Escaleno.");
        } else {
            System.out.println("Triângulo inválido.");
        }
    }
}
