public class Cliente {

    private Long codigo;

    private String nome;

    private Long cpf;

//    /*
//    * @Deprecated use {@link #getNome}
//    * */
//    @Deprecated
//    public String getNome(){
//        return this.nome;
//    }

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

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
}
