package abstrato;

public class Horista extends Empregado{

    private Double precoHora;

    private Double horaTrabalhada;

    public Double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(Double precoHora) {
        this.precoHora = precoHora;
    }

    public Double getHoraTrabalhada() {
        return horaTrabalhada;
    }

    public void setHoraTrabalhada(Double horaTrabalhada) {
        this.horaTrabalhada = horaTrabalhada;
    }

    @Override
    public Double vencimento() {
        return this.precoHora*this.horaTrabalhada;
    }
}
