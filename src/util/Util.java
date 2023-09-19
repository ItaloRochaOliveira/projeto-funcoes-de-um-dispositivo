package util;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class Util {
    public static int imprimirOpcoes(String[] array){
        Scanner scanner = new Scanner(System.in);


        AtomicInteger index = new AtomicInteger();
        Arrays.stream(array).map(str -> index.getAndIncrement() + 1 + " - " + str).forEach(System.out::println);

        int escolha = scanner.nextInt();

        return escolha;
    }

    public static void forEach(List<String> listaParaImpressao, String message, long time){
        Consumer<String> consumer = value -> {
            System.out.println(message + value);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
            }
        };
        listaParaImpressao.stream().forEach(consumer);
    }
}
