package generics.exercicio;

public class Programa {

    public static void main(String[] args) {
        ListaDeCarros<Fiat> carroFiat = new ListaDeCarros<>();

        carroFiat.setVeiculos(new Fiat("Fiat","Strada"));
        carroFiat.getVeiculos();

        ListaDeCarros<Honda> carroHonda = new ListaDeCarros<>();
        carroHonda.setVeiculos(new Honda("Honda","HB20"));
        carroHonda.getVeiculos();

        ListaDeCarros<Honda> carroChevrolet = new ListaDeCarros<>();
        carroChevrolet.setVeiculos(new Honda("Chevrollet","S10"));
        carroChevrolet.getVeiculos();
    }
}
