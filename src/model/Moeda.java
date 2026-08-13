package model;

public class  Moeda {

    private String nome;
    private String sigla;
    private char simbolo;


    public Moeda (String nome, String sigla, char simbolo) {
         this.nome = nome;
         this.sigla = sigla;
         this.simbolo = simbolo;
    }
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


