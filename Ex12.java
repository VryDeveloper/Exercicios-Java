
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdSorvetes = 0;
        double valorTotal = 0;
        double valorSorvete = 0;
        boolean finalizarPedido = false;

        System.out.println("Bem-vindo à Sorveteria Java!");

        while (!finalizarPedido) {
            System.out.println("\nOpções de Sorvetes:");
            System.out.println("1. 1 Bola casquinha - R$6,00");
            System.out.println("2. 2 Bolas casquinha - R$9,00");
            System.out.println("3. 2 Bolas cascão recheado - R$12,00");
            System.out.print("Escolha uma opção de sorvete (ou '0' para finalizar o pedido): ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 0:
                    finalizarPedido = true;
                    break;
                case 1:
                    valorSorvete = 6.00;
                    break;
                case 2:
                    valorSorvete = 9.00;
                    break;
                case 3:
                    valorSorvete = 12.00;
                    break;
                default:
                    System.out.println("Opção Invalida.");
                    break;
            }
            if (opcao >= 1 && opcao <= 3) {
                System.out.println("Quantas unidades desse sorteve?");
                int qtd = sc.nextInt();
                qtdSorvetes += qtd;
                valorTotal += valorSorvete * qtd;

                for (int i = 1; i <= qtd; i++) {
                    System.out.println("Deseja cobertura no º"+i+" 1 - Sim, 2 - Não?");
                    int escolhaCobertura = sc.nextInt();

                    if (escolhaCobertura == 1) {
                        System.out.println("Opções de Cobertura");
                        System.out.println("1. Chocolate = R$2,00");
                        System.out.println("2. Morango - R$2,00");
                        System.out.println("3. Avelã - R$3,00");
                        int opcaoCobertura = sc.nextInt();

                        switch (opcaoCobertura) {
                            case 1:
                            case 2:
                                valorTotal += 2.00;
                                break;
                            case 3:
                                valorTotal += 3.00;
                                break;
                            default:
                                System.out.println("Opção invalida.");
                                break;
                        }
                    }
                }
            }
        }
        System.out.println("\nResumo do Pedido:");
        System.out.println("Quantidade de Sorvetes: "+ qtdSorvetes);
        System.out.println("Valor Total: R$" + valorTotal);
        System.out.println("Obrigado pela preferência!");
        sc.close();

    }
}
