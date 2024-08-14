/*2. Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
números 4, 5 e 6. A soma das duas médias. A média das médias. */


public class Ex2 {
    public static void main(String[] args){ 
        int primeiraMedia = ((8 + 7 + 9)/3);
        System.out.println("Media dos numeros 8, 9 e 7 é: " + primeiraMedia);

        int segundaMedia = ((4 + 5 + 6)/3);
        System.out.println("Média dos numeros 4, 5 e 6 é: " + segundaMedia);

        int somaMedia = (segundaMedia + primeiraMedia);
        System.out.println("A soma das médias será igual a: "+ somaMedia);

        int terceiraMedia = ((segundaMedia + primeiraMedia)/2);
        System.out.println("A média das médias será igual a: "+ terceiraMedia);




    }
    
}
