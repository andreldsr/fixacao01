package estruturarepeticao;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o numero desejado");
        int numero = in.nextInt();
        if(numero <= 0 || numero > 10){
            System.out.println("Numero " + numero + " é invalido");
        }else {
            for (int i = 1; i <= 10; i++){
                System.out.println(numero + " X " + i + " = " + numero * i);
            }
        }
    }
}
