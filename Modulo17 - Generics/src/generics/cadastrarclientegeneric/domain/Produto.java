package generics.cadastrarclientegeneric.domain;

public class Produto implements Persistente{

    private Long codigo;

    private String nome;

    public Produto(String codigo, String nome) {
        this.codigo = Long.valueOf(codigo);
        this.nome = nome;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                '}';
    }
}
