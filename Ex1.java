/*1. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
*/

import java.util.Scanner;

public class Ex1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("---Leitor de Dias---");
        System.out.println("Digite a Quantidade de Anos: ");
        int anos = sc.nextInt();
        System.out.println("Digite a Qauntidade de Meses: ");
        int meses = sc.nextInt();
        System.out.println("Digite a Quantidade de Dias: ");
        int dias = sc.nextInt();

        System.out.println("Anos: " + anos + " Meses: " + meses + " Dias: " + dias);
        System.out.println("O total de dias corresponde a: " + (((anos * 365) + meses * 30) + dias));


        

        sc.close();        
    }
}