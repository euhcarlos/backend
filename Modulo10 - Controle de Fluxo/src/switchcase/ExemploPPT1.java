package switchcase;

import java.util.Scanner;

public class ExemploPPT1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma bebida:");
        System.out.println("1 - Café");
        System.out.println("2 - Chá");
        System.out.println("3 - Suco");
        System.out.println("4 - Refrigerante");
        System.out.print("Digite o número correspondente: ");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Você escolheu Café.");
                break;
            case 2:
                System.out.println("Você escolheu Chá.");
                break;
            case 3:
                System.out.println("Você escolheu Suco.");
                break;
            case 4:
                System.out.println("Você escolheu Refrigerante.");
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha uma opção de 1 a 4.");
                break;
        }

        scanner.close();
    }
}
