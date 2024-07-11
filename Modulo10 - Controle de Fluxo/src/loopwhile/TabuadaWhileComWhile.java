package loopwhile;

import java.util.Scanner;

public class TabuadaWhileComWhile {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Deseja gerar tabuada(s/n): ");
        String resposta = s.next();

        while (resposta.equalsIgnoreCase("s")){
            System.out.println("Digite um valor para tabuada: ");
            Integer valor = s.nextInt();

            int contador = 1;
            while (contador <= 10){
                System.out.println(valor + "x" + contador + " = " + valor*contador);
                contador++;
            }

            System.out.println("Deseja gerar tabuada(s/n): ");
            resposta = s.next();
        }
        System.out.println("Obrigado, Tchau");
    }
}
