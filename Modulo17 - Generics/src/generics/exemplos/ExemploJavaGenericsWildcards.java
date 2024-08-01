package generics.exemplos;

import java.util.ArrayList;
import java.util.List;

public class ExemploJavaGenericsWildcards {

    public static void main(String[] args) {
        List<String> listaString = new ArrayList<>();
        listaString.add("Carlos");
        listaString.add("Eduardo");
        imprimir(listaString);
        imprimirLong(listaString);

        List<Long> listaLong = new ArrayList<>();
        listaLong.add(10l);
        listaLong.add(20l);
        imprimir(listaLong);
        imprimirLong(listaLong);
    }

    private static void imprimirLong(List<?> lista) {
        for(Object st : lista){
            if(st instanceof Long){
                System.out.println("Long: " + st);
            } else if (st instanceof String){
                System.out.println("String: " + st);
            }
        }
    }

    private static void imprimir(List<?> lista) {
        for(Object st : lista){
            System.out.println(st);
        }
    }


}
