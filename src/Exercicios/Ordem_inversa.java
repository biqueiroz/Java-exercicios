package Exercicios;

public class Ordem_inversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4}; /*a ordem que insiro os elementos no array determina sua posição*/

        System.out.println("Vetor original: ");
        int count = 0;
        while(count < (vetor.length)) {
            System.out.println(vetor[count] + " ");
            count++;
        }
        System.out.println("Vetor inverso: ");
        for(int i = (vetor.length - 1); i >= 0; i--) {
            System.out.println(vetor[i] + " ");
        }

    }
}
