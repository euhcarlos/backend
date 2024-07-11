package ifelse;

public class ExemploIdade {

    public static void main(String[] args) {
        int idade = 10;

        if(idade >= 1 && idade <= 5){
            System.out.println("Voce e um bebe");
        } else if (idade >= 6 && idade <= 12) {
            System.out.println("Voce e uma crianca");
        } else if (idade >= 13 && idade <= 15) {
            System.out.println("Voce e um pre adolescente");
        } else if(idade >= 16 && idade <= 23){
            System.out.println("Voce e adolescente");
        } else if (idade >= 24 && idade <= 34) {
            System.out.println("Voce e um adulto");
        } else {
            System.out.println("Esta acima da idade");
        }
    }
}
