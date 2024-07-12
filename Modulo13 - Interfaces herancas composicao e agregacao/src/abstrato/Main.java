package abstrato;

public class Main {
    public static void main(String[] args) {
        /*
        * Esse modo não da pra usar, pós so podemos usar metodos da classe empregado
        * Na classe empregado não tem salario e outros
        * */
//        Empregado empregado = new Assalariado();
//        System.out.println(empregado.vencimento());

        Assalariado assalariado = new Assalariado();
        assalariado.setNome("Carlos");
        assalariado.setSobreNome("Eduardo");
        assalariado.setSalario(1000d);
        imprimir(assalariado);

        Comissionado comissionado = new Comissionado();
        comissionado.setNome("Carlos");
        comissionado.setSobreNome("Eduardo");
        comissionado.setTotalComissao(100d);
        comissionado.setTotalVenda(10d);
        imprimir(comissionado);

        Horista horista = new Horista();
        horista.setNome("Carlos");
        horista.setSobreNome("Eduardo");
        horista.setPrecoHora(1000d);
        horista.setHoraTrabalhada(10d);
        imprimir(horista);
    }

    public static void imprimir(Empregado empregado){
        if(empregado instanceof Horista){
            Horista hor = (Horista) empregado;
            System.out.println(hor.getPrecoHora());
        }
        System.out.println(empregado.getClass().getSimpleName() + " " + empregado.getNome() + "tem salario: " + empregado.vencimento());
    }
}
