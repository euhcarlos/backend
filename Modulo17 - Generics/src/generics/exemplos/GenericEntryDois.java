package generics.exemplos;

public class GenericEntryDois <T, E>{

    private T codigo;

    private E dado;

    public GenericEntryDois(T codigo, E dado) {
        this.codigo = codigo;
        this.dado = dado;
    }

    public T getCodigo() {
        return codigo;
    }

    public void setCodigo(T codigo) {
        this.codigo = codigo;
    }

    public E getDado() {
        return dado;
    }

    public void setDado(E dado) {
        this.dado = dado;
    }
}
