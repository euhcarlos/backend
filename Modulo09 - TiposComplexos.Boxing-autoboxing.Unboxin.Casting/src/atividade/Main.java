package atividade;

public class Main {

    public static void main(String[] args) {
        int valor = 10;
        System.out.println(valor);

        Integer valor2 = Integer.valueOf(valor);
        System.out.println(valor2);

        int valor3 = valor2;
        System.out.println(valor3);

        /*Casting*/
        long cpf = valor;

        Long cpf2 = Long.valueOf(cpf);
        System.out.println(cpf2);

        int cpf3 = (int) cpf;
        System.out.println(cpf3);
    }
}
