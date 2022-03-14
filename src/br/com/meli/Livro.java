package br.com.meli;

public class Livro extends Documento{

    private int numeroPaginas;
    private String autor;
    private String titulo;
    private String genero;

    public Livro(int numeroPaginas, String autor, String titulo, String genero) {
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
    }

    @Override
    public String extrairImpressao() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Imprimindo livro\n");
        stringBuilder.append("Dados:\n");
        stringBuilder.append(String.format("Número de páginas: %d | Autor: %s | Título: %s | Gênero: %s\n", numeroPaginas, autor, titulo, genero));
        return stringBuilder.toString();
    }
}
