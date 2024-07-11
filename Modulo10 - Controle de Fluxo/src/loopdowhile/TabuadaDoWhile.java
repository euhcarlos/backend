package loopdowhile;

import java.util.Scanner;

public class TabuadaDoWhile {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String resposta = "";

        do {
            System.out.println("Digite um numero para gerar tabuada: ");
            Integer valor = s.nextInt();

            for(int contador = 0; contador <= 10; contador++){
                System.out.println(valor + "x" + contador + " = " + valor*contador);
            }

            System.out.println("Desejar gerar tabuada(s/n): ");
            resposta = s.next();
        }while (resposta.equalsIgnoreCase("s"));

        System.out.println("Obrigado");
    }
}
