import interfaces.carro.Caminhao;
import interfaces.carro.CarroPasseio;
import interfaces.carro.ICarro;
import interfaces.escrita.CanetaEsferografica;
import interfaces.escrita.ICaneta;
import interfaces.escrita.Lapis;

public class Main {

    public static void main(String[] args) {
        /*Nesse modo você pode ver apenas os metódos da interface
        *
        * Flexibilidade: Isso permite que você trabalhe com qualquer classe que implemente a interface ICaneta.
        * Você pode trocar CanetaEsferografica por outra classe que também implemente ICaneta sem alterar o restante do código.
        *
        * Acesso: Você só pode chamar os métodos definidos na interface ICaneta
        * */
        ICaneta caneta = new CanetaEsferografica();
        caneta.escrever("Ola,Carlos");
        System.out.println(caneta.getCor());

        /*Nesse modo você pode ver todos os metódos da interface e da subclasse
        *
        * Você tem acesso a todos os métodos e atributos da classe CanetaEsferografica, incluindo os que não
        * estão definidos na interface ICaneta.
        *
        * Este código é menos flexível, pois está acoplado diretamente a uma implementação específica.
        * */
        CanetaEsferografica canetaEsferografica = new CanetaEsferografica();
        canetaEsferografica.escrever("Ola, carlos");
        System.out.println(canetaEsferografica.getCor());

        ICaneta lapis = new Lapis();
        lapis.escrever("Ola, Carlos");
        lapis.escreverComumATodos();
        System.out.println(lapis.getCor());


        ICarro carro = new CarroPasseio();
        carro.andar();
        carro.parar();

        ICarro caminhao = new Caminhao();
        caminhao.andar();
        caminhao.parar();
    }
}
