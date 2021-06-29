package estruturadecisao;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        double numero1 = in.nextDouble();
        System.out.println("Digite o segundo numero");
        double numero2 = in.nextDouble();
        System.out.println("O maior numero é " + (numero1 > numero2? numero1: numero2));
//        System.out.println("O maior numero é " + (Math.max(numero1, numero2)));
    }
}
