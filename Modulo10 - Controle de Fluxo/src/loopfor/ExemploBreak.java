package loopfor;

public class ExemploBreak {
    //Aqui o break faz com que o codigo pare ao chegar no numero 10
    public static void main(String[] args) {
        for(int i = 0; i <= 1000; i++){
            System.out.println("Numero: " + i);
            if(i == 10){
                break;
            }
        }
    }
}
