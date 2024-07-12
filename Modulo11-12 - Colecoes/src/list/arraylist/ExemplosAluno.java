package list.arraylist;

import domain.Aluno;
import domain.CompararNotaAluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemplosAluno {

    public static void main(String[] args) {
        exemploListaSimplesOrdenadaComparatorAluno();
        exemploListaSimplesOrdenadaPorNota();
    }

    private static void exemploListaSimplesOrdenadaPorNota() {
        System.out.println("**** EXEMPLO LISTA SIMPLES ORDENADA POR NOTA ****");
        List<Aluno> lista = new ArrayList<>();

        Aluno a = new Aluno("Carlos Eduardo", "Java", 9.5);
        Aluno b = new Aluno("Jaqueline Batista", "UX/UI", 10d);

        lista.add(a);
        lista.add(b);
        System.out.println("Lista sem ordem: " + lista);

        CompararNotaAluno compararNotaAluno = new CompararNotaAluno();
        Collections.sort(lista, compararNotaAluno);
        System.out.println("Lista ordenada por nota: " + lista);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdenadaComparatorAluno() {
        System.out.println("**** EXEMPLO LISTA SIMPLES ORDENADA EXTERNA ****");
        List<Aluno> lista = new ArrayList<>();

        Aluno a = new Aluno("Carlos Eduardo", "Java", 9.5);
        Aluno b = new Aluno("Jaqueline Batista", "UX/UI", 10d);

        lista.add(a);
        lista.add(b);
        System.out.println("Lista sem ordem: " + lista);
        Collections.sort(lista);
        /*Na classe deve implementas o comparable*/
        System.out.println("Lista com ordem: " + lista);
        System.out.println("");
    }
}
