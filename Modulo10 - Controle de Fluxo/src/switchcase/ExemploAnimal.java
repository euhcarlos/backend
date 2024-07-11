package switchcase;

import java.util.Scanner;

public class ExemploAnimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um animal doméstico:");
        System.out.println("Opções: Dog (Cachorro), Cat (Gato), Bird (Pássaro)");
        String animal = scanner.nextLine().trim(); // Lê a entrada e remove espaços em branco

        switch (animal.toLowerCase()) {
            case "dog":
                System.out.println("Você escolheu um Cachorro.");
                System.out.println("- Cães são conhecidos por sua lealdade e companheirismo.");
                break;
            case "cat":
                System.out.println("Você escolheu um Gato.");
                System.out.println("- Gatos são conhecidos por sua independência e habilidade de caça.");
                break;
            case "bird":
                System.out.println("Você escolheu um Pássaro.");
                System.out.println("- Pássaros são animais que possuem penas e são capazes de voar.");
                break;
            default:
                System.out.println("Animal não reconhecido como doméstico.");
                break;
        }
    }
}
