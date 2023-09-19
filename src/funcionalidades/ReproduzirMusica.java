package funcionalidades;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import util.Util;

public class ReproduzirMusica { 
    private static Scanner scanner = new Scanner(System.in);

    private static List<String> colecaoDeMusica = Arrays.asList("Fancy", "Fell Special", "Likey", "Piloto");

    public ReproduzirMusica(){
        acoesDoApp();
    }


    public static void tocar(){
        Util.forEach(colecaoDeMusica, "Tocando: ", 2000);
    };

    public static void pausar(){
        System.out.println("Pausando as músicas...");
    };

    public static void selecionarMusica(){
        AtomicInteger index = new AtomicInteger();
        Arrays.stream(colecaoDeMusica.toArray()).map(str -> index.getAndIncrement() + 1 + " - " + str).forEach(System.out::println);
        
        int musicaEscolhida = scanner.nextInt();

        System.out.println("Tocando " + musicaEscolhida);
    };

    public static void acoesDoApp(){
        String[] opcoesMusica = {"tocar música.", "pausar.", "Selecionar música.", "Sair do app Reproduzir Música"};

        int escolhaDaMusica = Util.imprimirOpcoes(opcoesMusica);

        while (escolhaDaMusica != 4) {
            if(escolhaDaMusica == 1){
                tocar();
            } else if(escolhaDaMusica == 2){
                pausar();
            } else if(escolhaDaMusica == 3){
                selecionarMusica();
            }

            escolhaDaMusica = Util.imprimirOpcoes(opcoesMusica);
        }
    }
}
