package atividade.part1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NomeESexo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Deseja adicionar nome e sexo (s/n): ");
        String resposta = s.next();

        List<String> homem = new ArrayList<>();
        List<String> mulher = new ArrayList<>();

        while (resposta.equalsIgnoreCase("s")){

            System.out.println("Digite nome e sexo (Maria,F): ");
            String nomesexo = s.next();

            String[] dadosSplit = nomesexo.split(",");

            if(dadosSplit[1].equalsIgnoreCase("f")){
                mulher.add(dadosSplit[0]);
            } else if(dadosSplit[1].equalsIgnoreCase("m")){
                homem.add(dadosSplit[0]);
            }

            System.out.println("Deseja adicionar nome e sexo (s/n): ");
            resposta = s.next();
        }

        System.out.println("Lista homens: " + homem);
        System.out.println("Lista mulheres: " + mulher);
    }
}
