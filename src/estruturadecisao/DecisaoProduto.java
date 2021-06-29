package estruturadecisao;

import java.util.Scanner;

public class DecisaoProduto {
    public static void main(String[] args) {
        String[] produtos = {"Arroz", "Macarrao", "Farofa"};
        Scanner in = new Scanner(System.in);
        Double[] precos = new Double[3];
        System.out.println("Qual o preco do " + produtos[0]);
        precos[0] = in.nextDouble();
        System.out.println("Qual o preco do " + produtos[1]);
        precos[1] = in.nextDouble();
        System.out.println("Qual o preco do " + produtos[2]);
        precos[2] = in.nextDouble();
        Double menorPreco = precos[0];
        int indexMenorPreco = 0;
        if(menorPreco > precos[1]){
            indexMenorPreco = 1;
        }
        if(menorPreco > precos[2]){
            indexMenorPreco = 2;
        }
        System.out.println("Voce deve comprar " + produtos[indexMenorPreco] + " que custa R$" + precos[indexMenorPreco]);
    }
}
