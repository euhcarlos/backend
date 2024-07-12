package agregacao;

import java.util.ArrayList;
import java.util.List;

public class Venda {

    private Comprador comprador;

    private Vendedor vendedor;

    private List<Produto> produtos;

    public Venda(){
        this.produtos = new ArrayList<>();
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto produto) {
        this.produtos.add(produto);
    }

    public void concretizarVenda(){
        System.out.println("Vendido para: " + comprador.getNome());
        System.out.println("Compro: ");
        for(Produto prod : produtos){
            System.out.println("Nome produto: " + prod.getNome() + " - " + "Valor: " + prod.getPreco());
        }

        System.out.println("Vendedor: " + vendedor.getNome());
    }

    public void cancelarVenda(){
        System.out.println("Venda Cancelada!");
    }
}
