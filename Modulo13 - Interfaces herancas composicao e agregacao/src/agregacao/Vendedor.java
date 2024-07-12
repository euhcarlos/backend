package agregacao;

public class Vendedor {

    private String nome;

    private Double comissao;

    public Double getComissao() {
        return comissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public void vende(){
        System.out.println("VENDER");
    }
}
