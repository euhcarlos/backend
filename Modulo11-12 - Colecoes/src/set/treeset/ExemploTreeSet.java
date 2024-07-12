package set.treeset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSet {

        public static void main(String[] args) {
            exemploListaSimples();
            exemploConsultando();
            exemploRemovendo();
        }

        private static void exemploRemovendo() {
            System.out.println("**** LISTA SIMPLES REMOVENDO ****");

            Set<String> lista = new TreeSet<>();
            lista.add("Ferreira");
            lista.add("Carlos");
            lista.add("Eduardo");
            lista.remove("Carlos");
            System.out.println(lista);
            System.out.println("");
        }

        private static void exemploConsultando() {
            System.out.println("**** LISTA SIMPLES CONSULTA ****");

            Set<String> lista = new TreeSet<>();
            lista.add("Ferreira");
            lista.add("Carlos");
            lista.add("Eduardo");
            System.out.println(lista.contains("Carlos"));
            System.out.println("");
        }

        private static void exemploListaSimples() {
            System.out.println("**** LISTA SIMPLES ****");
            Set<String> lista = new TreeSet<>();
            lista.add("Ferreira");
            lista.add("Carlos");
            lista.add("Eduardo");
            System.out.println(lista);
            System.out.println("");
        }
    }
