package loopwhile;

import java.util.Scanner;

public class TabuadaWhileComFor {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Deseja gerar tabuada(s/n): ");
        String resposta = s.next();

        while (resposta.equalsIgnoreCase("s")){
            System.out.println("Digite um valor para tabuada: ");
            Integer valor = s.nextInt();

            for(int contador = 0; contador <= 10; contador++){
                System.out.println(valor + "x" + contador + " = " + valor*contador);
            }

            System.out.println("Deseja gerar tabuada(s/n): ");
            resposta = s.next();
        }

        System.out.println("Obrigado, Tchau");
    }
}
