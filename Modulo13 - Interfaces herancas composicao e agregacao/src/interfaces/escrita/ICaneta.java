package interfaces.escrita;

public interface ICaneta {

    public void escrever(String texto);

    public String getCor();

    default void escreverComumATodos(){
        System.out.println("Escita igual a todas");
    }
}
