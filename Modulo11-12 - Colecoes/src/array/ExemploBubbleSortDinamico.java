package array;

import java.util.Scanner;

public class ExemploBubbleSortDinamico {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("DIGITE NUMEROS SEPARADOS POR VIRGULA: ");
        String dado = s.next();

        String[] vt = dado.split(",");
        int[] vet = converte(vt);
        int aux = 0;
        int i = 0;

        System.out.println("Vetor desordenado: ");
        for(i = 0; i < vet.length; i++){
            System.out.println(" " + vet[i]);
        }
        System.out.println("");


        for( i = 0; i < vet.length; i++){
            for(int j = 0; j < vet.length - 1; j++){
                if(vet[j] > vet[j+1]){
                    aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                }
            }
        }

        System.out.println("Vetor organizado: ");
        for(i = 0; i < vet.length; i++){
            System.out.println(" " + vet[i]);
        }
    }

    private static int[] converte(String[] vt) {
        int[] numeros = new int[vt.length];
        for (int i = 0; i < vt.length; i++){
            numeros[i] = Integer.parseInt(vt[i]);
        }
        return numeros;
    }
}
