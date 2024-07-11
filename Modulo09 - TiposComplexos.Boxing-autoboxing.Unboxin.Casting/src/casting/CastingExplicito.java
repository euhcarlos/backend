package casting;

public class CastingExplicito {

    public static void main(String[] args) {
        /*Implicito quando um tipo tem numero de bits exigido maior doq o outro*/
        double doubleValue = 10.5;
        int intValue = (int) doubleValue;
        System.out.println(intValue);

        Double valor = 45.45455d;
        Integer idade = valor.intValue();
        System.out.println(idade);
    }
}
