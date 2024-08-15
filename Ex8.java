/*Crie um jogo de adivinhação de números de 1 a 20 */

import java.util.Scanner;
import java.util.Random;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int numeroSecreto = rd.nextInt(20) + 1;
        int tentativas = 0;
        boolean adivinhou = false;

        System.out.println("--Jogo de Advinhação---");
        System.out.println("Tente adivinhar o número de 1 a 20. ");
        System.out.println("Digite sua tentativa: ");

        while (!adivinhou) {

            tentativas++;
            int tentativa = sc.nextInt();

            if (tentativa == numeroSecreto) {
                System.out.println("Parabéns! Voce acertou o número secreto em " + tentativas + " tentativas.");
                adivinhou = true;
            } else if (tentativa > numeroSecreto) {
                System.out.println("Tente um número menor...");

            } else {
                System.out.println("Tente um número maior...");
            }

        }
        sc.close();
    }
}