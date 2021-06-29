package estruturarepeticao;

import java.util.Scanner;

public class NotaValida {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero entre 0 e 10");
        int numero = in.nextInt();
        boolean numeroEhValido = (numero >= 0 && numero <= 10);
        while (!numeroEhValido){
            System.out.println("Numero " + numero + " nao é valido. Digite um numero entre 0 e 10: ");
            numero = in.nextInt();
            numeroEhValido = (numero >= 0 && numero <= 10);
        }
        System.out.println("Numero digitado é valido. Nota " + numero);
    }
}
