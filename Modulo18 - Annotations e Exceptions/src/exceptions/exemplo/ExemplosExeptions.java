package exceptions.exemplo;

public class ExemplosExeptions {

    public static void main(String[] args) {
        comTratamentoExceptions();
        comTratamentoExceptionComFinally();
        lancarRuntimeExeptions();
        System.out.println("Teste");
    }

    private static void lancarRuntimeExeptions() {
        try{
            String frase = null;
            String novaFrase = null;
            novaFrase = frase.toUpperCase();
        } catch (Exception e){
            throw  new RuntimeException("Parando o sistema");
        }
        System.out.println("Teste");
    }

    private static void comTratamentoExceptionComFinally() {
        String frase = null;
        String novaFrase = null;
        try {
            novaFrase = frase.toUpperCase();
        } catch (NullPointerException e){
            System.out.println("A frase inicial está nula, para solucionar tal problema foi atribuido um valor");
            frase = "Nova frase";
        }finally {
            novaFrase = frase.toUpperCase();
        }
        System.out.println("Frase antiga: " + frase);
        System.out.println("Frase nova: " + novaFrase);
    }

    private static void comTratamentoExceptions() {
        String frase = null;
        String novaFrase = null;
        try {
            novaFrase = frase.toUpperCase();
        } catch (NullPointerException e){
            System.out.println("A frase inicial está nula, para solucionar tal problema foi atribuido um valor");
            frase = "Nova frase";
            novaFrase = frase.toUpperCase();
        }
        System.out.println("Frase antiga: " + frase);
        System.out.println("Frase nova: " + novaFrase);
    }


}
