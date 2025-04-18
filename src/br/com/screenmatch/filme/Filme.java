package br.com.screenmatch.filme;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;

    public Filme( String nome, int anoDeLancamento, boolean incluidoNoPlano, int duracaoEmMinutos){
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.incluidoNoPlano = incluidoNoPlano;
        this.somaDasAvaliacoes = 0;
        this.totalAvaliacoes = 0;
        this.duracaoEmMinutos = duracaoEmMinutos;
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


    public void avaliarFilme(double notaFilme){
        this.somaDasAvaliacoes += notaFilme;
        this.totalAvaliacoes++ ;
    }

    public double mediaAvaliacoes(){
        return this.somaDasAvaliacoes / this.totalAvaliacoes;
    }
}
