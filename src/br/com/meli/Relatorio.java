package br.com.meli;

public class Relatorio extends Documento {
    private final String autor;
    private final String revisor;
    private final int numeroPaginas;
    private final String texto;

    public Relatorio(String autor, String revisor, int numeroPaginas, String texto) {
        this.autor = autor;
        this.revisor = revisor;
        this.numeroPaginas = numeroPaginas;
        this.texto = texto;
    }

    @Override
    public String extrairImpressao() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Imprimindo relatório\n");
        stringBuilder.append("Dados:\n");
        stringBuilder.append(String.format("Número de páginas: %d | Autor: %s | Revisor: %s | Texto: %s\n", numeroPaginas, autor, revisor, texto));
        return stringBuilder.toString();
    }
}
