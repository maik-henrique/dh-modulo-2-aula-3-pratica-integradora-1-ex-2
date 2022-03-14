package br.com.meli;

import java.util.LinkedList;
import java.util.List;

public class Curriculo extends Documento{
    private final Pessoa pessoa;
    private final List<String> habilidades;

    public Curriculo(final Pessoa pessoa) {
        this.pessoa = pessoa;
        habilidades = new LinkedList<>();
    }

    public void adicionarHabilidades(String... habilidade) {
        habilidades.addAll(List.of(habilidade));
    }

    @Override
    public String extrairImpressao() {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Imprimindo currículo\n");
        stringBuilder.append("Dados:\n");
        stringBuilder.append(String.format("Nome: %s | Sobrenome: %s | Telefone: %s\n", pessoa.getNome(), pessoa.getSobrenome(), pessoa.getTelefone()));
        stringBuilder.append("Habilidades:\n");
        habilidades.forEach(habilidade -> stringBuilder.append(habilidade + "\n"));
        return stringBuilder.toString();
    }
}
