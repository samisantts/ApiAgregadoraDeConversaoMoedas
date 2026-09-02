package conversormoedas;

import model.Moeda;
import service.BuscarCotacoes;
import service.Cotacao;
import service.GerenciadorMoedas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GerenciadorMoedas gerenciador = new GerenciadorMoedas();

        System.out.println("Digite a sigla da moeda de origem:");
        String siglaOrigem = sc.nextLine();

        System.out.println("Digite a sigla da moeda de destino:");
        String siglaDestino = sc.nextLine();

        Moeda moedaOrigem = gerenciador.buscarMoeda(siglaOrigem);
        Moeda moedaDestino = gerenciador.buscarMoeda(siglaDestino);

        BuscarCotacoes cotacoes = new BuscarCotacoes();

        Cotacao cotacao = cotacoes.buscarCotacao(moedaDestino, moedaOrigem);

        System.out.println("Moeda de origem: " + moedaOrigem.getSigla());
        System.out.println("Moeda de destino: " + moedaDestino.getSigla());
        System.out.println("Cotação: " + cotacao.getValor());

        sc.close();
    }
}