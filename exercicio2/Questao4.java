package exercicio2;

public class Questao4 {
    public void run(){
        for (int i = 100; i >= 0; i--) {
            System.out.printf("%d, ", i);
            if (i % 5 == 0) {
                System.out.print("\n");
            }
        }
    }
}
