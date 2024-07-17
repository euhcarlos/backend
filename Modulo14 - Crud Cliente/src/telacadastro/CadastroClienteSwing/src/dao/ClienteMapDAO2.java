/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import domain.Cliente;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author carlos
 */
public class ClienteMapDAO2 implements IClienteDAO{
    
    private Map<Long, Cliente> map;
    
    public ClienteMapDAO2() {
        map = new TreeMap<>();
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
