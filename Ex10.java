/* Faça um codigo que registre a nota de 10 alunos e some o total das notas. depois, imprima a média. */

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos: ");

        int totalAlunos = sc.nextInt();
        double somaNotas = 0;

        System.out.println("Informe as notas dos " + totalAlunos + " alunos.");
        for(int i = 1; i <= totalAlunos; i++){
            System.out.println("Nota do aluno " + i + ":");
            double nota = sc.nextDouble();
            somaNotas += nota;
        }
        double mediaNotas = somaNotas / totalAlunos;
        System.out.println("A média das notas da sala é igual a: " + mediaNotas);
    }
}
