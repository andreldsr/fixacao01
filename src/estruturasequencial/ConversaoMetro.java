package estruturasequencial;

import java.util.Scanner;

public class ConversaoMetro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a distancia em metros");
        double metros = in.nextDouble();
        System.out.println("Essa distancia em metros equivale a " + metros * 100 + " centimetros");

    }
}
