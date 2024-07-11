package loopfor;

import java.util.Scanner;

public class TabuadaFor {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um numero para gerar uma tabuada: ");
        Integer valor = s.nextInt();

        for(int i = 0; i <= 10; i++){
            System.out.println(valor + " X " + i + " = " + valor*i);
        }
    }
}
