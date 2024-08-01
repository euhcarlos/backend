package generics.cadastrarclientegeneric;


import generics.cadastrarclientegeneric.dao.ClienteMapDAO;
import generics.cadastrarclientegeneric.dao.IClienteDAO;
import generics.cadastrarclientegeneric.dao.IProdutoDAO;
import generics.cadastrarclientegeneric.dao.ProdutoDAO;
import generics.cadastrarclientegeneric.domain.Cliente;
import generics.cadastrarclientegeneric.domain.Produto;

import javax.swing.*;
import java.util.Collection;

public class Programa {

    public static IClienteDAO iClienteDAO;
    public static IProdutoDAO iProdutoDAO;

    public static void main(String[] args) {

        iClienteDAO = new ClienteMapDAO();
        iProdutoDAO = new ProdutoDAO();

        String escolha = JOptionPane.showInputDialog(null, "1.CLIENTE\n2.PRODUTO", "ESCOLHA A OPÇÃO DE CRUD", JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoMenuValido(escolha)){
            if("".equals(escolha)){
                sair();
            }
            escolha = JOptionPane.showInputDialog(null, "1.CLIENTE\n2.PRODUTO", "ESCOLHA A OPÇÃO DE CRUD", JOptionPane.INFORMATION_MESSAGE);
        }

        while (isOpcaoValida(escolha)){

            String opcao = JOptionPane.showInputDialog(null, "1.Cadastro\n2.Consulta\n3.Excluir\n4.Alterar\n5.Consultar todos\n6.Sair", "OPÇÕES", JOptionPane.INFORMATION_MESSAGE);

            executarOpcao(opcao, escolha);

            escolha = JOptionPane.showInputDialog(null, "1.CLIENTE\n2.PRODUTO", "ESCOLHA A OPÇÃO DE CRUD", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void executarOpcao(String opcao, String escolha) {
        if(isCadastro(opcao)){
            cadastrar(escolha);
        } else if (isConsulta(opcao)) {
            consultar(escolha);
        } else if (isExcluir(opcao)){
            excluir(escolha);
        } else if (isAlterar(opcao)) {
            alterar(escolha);
        } else if (isConsultaTodos(opcao)) {
            consultarTodos(escolha);
        } else if (isSair(opcao)) {
            sair();
        }

    }

    private static void consultarTodos(String escolha) {
        if("1".equals(escolha)){
            Collection<Cliente> clientes = iClienteDAO.buscarTodos();
            JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso: " + clientes, "Sucesso",JOptionPane.INFORMATION_MESSAGE);
        } else if ("2".equals(escolha)) {
            Collection<Produto> produtos = iProdutoDAO.buscarTodos();
            JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso: " + produtos, "Sucesso",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void alterar(String escolha) {
        if("1".equals(escolha)){
            String dado = JOptionPane.showInputDialog(null, "DIGITE NOME,CPF,TELEFONE", "ALTERAR DADOS CLIENTE", JOptionPane.INFORMATION_MESSAGE);
            String[] dadoSplit = dado.split(",");
            Cliente cliente = new Cliente(dadoSplit[0],dadoSplit[1],dadoSplit[2]);
            iClienteDAO.alterar(cliente);
        }else if("2".equals(escolha)){
            String dado = JOptionPane.showInputDialog(null, "DIGITE CODIGO,NOME DO PRODUTO", "ALTERAR DADOS PRODUTO", JOptionPane.INFORMATION_MESSAGE);
            String[] dadoSplit = dado.split(",");
            Produto produto = new Produto(dadoSplit[1],dadoSplit[0]);
            iProdutoDAO.alterar(produto);
        }
    }

    private static void excluir(String escolha) {
        if("1".equals(escolha)){
            String dado = JOptionPane.showInputDialog(null, "DIGITE O CPF", "EXCLUIR CLIENTE", JOptionPane.INFORMATION_MESSAGE);
            iClienteDAO.excluir(Long.valueOf(dado));
            JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso: ", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
        } else if("2".equals(escolha)){
            String dado = JOptionPane.showInputDialog(null, "DIGITE O CODIGO DO PRODUTO", "EXCLUIR PRODUTO", JOptionPane.INFORMATION_MESSAGE);
            iProdutoDAO.excluir(Long.valueOf(dado));
            JOptionPane.showMessageDialog(null, "Produto excluído com sucesso: ", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void consultar(String escolha) {
        if("1".equals(escolha)){
            String dado = JOptionPane.showInputDialog(null, "DIGITE O CPF", "CONSULTA CLIENTE", JOptionPane.INFORMATION_MESSAGE);
            Cliente cliente = iClienteDAO.consultar(Long.valueOf(dado));
            if(cliente != null){
                JOptionPane.showMessageDialog(null, "Cliente encontrado com sucesso: " + cliente.toString(), "Sucesso",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Cliente não encontrado", "ERRO",JOptionPane.INFORMATION_MESSAGE);
            }

        } else if ("2".equals(escolha)) {
            String dado = JOptionPane.showInputDialog(null, "DIGITE O CODIGO DO PRODUTO", "CONSULTAR PRODUTO", JOptionPane.INFORMATION_MESSAGE);
            Produto produto = iProdutoDAO.consultar(Long.valueOf(dado));
            if(produto != null){
                JOptionPane.showMessageDialog(null, "Produto encontrado com sucesso: " + produto.toString(), "Sucesso",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Produto não encontrado", "ERRO",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private static void cadastrar(String escolha) {
        if("1".equals(escolha)){
            String dado = JOptionPane.showInputDialog(null, "DIGITE NOME,CPF,TELEFONE", "CADASTRO CLIENTE", JOptionPane.INFORMATION_MESSAGE);
            String[] dadoSplit = dado.split(",");
            Cliente cliente = new Cliente(dadoSplit[0],dadoSplit[1],dadoSplit[2]);
            Boolean isCliente = iClienteDAO.cadastrar(cliente);
            if(isCliente){
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso ", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Cliente já se encontra cadastrado", "Erro",JOptionPane.INFORMATION_MESSAGE);
            }

        } else if ("2".equals(escolha)) {
            String dado = JOptionPane.showInputDialog(null, "DIGITE CODIGO,NOME PRODUTO", "CADASTRO PRODUTO", JOptionPane.INFORMATION_MESSAGE);
            String[] dadoSplit = dado.split(",");
            Produto produto = new Produto(dadoSplit[0],dadoSplit[1]);
            Boolean isProduto = iProdutoDAO.cadastrar(produto);
            if(isProduto){
                JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso ", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Produto já se encontra cadastrado", "Erro",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private static boolean isOpcaoValida(String opcao) {
        if("1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao) || "4".equals(opcao)|| "5".equals(opcao) || "6".equals(opcao)){
            return true;
        }
        return false;

    }

    private static void sair() {
        JOptionPane.showMessageDialog(null, "Até logo: ", "Sair",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isOpcaoMenuValido(String escolha) {
        if("1".equals(escolha) || "2".equals(escolha)){
            return true;
        }
        return false;
    }

    private static boolean isSair(String opcao) {
        if("6".equals(opcao)){
            return true;
        }
        return false;
    }

    private static boolean isConsultaTodos(String opcao) {
        if("5".equals(opcao)){
            return true;
        }
        return false;
    }

    private static boolean isAlterar(String opcao) {
        if("4".equals(opcao)){
            return true;
        }
        return false;
    }

    private static boolean isExcluir(String opcao) {
        if("3".equals(opcao)){
            return true;
        }
        return false;
    }

    private static boolean isConsulta(String opcao) {
        if("2".equals(opcao)){
            return true;
        }
        return false;
    }

    private static boolean isCadastro(String opcao) {
        if("1".equals(opcao)){
            return true;
        }
        return false;
    }

}
