package casting;

public class CastingImplicito {

    public static void main(String[] args) {
        /*Implicito quando um tipo nao tem numero de bits exigido maior doq o outro*/
        int valor = 10;
        long valor2 = valor;

        Integer valor3 = 50;
        Long valor4 = Long.valueOf(valor3);
    }
}
