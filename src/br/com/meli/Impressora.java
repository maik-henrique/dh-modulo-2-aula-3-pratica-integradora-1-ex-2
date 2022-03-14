package br.com.meli;

public class Impressora {
    public static void imprimir(Documento documento) {
        System.out.println("Iniciando impressão");
        System.out.println(documento.extrairImpressao());
    }
}
