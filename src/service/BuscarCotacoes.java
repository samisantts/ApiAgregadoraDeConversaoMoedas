package service;
import model.Moeda;

public class BuscarCotacoes {

    public Cotacao buscarCotacao (Moeda moedaDestino, Moeda moedaOrigem) {

        Cotacao cotacao = new Cotacao(moedaDestino, moedaOrigem, 6.0);
        return cotacao;

    }
}