import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Valor do Saldo ");
        double saldo = sc.nextInt();

        double saldoAjustado = ((saldo * 0.01) + saldo);
        System.out.println("O saldo com reajuste de 1% será igual a: " + saldoAjustado);

        sc.close();
    }
}
