package interfaces.carro;

public class Caminhao implements ICarro{
    @Override
    public void andar() {
        System.out.println("Caminhao está em andando");
    }

    @Override
    public void parar() {
        System.out.println("Caminhao está em parando");
    }
}
