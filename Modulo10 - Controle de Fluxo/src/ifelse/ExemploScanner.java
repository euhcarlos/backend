package ifelse;

import java.util.Scanner;

public class ExemploScanner {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = s.nextInt();

        if(valor >= 10){
            System.out.println("Numero maior que 10");
        } else {
            System.out.println("Numero menor que 10");
        }
    }
}
