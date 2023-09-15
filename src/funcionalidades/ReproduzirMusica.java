package funcionalidades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class ReproduzirMusica { 
    private List<String> colecaoDeMusica = Arrays.asList("Fancy", "Fell Special", "Likey", "Piloto");

    public ReproduzirMusica(){
        // System.out.println("Escolhar o que fazer no app de musica: ");
        // System.out.println("1 - tocar música.");
        // System.out.println("2 - pausar.");
        // System.out.println("3 - Selecionar música.");
    }


    public void tocar(){
        Consumer<String> tocarMusicas = musica -> {
            System.out.println("Tocando: " + musica);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        };
        colecaoDeMusica.stream().forEach(tocarMusicas);
    };

    public void pausar(){
        System.out.println("Pausando as músicas...");

        // thr1 = Thread.currentThread();
        // try { Thread.sleep(10000); } catch (InterruptedException ex) {
        //     System.out.println ("Puxa, estava dormindo! Você me acordou");
        // }
        // Thread 2:

        // thr1.interrupt();   
    };

    public void selecionarMusica(){
        AtomicInteger index = new AtomicInteger();
        Arrays.stream(colecaoDeMusica.toArray()).map(str -> index.getAndIncrement() + 1 + " - " + str).forEach(System.out::println);
        
    };
}
