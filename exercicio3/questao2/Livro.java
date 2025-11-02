package exercicio3.questao2;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private double preco;
    private int numeroPaginas;

    public Livro(String titulo, String autor, int anoPublicacao, double preco, int numeroPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String novoTitulo){
        if (novoTitulo != null && !novoTitulo.trim().isEmpty()) {
            this.titulo = novoTitulo;
        }
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String novoAutor){
        if (novoAutor != null && !novoAutor.trim().isEmpty()) {
            this.autor = novoAutor;
        }
    }

    public int getAnoPublicacao(){
        return anoPublicacao;
    }

    public void setAnoPublicacao (int novoAno){
        if (novoAno > 0 && novoAno < 2025) {
            this.anoPublicacao = novoAno;
        }
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double novoPreco){
        if (novoPreco >= 0) {
            this.preco = novoPreco;
        }
    }

    public int getNumeroPaginas(){
        return numeroPaginas;
    }

    public void setNumeroPaginas(int novoNumeroPaginas){
        if (novoNumeroPaginas > 0) {
            this.numeroPaginas = novoNumeroPaginas;
        }
    }

    public void aplicarDesconto(double porcentual){
        if (porcentual >= 0 && porcentual <= 100) {
            double desconto = preco * (porcentual /100);
        }else{
            System.out.println("Desconto Inválido!");
        }
    }

    public double calcularPrecoPorPagina(){
        if (numeroPaginas > 0) {
            return preco / numeroPaginas;
        }else{
            return 0;
        }
    }
}