/*Sistem de Cafeteria */

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo a Cafeteria Java!");

        int valorTotal = 0;
        int qtdCafes = 0;
        boolean continuarPedido = true;
        double preco = 0;

        while (continuarPedido) {
            System.out.println("Escolha o Tamanhado do seu café: (P) Pequeno, (M) Médio, (G) Grande.");
            System.out.println("Escolha o tamnhado (Ou digite 'F' para finalizar o pedido.)");
            String tamanhoCafe = sc.nextLine().toUpperCase();

            if (tamanhoCafe.equals("F")){
                continuarPedido = false;
            } else {

                System.out.println("Escolha o tipo de café: (E) Espresso, (C) Cappucino, (L) Latte");
                String tipoCafe = sc.nextLine().toUpperCase();

                switch (tamanhoCafe) {
                    case "P":
                        preco += 2.50;
                        break;
                    case "M":
                        preco += 3.00;
                        break;
                    case "G":
                        preco += 3.50;
                        break;
                    default:
                        System.out.println("Opção Invalida.");
                        continue;
                }
                switch (tipoCafe) {
                    case "E":
                        preco += 1.50;
                        System.out.println("Café Expresso selecionado");
                        break;
                    case "C":
                        preco += 2.00;
                        System.out.println("Café Cappuccino selecionado");
                        break;
                    case "L":
                        preco += 2.50;
                        System.out.println("Café Latte selecionado");
                        break;
                    default:
                        System.out.println("Opção de café inválida!");
                        continue;
                }
                valorTotal += preco;
                qtdCafes++;
                System.out.println("Café adicionado ao pedido!");
            }
        }
        if (preco == 0){
            System.out.println("Pedido Finalizado.");
        }
        else if (preco != 0) {
            System.out.println("Seu pedido foi finalizado. Total a pagar: R$" + valorTotal);
            System.out.println("Total de cafés incluidos: " + qtdCafes);
        }
        sc.close();
    }
}
