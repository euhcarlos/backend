package annotation;

@PrimeiraAnotacao(value = "Carlos", idade = 10, bairros = {"Vila Damasceno", "Jd angela"}, valor = 10)
public class ClasseComAnotacao {

    @PrimeiraAnotacao(value = "Eduardo", idade = 20, bairros = {"Vila Damasceno", "Jd angela"})
    private String nome;

}
