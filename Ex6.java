/*6. Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
antecessor e seu sucessor. */
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um Numero para saber seu Antecessor e seu Sucessor: ");

        int nm = sc.nextInt();

        System.out.print("O antecessor do numero " + nm + " é respectivamente: " +(nm-1)+ " e o sucessor é: " +(nm+1));




    }
    
}
