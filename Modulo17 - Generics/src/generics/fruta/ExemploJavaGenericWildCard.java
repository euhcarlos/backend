package generics.fruta;

import java.util.ArrayList;
import java.util.List;

public class ExemploJavaGenericWildCard {

    public static void main(String[] args) {
        List<IFruta> frutas = new ArrayList<>();
        frutas.add(new Maca());
        frutas.add(new Banana());
        imprimirFruta(frutas);
    }

    public static void imprimirFruta(List<? extends IFruta> fruta){
        for(IFruta ft : fruta){
            System.out.println(ft);
        }
    }
}
