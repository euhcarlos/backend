package atividade;

public class PessoaFisica extends Pessoa{

    private Long cpf;

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    @Override
    public String salario() {
        return "1800";
    }
}
