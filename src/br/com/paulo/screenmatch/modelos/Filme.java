package br.com.paulo.screenmatch.modelos;

import br.com.paulo.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome, int anoDeLancamento, String diretor, boolean incluidoNoPlano, int duracaoEmMinutos) {
        super(nome, anoDeLancamento, incluidoNoPlano, duracaoEmMinutos);
        this.diretor = diretor;
    }

    public String exibirfichaTecnica() {
        return String.format("""
                
                Nome: %s 
                Ano de lançamento: %d
                Diretor: %s
                Incluído no plano: %b
                Avaliação: %.1f
                Total de Avaliações: %d
                Duração em minutos: %d
                Média de valiações: %.1f
                
                """, this.nome, this.anoDeLancamento, this.diretor, this.incluidoNoPlano, this.somaDasAvaliacoes, this.totalAvaliacoes, this.duracaoEmMinutos, mediaAvaliacoes());
    }

    //getters and setters
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) mediaAvaliacoes() / 2;
    }
}
