package estruturadecisao;

import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        Double nota1 = in.nextDouble();
        System.out.println("Digite a segunda nota: ");
        Double nota2 = in.nextDouble();
        double media = (nota1 + nota2)/2;
        if(media >= 7){
            System.out.println("O aluno foi aprovado. Nota final: " + media);
        }else {
          System.out.println("O aluno foi reprovado. Nota final: " + media);
        }

    }
}
