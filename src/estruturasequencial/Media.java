package estruturasequencial;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        double[] numeros = new double[3];
        numeros[0] = in.nextDouble();
        System.out.println("Digite o segundo numero");
        numeros[1] = in.nextDouble();
        System.out.println("Digite o terceiro numero");
        numeros[2] = in.nextDouble();
        double media = numeros[0] + numeros[1] + numeros[2];
        media /= 3;
        System.out.println("A media dos numeros digitados é " + media);
    }
}
