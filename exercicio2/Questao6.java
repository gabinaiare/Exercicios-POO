package exercicio2;

public class Questao6 {
    public void run(){
        for (int i = 100; i <= 200; i++) {
            if (i % 2 != 0) {
                System.out.printf("%d, ", i);
            }
            if (i % 10 == 0) {
                System.out.println("\n");
            }
        }
    }
}
