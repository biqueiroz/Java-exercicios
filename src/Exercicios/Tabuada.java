package Exercicios;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quero ver a tabuada do número: ");
        int tabuada = scan.nextInt();

        System.out.println("A taubada de " + tabuada + " é:");

        for(int i = 1; i <= 10; i++){
            System.out.println(tabuada + " x " + i + " = " + (tabuada*i));
        }
    }
}
