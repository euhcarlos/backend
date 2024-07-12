package agregacao;

public class Main {

    public static void main(String[] args) {
        Produto produto = criarProduto(10l, "Pão", 10d);
        
        Vendedor vendedor = criarVendedor("Carlos", 100d);

        Comprador comprador = criarComprador("Carlos",155d);

        Venda venda = new Venda();
        venda.setVendedor(vendedor);
        venda.setComprador(comprador);
        venda.setProdutos(produto);

        venda.concretizarVenda();
        System.out.println(venda);
    }

    private static Comprador criarComprador(String nome, double valor) {
        return new Comprador(nome,valor);
    }

    private static Vendedor criarVendedor(String nome, Double valor) {
        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Carlos");
        vendedor.setComissao(100d);
        return vendedor;
    }

    private static Produto criarProduto(Long codigo, String nome, Double preco) {
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setNome(nome);
        produto.setPreco(preco);
        return produto;
    }
}
