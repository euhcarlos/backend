package generics.exemplos;

public class ExemplosGenericEntry {

    public static void main(String[] args) {
        GenericEntry<String> generic = new GenericEntry<>("Carlos");
        System.out.println(generic.getCodigo());
        GenericEntry<Long> genericLong = new GenericEntry<>(10l);
        System.out.println(genericLong.getCodigo());

        /*Você pode colocar varios dados na classe, mas tem que passar todos os parametros ao cria uma instancia*/
        GenericEntryDois<String,Long> genericDois = new GenericEntryDois<>("Carlos",110l);
        System.out.println(genericDois.getCodigo() +  " " + genericDois.getDado());

        System.out.println(generic.getCodigo());
    }
}
