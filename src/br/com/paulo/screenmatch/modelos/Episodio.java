package br.com.paulo.screenmatch.modelos;

import br.com.paulo.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int visualizacoes;

    public Episodio(int numero, String nome, Serie serie, int visualizacoes){
        this.numero = numero;
        this.nome =nome;
        this.serie = serie;
        this.visualizacoes = visualizacoes;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getVisualizacoes() {
        return visualizacoes;
    }

    @Override
    public int getClassificacao() {
        if (getVisualizacoes() >= 60) {
            return 4;
        } else {
            return 0;
        }
    }
}
