package funcionalidades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import util.Util;

public class NavegadorInternet {
    private static Scanner scanner = new Scanner(System.in);


    public NavegadorInternet(){
        acoesDoApp();
    }

    public static Map<String, String> paginas = new HashMap<>();

    public static String paginaAtual = null;

    public static void exibirPagina(){
        if(paginas.isEmpty()){
            System.out.println("Ainda não há páginas abertas...");
        } else {
            System.out.println(paginas);
        }
    }
    public static void adicionarNovaAba(){
        System.out.println("Adicionando nova aba...");

        System.out.println("Pesquise no navegador ou escreva um URL."); 
        String pesquisa = scanner.nextLine();

        int randomNum = (int)(Math.random() * 101);

        paginas.put("www."+randomNum+".com", pesquisa);

        paginaAtual = paginas.get("www."+randomNum+".com");

        System.out.println("Aqui está o resultado da pesquisar: Ainda não há no banco de dados dados sobre esse assunto...");
    }
    public static void atualizarPagina(){
        System.out.println("Atualizando página atual.");
    }

    public static void acoesDoApp(){
        String[] opcoesAparelho = {"Exibir página.", "Adicionar nova aba.", "Atualizar página atual.", "Sair do app NAvegador"};

        int escolhaAparelho = Util.imprimirOpcoes(opcoesAparelho);

        while (escolhaAparelho != 4) {
            if(escolhaAparelho == 1){
                exibirPagina();
            } else if(escolhaAparelho == 2){
                adicionarNovaAba();
            } else if(escolhaAparelho == 3){
                atualizarPagina();
            }

            escolhaAparelho = Util.imprimirOpcoes(opcoesAparelho);
        }
    }
}
