package br.com.meli;

public class Pessoa {
    private final String nome;
    private final String sobrenome;
    private String telefone;

    public Pessoa(String nome, String sobrenome, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

}
