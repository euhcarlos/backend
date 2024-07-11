package loopfor;

public class ExemploContinue {

    //Quando encontra a condicão que satisfaz o que esta dentro ele continua o codigo, iniciado ele do comeco dnv
    public static void main(String[] args) {
        for(int contador = 1; contador<=100; contador++){
            if(contador%5!=0){
                continue;
            }
            System.out.println("Contador: " + contador);
        }
    }
}
