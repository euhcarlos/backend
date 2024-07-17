package dao;

import domain.Cliente;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClienteMapDAO implements IClienteDAO{

    public Map<Long, Cliente> map;

    public ClienteMapDAO(){
        this.map = new HashMap();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        if(this.map.containsKey(cliente.getCpf())){
            return false;
        }
        this.map.put(cliente.getCpf(), cliente);
        return true;
    }

    @Override
    public void excluir(Long cpf) {
        Cliente cliente = this.map.get(cpf);
        if(cliente != null){
            this.map.remove(cliente.getCpf(), cliente);
        }
    }

    @Override
    public void alterar(Cliente cliente) {
        Cliente containCliente = this.map.get(cliente.getCpf());
        if(containCliente != null){
            containCliente.setNome(cliente.getNome());
            containCliente.setCpf(cliente.getCpf());
            containCliente.setTelefone(cliente.getTelefone());
        }
    }

    @Override
    public Cliente consultar(Long cpf) {
        Cliente cliente = map.get(cpf);
        if(cliente != null){
            return cliente;
        }
        return null;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return map.values();
    }
}
