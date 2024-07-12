package atividade;

public class PessoaJuridica extends Pessoa{

    private Long cnpj;

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String salario() {
        return "2000";
    }
}
