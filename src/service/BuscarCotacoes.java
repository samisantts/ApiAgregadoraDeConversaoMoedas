package service;
import model.Moeda;

public class BuscarCotacoes {

    public Cotacao buscarCotacao(Moeda moedaDestino, Moeda moedaOrigem) {

        int i = 0;

        Cotacao cotacao = new Cotacao(moedaDestino, moedaOrigem, 6.0);


        while (cotacao.getValor() <= 0) {
            System.out.println("Tente novamente");
            i++;

            cotacao = new Cotacao(moedaDestino, moedaOrigem, 5.42);

            return cotacao;

            return cotacao;
        }

    }
}

