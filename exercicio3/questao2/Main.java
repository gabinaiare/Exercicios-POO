package exercicio3.questao2;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O senhor dos Anéis", "J.R.R. Tolkien", 1954, 120.00, 1000);

        System.out.println("Título: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Ano de Publicação: " + livro1.getAnoPublicacao());
        System.out.println("Preço: R$" + livro1.getPreco());
        System.out.println("Número" + livro1.getNumeroPaginas());

        livro1.aplicarDesconto(10);
        System.out.println("\nPreço após desconto de 10%: R$" + livro1.getPreco());

        double precoPagina = livro1.calcularPrecoPorPagina();
        System.out.println("Preço por página: R$" + precoPagina);
    }
}