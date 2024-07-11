package atividade;

import java.util.Scanner;

public class MediaAluno {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Deseja gerar media(s/n): ");
        String resposta = s.next();

        while (resposta.equalsIgnoreCase("s")){
            System.out.println("Notas primeiro bimestre: ");
            double n1 = s.nextDouble();
            System.out.println("Notas segundo bimestre: ");
            double n2 = s.nextDouble();
            System.out.println("Notas terceiro bimestre: ");
            double n3 = s.nextDouble();
            System.out.println("Notas quarto bimestre: ");
            double n4 = s.nextDouble();

            double media = (n1 + n2 + n3 + n4) / 4;

            System.out.println("");

            if(media < 0 || media > 10){
                System.out.println("MEDIA INVALIDA");
            } else if (media >= 7){
                System.out.println("Resultado: "+"Aprovado" + " - " + "Media: " + media);
            } else {
                System.out.println("Resultado: "+"Reprovado" + " - " + "Media: " + media);
            }

            System.out.println("");

            System.out.println("Deseja gerar media(s/n): ");
            resposta = s.next();
        }

        System.out.println("OBRIGADO");
    }
}
