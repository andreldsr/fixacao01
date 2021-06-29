package estruturasequencial;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o raio do circulo em metros");
        double raio = in.nextDouble();
        System.out.println("Esse círculo possui area de " + (Math.PI + Math.pow(raio, 2)) + "m");

    }
}
