package exercicio2;

public class Questao7 {
    public void run(){
        for (int i = 1; i <= 2000; i++) {
            System.out.printf("%d, ", i);
            if (i % 20 == 0) {
                System.out.print("\n");
            }
        }
    }
}
