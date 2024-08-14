/*5. Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
(1SM=R$788,00)
 */

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sm = 788.00;

        System.out.println("Digite o seu salário: ");
        double salarioUsuario = sc.nextInt();

        System.out.printf("Seu salario equivale a: %.2f %n", salarioUsuario / sm);

        
        sc.close();

    }

}