package list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExemploLinkedList {

    public static void main(String[] args) {
        exemploListaSimples();
    }

    private static void exemploListaSimples() {
        System.out.println("**** LISTA SIMPLES ****");
        List<String> pessoas = new LinkedList<>();
        pessoas.add("Ferreira");
        pessoas.add("Eduardo");
        pessoas.add("Carlos");
        System.out.println(pessoas);
        System.out.println("");
    }
}
