package list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {

    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
        exemploNumeros();
        exemploPercorrendoUmaLista();
    }

    private static void exemploPercorrendoUmaLista() {
        System.out.println("**** EXEMPLO LISTA NUMEROS ****");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(5);
        numeros.add(3);
        System.out.println(numeros);


        for(Integer numero : numeros){
            System.out.println(numero);
        }
        System.out.println("");
    }

    private static void exemploNumeros() {
        System.out.println("**** EXEMPLO LISTA NUMEROS ****");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(5);
        numeros.add(3);
        System.out.println(numeros);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdemAscendente() {
        System.out.println("**** LISTA SIMPLES ORDEM ASCENDENTE ****");
        System.out.println("**** LISTA SIMPLES ****");
        List<String> pessoas = new ArrayList<>();
        pessoas.add("Ferreira");
        pessoas.add("Eduardo");
        pessoas.add("Carlos");
        System.out.println("Lista sem ordem: " + pessoas);
        Collections.sort(pessoas);
        System.out.println("Lista com ordem: " + pessoas);

        //pessoas.remove(0);
        //pessoas.contains("Carlos");
        System.out.println(pessoas.get(0));
    }

    private static void exemploListaSimples() {
        System.out.println("**** LISTA SIMPLES ****");
        List<String> pessoas = new ArrayList<>();
        pessoas.add("Ferreira");
        pessoas.add("Eduardo");
        pessoas.add("Carlos");
        System.out.println(pessoas);
        System.out.println("");
    }
}
