package br.com.screenmatch;

import br.com.screenmatch.filme.Filme;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Top GUN", 1990,false, 199);

        meuFilme.avaliarFilme(5.0);
        meuFilme.avaliarFilme(3.9);
        meuFilme.avaliarFilme(5.0);
        System.out.println(meuFilme.exibirfichaTecnica());
    }
}
