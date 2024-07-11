package atividade.calculadora;

public class Calculadora {

    private double operador;
    private double operador2;

    public Calculadora(double operador, double operador2) {
        this.operador = operador;
        this.operador2 = operador2;
    }

    public Double somar(){
        return operador + operador2;
    }

    public Double subitrair(){
        return operador - operador2;
    }

    public Double multiplicar(){
        return operador * operador2;
    }

    public Double dividir(){
        if(operador == 0 || operador2 == 0){
            System.out.println("Numero para dividir 0");
        }
        return operador / operador;
    }
}
