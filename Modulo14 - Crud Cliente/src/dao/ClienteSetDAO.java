package dao;

import domain.Cliente;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClienteSetDAO implements IClienteDAO{

    public Set<Cliente> set;

    public ClienteSetDAO(){
        this.set = new HashSet<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        for(Cliente clienteCadastro : this.set){
            if(clienteCadastro.getCpf().equals(cliente.getCpf())){
                return false;
            }
        }
        this.set.add(cliente);
        return true;
    }

    @Override
    public void excluir(Long cpf) {
        for(Cliente cliente : this.set){
            if(cliente.getCpf().equals(cpf)){
                this.set.remove(cliente);
            }
        }
    }

    @Override
    public void alterar(Cliente cliente) {
        for(Cliente clienteCadastrado : this.set){
            clienteCadastrado.setNome(cliente.getNome());
            clienteCadastrado.setCpf(cliente.getCpf());
            clienteCadastrado.setTelefone(cliente.getTelefone());
        }
    }

    @Override
    public Cliente consultar(Long cpf) {
        Cliente cliente = null;
        for(Cliente clienteCadastrado : this.set){
            if(clienteCadastrado.getCpf().equals(cpf)){
                return clienteCadastrado;
            }
        }
        return null;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.set;
    }
}
