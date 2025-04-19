package br.com.paulo.screenmatch.calculos;

public class RecomendacaoFiltro { ;

    public void filtro(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Esta entre os preferidos");
        } else if (classificavel.getClassificacao() >= 20){
            System.out.println("Bem avaliado");
        }else {
            System.out.println("Não recomendado");
        }
    }
}
