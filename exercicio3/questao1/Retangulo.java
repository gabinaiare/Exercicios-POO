package exercicio3.questao1;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo (double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura(){
        return largura;
    }

    public double getAltura(){
        return altura;
    }

    public void setLargura(double novaLargura){
        if (novaLargura > 0) {
            this.largura = novaLargura;
        }
    }

    public void setAltura(double novaAltura){
        if (novaAltura > 0) {
            this.altura = novaAltura;
        }
    }

    public double calcularArea(){
        return largura * altura;
    }

    public double calcularPerimetro(){
        return 2 * (largura + altura);
    }

    public void ehQuadrado(){
        if (largura == altura) {
            System.err.println("É quadrado!");
        }else{
            System.err.println("Não é quadrado!");
        }
    }
}
