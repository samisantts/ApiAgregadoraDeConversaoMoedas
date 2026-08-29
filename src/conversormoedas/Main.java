package conversormoedas;

import model.Moeda;
import service.GerenciadorMoedas;

public class Main {
    public static void main(String[] args) {

        GerenciadorMoedas gerenciador = new GerenciadorMoedas();
        Moeda moedaEncontrada = gerenciador.buscarMoeda("USD");


        }

    }
