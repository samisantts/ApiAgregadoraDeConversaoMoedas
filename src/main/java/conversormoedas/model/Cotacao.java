package conversormoedas.model;

public class Cotacao {

    private Moeda moedaDestino;
    private Moeda moedaOrigem;
    private Double valor;

    public Cotacao(Moeda moedaDestino, Moeda moedaOrigem, double valor) {
        this.moedaDestino = moedaDestino;
        this.moedaOrigem = moedaOrigem;
        this.valor = valor;

        if (valor > 0) {
        } else {

        }
    }

    public Moeda getMoedaDestino() { return moedaDestino;
    }

    public Moeda getMoedaOrigem() { return moedaOrigem;
    }

    public Double getValor() { return valor;

    }

}




