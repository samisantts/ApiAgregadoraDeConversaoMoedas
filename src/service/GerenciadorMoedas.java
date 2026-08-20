package service;
import model.Moeda;
import java.util.ArrayList;
public class GerenciadorMoedas {

    ArrayList<Moeda> moedas = new ArrayList<>();

    Moeda euro = new Moeda("Euro", "EUR", '€');
    Moeda Dólar = new Moeda("Dólar", "USD", '$');
    Moeda DólarAustraliano = new Moeda("DólarAustraliano", "A$", '$');

    public Moeda buscarMoeda(String sigla) {

        for (int i = 0; i < moedas.size(); i++) {
            Moeda moeda = moedas.get(i);
            if (moeda.getSigla().equals(sigla)) {
                return moeda;
            }
        }
        return null;
    }
          public GerenciadorMoedas() {
            moedas.add(euro);
            moedas.add(Dólar);
            moedas.add(DólarAustraliano);



        }
    }




