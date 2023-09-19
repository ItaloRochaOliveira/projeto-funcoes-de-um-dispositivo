import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReproduzirMusica;

import util.Util;

public class Dispositivo {
    public Dispositivo() throws InterruptedException {
        System.out.println("Iniciando dispositivo...");

        Thread.sleep(2000);
    }

    public static void main(String[] args) {

        String[] opcoes = {"Reprodutor musical", "Aparelho telefônico", "Navegador", "Sair"};

        System.out.println("Escolha o que deseja fazer com o aparelho:");

        int escolha = Util.imprimirOpcoes(opcoes);

        while (escolha != 4) {
            if(escolha == 1){
                new ReproduzirMusica();
            } else if(escolha == 2){
                new AparelhoTelefonico();
            } else if(escolha == 3){
                new NavegadorInternet();
            }


            escolha = Util.imprimirOpcoes(opcoes);
        }
        
    }
}
