package estruturasequencial;

import java.util.Scanner;

public class MediaPeso {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        double[] numeros = new double[4];
        numeros[0] = in.nextDouble();
        System.out.println("Digite o peso do primeiro numero");
        numeros[1] = in.nextDouble();
        System.out.println("Digite o segundo numero");
        numeros[2] = in.nextDouble();
        System.out.println("Digite o peso do segundo numero");
        numeros[3] = in.nextDouble();
        double media = numeros[0] * numeros[1] + numeros[2] * numeros[3];
        media /= (numeros[1] + numeros[3]);
        System.out.println("A media dos numeros digitados é " + media);
    }
}
