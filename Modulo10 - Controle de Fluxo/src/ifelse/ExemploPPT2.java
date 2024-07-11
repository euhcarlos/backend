package ifelse;

public class ExemploPPT2 {

    public static void main(String[] args) {
        int result = 0;
        if(result > 1 && result < 5){
            System.out.println("Numero esta entre 1 e 5");
        } else if(result > 5 && result < 10){
            System.out.println("Numero entre 5 e 10");
        } else {
            System.out.println("Numero esta acima de 10 ou abaixo de 1");
        }
    }
}
