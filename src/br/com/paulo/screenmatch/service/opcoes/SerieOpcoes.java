package br.com.paulo.screenmatch.service.opcoes;


import br.com.paulo.screenmatch.modelos.Serie;

import java.util.Locale;
import java.util.Scanner;

public class SerieOpcoes {
    private final Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public Serie cadastraSerie(){
        System.out.println("--Cadastro de SERIE--");

        System.out.println("Qual o nome: ");
        String nome = scanner.nextLine();

        System.out.println("Qual o ano de Lançamento: ");
        int anoLancamento= scanner.nextInt();
        scanner.nextLine();

        System.out.println("Quantas temporadas: ");
        int temporadas = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Quantos episodios por temporadas: ");
        int eps = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Incluso no plano: S/N");
        String inclusoNoPlano = scanner.nextLine();

        System.out.println("Duracao em minutos dos eps: ");
        int epsDuracao = scanner.nextInt();
        scanner.nextLine();
        return new Serie(nome,anoLancamento,isIncluso(inclusoNoPlano),temporadas,eps, epsDuracao);

    }

    private boolean isIncluso(String opcao){
        if(opcao.equals("S")){
            return true;
        } else if (opcao.equals("N")){
            return false;
        }
        return false;

    }
}
