package boxingeunboxing;

public class Boxing {

    public static void main(String[] args) {
        int valor = 10;
        Integer valorWrapper = valor;

        int primitiveInt = 42;
        Integer wrappedInt = Integer.valueOf(primitiveInt);
    }
}
