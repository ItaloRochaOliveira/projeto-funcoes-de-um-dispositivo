import java.util.Scanner;

import funcionalidades.ReproduzirMusica;

public class Dispositivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ReproduzirMusica appMusica = new ReproduzirMusica();

        
        // int opcoes = scanner.nextInt();

        // if(opcoes == 1){
        //     appMusica.tocar();
        // }

        appMusica.selecionarMusica();
        
    }
}
