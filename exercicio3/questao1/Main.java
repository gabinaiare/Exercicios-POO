package exercicio3.questao1;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(2, 2);

        System.out.println("Area: " + retangulo.calcularArea());
        System.out.println("Perimetro: " + retangulo.calcularPerimetro());
        retangulo.ehQuadrado();
    }
}
