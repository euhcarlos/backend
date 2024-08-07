package exceptions.thows;

public class AppExemploThrow {

    public static void main(String[] args) {
        exception();
        runtimeException();
    }

    private static void runtimeException() {
    }

    private static void exception() {
        try {
            ExemploThrow.saque(100);
        } catch (LimiteSaqueExceptions e){
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            System.out.println("Codigo que sempre é executado");
        }
    }
}
