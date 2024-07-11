package loopwhile;

public class ExemploPPT1 {

    public static void main(String[] args) {
        int count = 0;
        while (count < 2){
            System.out.println("Linha: " + count);
        }
        //Forma de não ficar infinito
        int count1 = 0;
        while (count1 <= 2){
            System.out.println("Linha: " + count1);
            count1++;
        }
    }
}
