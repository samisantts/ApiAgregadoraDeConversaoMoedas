package model;

public class  Moeda {

    private String nome;
    private String sigla;
    private char simbolo;


    Moeda Dolla = new Moeda();
    Moeda Real = new Moeda();
    Moeda Euro = new Moeda();
    Moeda DolaAustraliano = new Moeda();


    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public char getSimbolo() {
        return simbolo;
    }
}


