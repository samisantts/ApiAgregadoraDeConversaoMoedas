package conversormoedas.service;

import org.springframework.stereotype.Service;
import conversormoedas.model.Moeda;

@Service
public class ConversaoMoedas {

        private final GerenciadorMoedas gerenciadorMoedas;
        private final BuscarCotacoes buscarCotacoes;

        public ConversaoMoedas(
                GerenciadorMoedas gerenciadorMoedas,
                BuscarCotacoes buscarCotacoes) {

            this.gerenciadorMoedas = gerenciadorMoedas;
            this.buscarCotacoes = buscarCotacoes;
        }

        public double converter(double valor, String siglaOrigem, String siglaDestino) {

            Moeda moedaOrigem = gerenciadorMoedas.buscarMoeda(siglaOrigem);
            Moeda moedaDestino = gerenciadorMoedas.buscarMoeda(siglaDestino);

            if (moedaOrigem == null || moedaDestino == null) {
                throw new IllegalArgumentException("Moeda não encontrada.");
            }

            if (valor < 0) {
                throw new IllegalArgumentException("O valor não pode ser negativo.");
            }

            double cotacao = buscarCotacoes.buscarCotacoes(
                    moedaOrigem,
                    moedaDestino
            );

            return valor * cotacao;


        }
    }


