/*1. Escreva um programa que, com base em uma temperatura em graus celsius, 
a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), 
seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67 */

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Conversor de Temperatura Celcius---");
        System.out.println("Digite a temperatura em Celcius a ser convertida em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F).");
        double C = sc.nextDouble();

        double F = C * 1.8 + 32;
        double K = C + 273.15;
        double Re = C * 0.8;
        double Ra = C * 1.8 + 32 + 459.67;

        System.out.println("A temperatura em Celsius equivale a: ");
        System.out.printf("Fahrenheit (F): = %.2f %n", F);
        System.out.printf("Kelvin (K): = %.2f %n", K);
        System.out.printf("Réaumur (Re): = %.2f %n", Re);
        System.out.printf("Rankine (Ra): = %.2f %n", Ra);

    }
}
