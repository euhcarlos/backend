package loopwhile;

import java.util.Scanner;

public class TabuadaWhile {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Deseja gerar tabuada(s/n): ");
        String resposta = s.next();

        Integer contador = 0;
        Integer valor = 0;

        if(resposta.equalsIgnoreCase("S")){
            System.out.println("Digite um valor para tabuada: ");
            valor = s.nextInt();
        }

        while (resposta.equalsIgnoreCase("s")){
            contador++;
            if(contador <= 10){
                System.out.println(valor + "x" + contador + " = " + valor*contador);
                continue;
            }

            contador = 0;
            System.out.println("Deseja gerar tabuada(s/n): ");
            resposta = s.next();

            if(resposta.equalsIgnoreCase("s")){
                System.out.println("Digite um valor para tabuada: ");
                valor = s.nextInt();
            }

        }
        System.out.println("Obrigado, Tchau");
    }
}
