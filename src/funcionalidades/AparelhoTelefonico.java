package funcionalidades;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import util.Util;

public class AparelhoTelefonico {
    public AparelhoTelefonico(){
        acoesDoApp();
    }

    private static List<String> agenda = Arrays.asList("Camila", "Jõao", "Jenifer", "Henrique");

    private static Scanner scanner = new Scanner(System.in);


    public static void ligar(){
        System.out.println("Para quem gostaria de ligar? ");

        Util.forEach(agenda, "", 0);

        String contato = scanner.nextLine();

        System.out.println("Ligando para " + contato);
    }

    public static void atender(){
        int randomNum = (int)(Math.random() * 5);

        System.out.println(agenda.get(randomNum) + " está ligando, deseja atender? [sim / nao] ");

        String resposta = scanner.nextLine();

        if(resposta.equals("sim")){
            System.out.println("Atendendo...");
        } else {
            System.out.println("Chamada encerrada...");
        }


    }

    public static void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz...");
    }

    public static void acoesDoApp(){
        String[] opcoesAparelho = {"Ligar.", "Ateder.", "Iniciar correio de voz.", "Sair do app Telefone"};

        int escolhaAparelho = Util.imprimirOpcoes(opcoesAparelho);

        while (escolhaAparelho != 4) {
            if(escolhaAparelho == 1){
                ligar();
            } else if(escolhaAparelho == 2){
                atender();
            } else if(escolhaAparelho == 3){
                iniciarCorreioVoz();
            }

            escolhaAparelho = Util.imprimirOpcoes(opcoesAparelho);
        }
    }
}
