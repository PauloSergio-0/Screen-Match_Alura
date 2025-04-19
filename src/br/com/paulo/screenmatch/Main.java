package br.com.paulo.screenmatch;


import br.com.paulo.screenmatch.calculos.CalculadoraDeTempo;
import br.com.paulo.screenmatch.calculos.RecomendacaoFiltro;
import br.com.paulo.screenmatch.modelos.Episodio;
import br.com.paulo.screenmatch.modelos.Filme;
import br.com.paulo.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Top GUN", 1990,"Zack Snyder",false, 199);

        Filme segundoFilme = new Filme("Top GUN maveric", 2022,"Zack Snyder",true, 169);

        Serie minhaSerie = new Serie("Peaky blinders", 2015,false,6,10, 47);

        Episodio episodio = new Episodio(1,"o retorno", minhaSerie,90);

        RecomendacaoFiltro filtro = new RecomendacaoFiltro();
        filtro.filtro(episodio);
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(segundoFilme);
        calculadora.inclui(minhaSerie);

        meuFilme.avaliar(5.0);
        meuFilme.avaliar(3.9);
        meuFilme.avaliar(5.0);
        //System.out.println(meuFilme.exibirfichaTecnica());

        minhaSerie.avaliar(3.3);
        minhaSerie.avaliar(5);
        minhaSerie.avaliar(2.3);
        //System.out.println(minhaSerie.exibirfichaTecnica());
        //System.out.println("Total de horas: " + calculadora.getTempoTotal());
    }
}
