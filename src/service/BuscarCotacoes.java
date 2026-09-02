package service;
import model.Moeda;

public class BuscarCotacoes {

    public static Cotacao buscarCotacao(Moeda moedaDestino, Moeda moedaOrigem) {


        Cotacao cotacao = new Cotacao(moedaDestino, moedaOrigem, 6.0);


        while (cotacao.getValor() <= 0) {
            cotacao = new Cotacao(moedaDestino, moedaOrigem, 5.42);

        }
        return cotacao;
    }
}

