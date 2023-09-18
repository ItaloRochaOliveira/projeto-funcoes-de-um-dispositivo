import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import funcionalidades.ReproduzirMusica;

public class Dispositivo {
    public Dispositivo() throws InterruptedException {
        System.out.println("Iniciando dispositivo...");

        Thread.sleep(2000);
    }

    public static void main(String[] args) {

        String[] opcoes = {"Reprodutor musical", "Aparelho telefônico", "Navegador", "Sair"};

        System.out.println("Escolha o que deseja fazer com o aparelho:");

        int escolha = imprimirOpcoes(opcoes);

        while (escolha != 4) {
            if(escolha == 1){
                ReproduzirMusica appMusica = new ReproduzirMusica();
            }


            escolha = imprimirOpcoes(opcoes);
        }


        
        // int opcoes = scanner.nextInt();

        // if(opcoes == 1){
        //     appMusica.tocar();
        // }

        // appMusica.selecionarMusica();
        
    }

    public static int imprimirOpcoes(String[] array){
        Scanner scanner = new Scanner(System.in);

        AtomicInteger index = new AtomicInteger();
        Arrays.stream(array).map(str -> index.getAndIncrement() + 1 + " - " + str).forEach(System.out::println);

        int escolha = scanner.nextInt();

        return escolha;
    }
}
