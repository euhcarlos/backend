package generics.exemplos;

import java.util.ArrayList;
import java.util.List;

public class ExemploJavaGenerics {

    public static void main(String[] args) {
        List<String> listaString = new ArrayList<>();
        listaString.add("Carlos");
        listaString.add("Eduardo");
        imprimir(listaString);
        imprimirLongOrString(listaString);

        List<Long> listaLong = new ArrayList<>();
        listaLong.add(10l);
        listaLong.add(20l);
        imprimir(listaLong);
        imprimirLongOrString(listaLong);

        String imprimirPrimeiro = imprimirPrimeiro(listaString);
        System.out.println("PRIMEIRO STRING: " + imprimirPrimeiro);

        Long imprimirPrimeiroLong = imprimirPrimeiro(listaLong);
        System.out.println("PRIMEIRO STRING: " + imprimirPrimeiroLong);

    }

    private static <T> void imprimirLongOrString(List<T> listaString) {
        for(T st : listaString){
            if(st instanceof Long){
                System.out.println("Long: " + st);
            } else if (st instanceof String){
                System.out.println("String: " + st);
            }
        }
    }

    private static <T> void imprimir(List<T> lista) {
        for(T st : lista){
            System.out.println(st);
        }
    }

    private static <T> T imprimirPrimeiro(List<T> lista) {
        return lista.get(0);
    }
}
