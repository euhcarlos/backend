package boxingeunboxing;

public class Unboxing {

    public static void main(String[] args) {
        Integer valorWrapper = 10;
        int valor = valorWrapper;

        Integer wrappedInt = 100;
        int primitiveInt = wrappedInt.intValue();
    }
}
