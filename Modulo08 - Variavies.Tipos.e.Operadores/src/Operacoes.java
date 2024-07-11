public class Operacoes {

    public static void main(String[] args) {
        operacoesAritmeticas();
        operacoesAtribuicao();
        operacoesRelacionais();
        operacoesLogicas();
        operacoesIncrementoeDecremento();
    }

    private static void operacoesIncrementoeDecremento() {
        System.out.println("**** OPERADORES INCREMENTO E DECREMENTO ****");
        int n1 = 10;
        int valorSoma = n1++;
        int valorSubtracao = n1--;

        System.out.println("Incremento: " + valorSoma);
        System.out.println("Decremento: " + valorSubtracao);
    }

    private static void operacoesLogicas() {
        System.out.println("**** OPERADORES LOGICA ****");
        int n1 = 10;
        int n2 = 23;

        int n3 = 20;
        int n4 = 15;

        boolean isValor = n1 >= n2 && n3 > n4;
        boolean isValor2 = n1 <= n2 || n3 > n4;
        boolean isValor3 = !(n1 <= n2 || n3 > n4);

        System.out.println("E: " + isValor);
        System.out.println("Ou: " + isValor2);
        System.out.println("NOT: " + isValor3);
    }

    private static void operacoesRelacionais() {
        System.out.println("**** OPERADORES RELACIONAIS ****");
        int n1 = 10;
        int n2 = 23;

        boolean igual = n1 == n2;
        boolean diferente = n1 != n2;
        boolean maior = n1 > n2;
        boolean maiorOuIgual = n1 > n2;
        boolean menor = n1 < n2;
        boolean menorOuIgual = n1 <= n2;

        System.out.println("Igual: " + igual);
        System.out.println("Diferente: " + diferente);
        System.out.println("Maior: " + maior);
        System.out.println("Maior Ou Igual: " + maiorOuIgual);
        System.out.println("Menor: " + menor);
        System.out.println("menor Ou Igual: " + menorOuIgual);
    }

    private static void operacoesAtribuicao() {
        System.out.println("**** OPERADORES ATRIBUICAO ****");
        int valor = 10;
        int valor2 = 10;
        System.out.println(valor);
        System.out.println(valor += 10);
        System.out.println(valor -= 10);

        System.out.println(valor2);
        System.out.println(valor += valor2);
        System.out.println(valor -= valor2);
    }

    private static void operacoesAritmeticas() {
        System.out.println("**** OPERADORES ARITMETICOS ****");
        int valor = 10;
        int valor1 = 2;

        int subtracao = valor - valor;

        System.out.println("Soma: " + valor1 + valor);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicar: " + valor * valor1);
        System.out.println("Dividir: " + valor1 / valor);
    }


}
