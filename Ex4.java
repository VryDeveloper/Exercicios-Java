/*4. Escrever um algoritmo que lê:
- a porcentagem do IPI a ser acrescido no valor das peças
- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
 */

import java.util.Scanner;


public class Ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a porcentagem do IPI: ");
        int ipi = sc.nextInt();
        int ipiPorcentagem = ipi / 100 + 1;

        System.out.println("Digite o codigo do peças 1: ");
        int peca1 = sc.nextInt();
        System.out.println("Digite o Valor Unitario do peças 1: ");
        double valorpecas1 = sc.nextDouble();
        System.out.println("Digite a quantidade de peças 1: ");
        int qtdpecas1 = sc.nextInt();

        System.out.println("Digite o codigo do peças 2: ");
        int peca2 = sc.nextInt();
        System.out.println("Digite o Valor Unitario do peças 2: ");
        double valorpecas2 = sc.nextDouble();
        System.out.println("Digite a quantidade de peças 2: ");
        int qtdpecas2 = sc.nextInt();

        System.out.println("Digite o codigo do peças 3: ");
        int peca3 = sc.nextInt();
        System.out.println("Digite o Valor Unitario do peças 3: ");
        double valorpecas3 = sc.nextDouble();
        System.out.println("Digite a quantidade de peças 3: ");
        int qtdpecas3 = sc.nextInt();

        double valorTotal = ((valorpecas1*qtdpecas1)+(valorpecas2*qtdpecas2)+(valorpecas3*qtdpecas3)/ipi/100 + 1);
        System.out.println("Valor todas das Peças será: " + valorTotal);

    





        



    }
}
