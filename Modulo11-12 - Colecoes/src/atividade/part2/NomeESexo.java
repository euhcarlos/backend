package atividade.part2;

import java.util.*;

public class NomeESexo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Map<String,String> pessoa = new TreeMap<>();

        System.out.println("DESEJA ADICIONAR DADOS(S/N):");
        String resposta = s.next();

        while (resposta.equalsIgnoreCase("S")){

            System.out.println("DIGITE NOME E SEXO (Ex: Carlos,M): ");
            String cadastro = s.next();

            String[] cadastoSplit = cadastro.split(",");

            if(cadastoSplit.length == 2){
                pessoa.put(cadastoSplit[0],cadastoSplit[1]);
            }

            System.out.println("DESEJA ADICIONAR DADOS(S/N):");
            resposta = s.next();
        }

        pessoa.forEach((key,value)->{
            if(value.equalsIgnoreCase("M")){
                System.out.println("Homen: " + key);
            } else if(value.equalsIgnoreCase("F")) {
                System.out.println("Mulher: " + key);
            }
        });

    }
}


