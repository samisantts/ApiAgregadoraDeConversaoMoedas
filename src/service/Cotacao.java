package service;

import model.Moeda;

public class Cotacao {

    private Moeda moedaDestino;
    private Moeda moedaOrigem;
    private Double valor;

    public Cotacao(Moeda moedaDestino, Moeda moedaOrigem, double valor) {
        this.moedaDestino = moedaDestino;
        this.moedaOrigem = moedaOrigem;
        this.valor = valor;

        if (valor > 0) {
            System.out.println("cotacao valida");
        } else {
            System.out.println("cotacao invalida");

        }
    }

    public Moeda getMoedaDestino() { return moedaDestino;
    }

    public Moeda getMoedaOrigem() { return moedaOrigem;
    }

    public Double getValor() { return valor;

    }

}




