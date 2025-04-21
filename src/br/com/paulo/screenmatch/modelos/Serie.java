package br.com.paulo.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private int epsPorTemporadas;
    private boolean ativa;
    private int minutosPorEps;

    public Serie( String nome, int anoDeLancamento, boolean incluidoNoPlano, int temporadas,int epsPorTemporadas, int minutosPorEps){
        super(nome,anoDeLancamento,incluidoNoPlano, (epsPorTemporadas * minutosPorEps) * temporadas);
        this.somaDasAvaliacoes = 0;
        this.totalAvaliacoes = 0;
        this.temporadas = temporadas;
    }

    @Override
    public String exibirfichaTecnica() {
        return String.format("""
               
               Nome: %s 
               Ano de lançamento: %d
               Incluído no plano: %b
               Avaliação: %.1f
               Total de Avaliações: %d
               Duração em minutos: %d
               Temporadas: %d
               Média de valiações: %.1f
               
               """, this.nome, this.anoDeLancamento, this.incluidoNoPlano, this.somaDasAvaliacoes, this.totalAvaliacoes, this.duracaoEmMinutos, this.temporadas, mediaAvaliacoes());
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpsPorTemporadas() {
        return epsPorTemporadas;
    }

    public void setEpsPorTemporadas(int epsPorTemporadas) {
        this.epsPorTemporadas = epsPorTemporadas;
    }

    public int getMinutosPorEps() {
        return minutosPorEps;
    }

    public void setMinutosPorEps(int minutosPorEps) {
        this.minutosPorEps = minutosPorEps;
    }

    @Override
    public String toString() {
        return "Serie " + this.getNome();
    }
}
