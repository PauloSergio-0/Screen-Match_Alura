package br.com.paulo.screenmatch.modelos;

public class Titulo {
    protected String nome;
    protected int anoDeLancamento;
    protected boolean incluidoNoPlano;
    protected double somaDasAvaliacoes;
    protected int totalAvaliacoes;
    protected int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento, boolean incluidoNoPlano, int duracaoEmMinutos){
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.incluidoNoPlano = incluidoNoPlano;
        this.duracaoEmMinutos= duracaoEmMinutos;
        this.somaDasAvaliacoes = 0;
        this.totalAvaliacoes = 0;
    }

    public String exibirfichaTecnica(){
        return String.format("""
               
               Nome: %s 
               Ano de lançamento: %d
               Incluído no plano: %b
               Avaliação: %.1f
               Total de Avaliações: %d
               Duração em minutos: %d
               Média de valiações: %.1f
               
               """, this.nome, this.anoDeLancamento, this.incluidoNoPlano, this.somaDasAvaliacoes, this.totalAvaliacoes, this.duracaoEmMinutos, mediaAvaliacoes());
    }


    public void avaliar(double notaFilme){
        this.somaDasAvaliacoes += notaFilme;
        this.totalAvaliacoes++ ;
    }

    public double mediaAvaliacoes(){
        return this.somaDasAvaliacoes / this.totalAvaliacoes;
    }

    //getters and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
}

