package atividade.calculadora;

public class CalculadoraMain {

    public static void main(String[] args) {
        Calculadora minhaCalculadora = new Calculadora(50, 25);

        System.out.println("Soma: " + minhaCalculadora.somar());
        System.out.println("Dividir: " + minhaCalculadora.dividir());
        System.out.println("Multiplicar: " + minhaCalculadora.multiplicar());
        System.out.println("Subtrair: " + minhaCalculadora.subitrair());
    }
}
