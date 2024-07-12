package set.linkedhashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploLinkedHashSet {

    public static void main(String[] args) {
        exemploListaSimples();
        exemploConsultando();
        exemploRemovendo();
    }

    private static void exemploRemovendo() {
        System.out.println("**** LISTA SIMPLES REMOVENDO ****");

        Set<String> lista = new LinkedHashSet<>();
        lista.add("Ferreira");
        lista.add("Carlos");
        lista.add("Eduardo");
        lista.remove("Carlos");
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploConsultando() {
        System.out.println("**** LISTA SIMPLES CONSULTA ****");

        Set<String> lista = new LinkedHashSet<>();
        lista.add("Ferreira");
        lista.add("Carlos");
        lista.add("Eduardo");
        System.out.println(lista.contains("Carlos"));
        System.out.println("");
    }

    private static void exemploListaSimples() {
        System.out.println("**** LISTA SIMPLES ****");
        Set<String> lista = new LinkedHashSet<>();
        lista.add("Ferreira");
        lista.add("Carlos");
        lista.add("Eduardo");
        System.out.println(lista);
        System.out.println("");
    }
}
