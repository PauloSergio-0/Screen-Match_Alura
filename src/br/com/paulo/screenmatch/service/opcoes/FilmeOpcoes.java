package br.com.paulo.screenmatch.service.opcoes;

import br.com.paulo.screenmatch.modelos.Filme;

import java.util.Locale;
import java.util.Scanner;

public class FilmeOpcoes {
    private final Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public Filme cradastrarFilme(){
        System.out.println("--Cadastro de FILME--");

        System.out.println("Qual o nome: ");
        String nome = scanner.nextLine();

        System.out.println("Qual o ano de Lançamento: ");
        int anoLancamento= scanner.nextInt();
        scanner.nextLine();

        System.out.println("Qual o diretor: ");
        String diretor = scanner.nextLine();

        System.out.println("Incluso no plano: S/N");
        String inclusoNoPlano = scanner.nextLine();

        System.out.println("Duracao em minutos: ");
        int duracao= scanner.nextInt();
        scanner.nextLine();
        return new Filme(nome,anoLancamento,diretor,isIncluso(inclusoNoPlano),duracao);
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
