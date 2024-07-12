package interfaces.carro;

public class CarroPasseio implements ICarro{
    @Override
    public void andar() {
        System.out.println("Carro está em andando");
    }
}
