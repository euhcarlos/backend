package set.linkedhashset;

import domain.Aluno;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploAluno {

    public static void main(String[] args) {
        Set<Aluno> conjunto = new LinkedHashSet<>();

        Aluno a = new Aluno("Carlos Eduardo", "Java", 9.5);
        Aluno b = new Aluno("Jaqueline Batista", "UX/UI", 10d);
        Aluno c = new Aluno("Carlos Eduardo", "Java", 9.5);

        conjunto.add(a);
        conjunto.add(b);

        /*Para não repetir os objetos em classes, deve-se ter o equal e hash code.
         * para ter uma comparacão de objetos e ver se são duplicados ou não */
        System.out.println(conjunto);
        System.out.println("");
    }
}
