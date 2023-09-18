package funcionalidades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class ReproduzirMusica { 
    private static Scanner scanner = new Scanner(System.in);


    private static List<String> colecaoDeMusica = Arrays.asList("Fancy", "Fell Special", "Likey", "Piloto");

    public ReproduzirMusica(){
        acoesDoApp();
    }


    public static void tocar(){
        Consumer<String> tocarMusicas = musica -> {
            System.out.println("Tocando: " + musica);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        };
        colecaoDeMusica.stream().forEach(tocarMusicas);
    };

    public static void pausar(){
        System.out.println("Pausando as músicas...");

        // thr1 = Thread.currentThread();
        // try { Thread.sleep(10000); } catch (InterruptedException ex) {
        //     System.out.println ("Puxa, estava dormindo! Você me acordou");
        // }
        // Thread 2:

        // thr1.interrupt();   
    };

    public static void selecionarMusica(){
        AtomicInteger index = new AtomicInteger();
        Arrays.stream(colecaoDeMusica.toArray()).map(str -> index.getAndIncrement() + 1 + " - " + str).forEach(System.out::println);
        
        int musicaEscolhida = scanner.nextInt();

        System.out.println("Tocando " + musicaEscolhida);
    };

    public static void acoesDoApp(){
        String[] opcoesMusica = {"tocar música.", "pausar.", "Selecionar música.", "Sair do app Reproduzir Música"};

        int escolhaDaMusica = imprimirOpcoes(opcoesMusica);

        while (escolhaDaMusica != 4) {
            if(escolhaDaMusica == 1){
                tocar();
            } else if(escolhaDaMusica == 2){
                pausar();
            } else if(escolhaDaMusica == 3){
                selecionarMusica();
            }

            escolhaDaMusica = imprimirOpcoes(opcoesMusica);
        }
    }

    public static int imprimirOpcoes(String[] array){

        AtomicInteger index = new AtomicInteger();
        Arrays.stream(array).map(str -> index.getAndIncrement() + 1 + " - " + str).forEach(System.out::println);

        int escolha = scanner.nextInt();

        return escolha;
    }
}
