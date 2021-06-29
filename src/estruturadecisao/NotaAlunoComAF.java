package estruturadecisao;

import java.util.Scanner;

public class NotaAlunoComAF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        Double nota1 = in.nextDouble();
        System.out.println("Digite a segunda nota: ");
        Double nota2 = in.nextDouble();
        double media = (nota1 + nota2)/2;
        if(media >= 7){
            System.out.println("O aluno foi aprovado. Nota final: " + media);
        }else if (media <= 4){
          System.out.println("O aluno foi reprovado. Nota final: " + media);
        }else {
            System.out.println("Aluno de AF. Nota parcial: " + media);
            System.out.println("Digite a nota da AF: ");
            double nota3 = in.nextDouble();
            media = (media + nota3)/2;
            if(media >= 6){
                System.out.println("Aluno aprovado. Nota final com AF: " + media);
            }else {
                System.out.println("Aluno reprovado. Nota final com AF: " + media);
            }
        }

    }
}
