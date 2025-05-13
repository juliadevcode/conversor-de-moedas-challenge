package br.com.alura.conversaodemoedas;

public record Moeda(String MoedaDestino, double valor, String origem, double valorOrigem) {

    @Override
    public String toString() {
        return String.format("Conversão de %s: %.2f para %s: %.2f", origem, valorOrigem, MoedaDestino, valor);
    }
}
