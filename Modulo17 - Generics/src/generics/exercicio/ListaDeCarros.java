package generics.exercicio;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCarros <T extends Veiculo> {

    private List<T> veiculos;

    public ListaDeCarros(){
        this.veiculos = new ArrayList<>();
    }


    public void setVeiculos(T veiculos) {
        this.veiculos.add(veiculos);
    }

    public void getVeiculos() {
        for(T veiculo : this.veiculos){
            System.out.println(veiculo);
        }
    }
}
