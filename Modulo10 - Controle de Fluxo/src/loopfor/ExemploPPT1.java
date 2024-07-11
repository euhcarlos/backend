package loopfor;

import java.util.ArrayList;
import java.util.List;

public class ExemploPPT1 {

    public static void main(String[] args) {
        List<Integer> valores = new ArrayList<>();
        for(int i = 0; i <= 10; i++){
            System.out.println("Valor: " + i);
            valores.add(i);
        }
        System.out.println("");
        System.out.println("**** FOR EM LISTA ****");
        for(Integer i : valores){
            System.out.println("Valor: " + i);
        }
        System.out.println("");
        System.out.println("**** FOREACH EM LISTA ****");
        valores.forEach(i -> System.out.println("Valor: " + i));
    }
}
