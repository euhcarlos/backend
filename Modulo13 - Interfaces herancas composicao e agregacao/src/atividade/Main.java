package atividade;

public class Main {

    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Carlos");
        pf.setSobreNome("Eduardo");
        pf.setCpf(1455455l);

        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Eduardo");
        pj.setSobreNome("Carlos");
        pj.setCnpj(454545785l);

        System.out.println("Pessoa Fisica: " + pf.getNome() + " "  + "Salario: " + pf.salario());
        System.out.println("Pessoa Juridica: " + pj.getNome() + " " + "Salario: " + pj.salario());

    }
}
