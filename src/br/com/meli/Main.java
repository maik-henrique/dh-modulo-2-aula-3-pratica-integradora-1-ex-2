package br.com.meli;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pessoa joao = new Pessoa("João", "Cargene", "21313131");
        Curriculo curriculo = new Curriculo(joao);
        curriculo.adicionarHabilidades("Organizado", "Trabalha em equipe", "Andar de skate", "Soltar pipa");

        Livro livro = new Livro(12, "John McAlgo", "A volta dos que não foram", "Terror");

        Relatorio relatorio = new Relatorio("Mark", "Mirk", 54, "Lorem ipsum ....");

        List<Documento> documentos = List.of(curriculo, livro, relatorio);

        documentos.forEach(documento -> Impressora.imprimir(documento));
    }
}
