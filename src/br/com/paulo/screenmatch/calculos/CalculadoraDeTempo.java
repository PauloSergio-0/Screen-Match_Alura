package br.com.paulo.screenmatch.calculos;

import br.com.paulo.screenmatch.modelos.Filme;
import br.com.paulo.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo item){
        this.tempoTotal += item.getDuracaoEmMinutos();
    }
}
