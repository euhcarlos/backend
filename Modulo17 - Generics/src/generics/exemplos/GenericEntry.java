package generics.exemplos;

public class GenericEntry<T> {

    private T codigo;

    public GenericEntry(T codigo) {
        this.codigo = codigo;
    }

    public T getCodigo() {
        return codigo;
    }

    public void setCodigo(T codigo) {
        this.codigo = codigo;
    }
}
