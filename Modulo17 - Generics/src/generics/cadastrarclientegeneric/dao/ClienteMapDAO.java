package generics.cadastrarclientegeneric.dao;


import generics.cadastrarclientegeneric.dao.generic.GenericDAO;
import generics.cadastrarclientegeneric.domain.Cliente;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClienteMapDAO extends GenericDAO<Cliente> implements IClienteDAO{

    public ClienteMapDAO(){
        super();
        Map<Long, Cliente> mapaInterno = this.map.get(getTipoClasse());
        if(mapaInterno == null){
            mapaInterno = new HashMap<>();
            this.map.put(getTipoClasse(), mapaInterno);
        }
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualizarDados(Cliente entity, Cliente entityCadastrado) {
        entityCadastrado.setNome(entity.getNome());
        entityCadastrado.setCpf(entity.getCpf());
        entityCadastrado.setTelefone(entity.getTelefone());
    }


//    public Map<Long, Cliente> map;
//
//    public ClienteMapDAO(){
//        this.map = new HashMap();
//    }
//
//    @Override
//    public Boolean cadastrar(Cliente cliente) {
//        if(this.map.containsKey(cliente.getCpf())){
//            return false;
//        }
//        this.map.put(cliente.getCpf(), cliente);
//        return true;
//    }
//
//    @Override
//    public void excluir(Long cpf) {
//        Cliente cliente = this.map.get(cpf);
//        if(cliente != null){
//            this.map.remove(cliente.getCpf(), cliente);
//        }
//    }
//
//    @Override
//    public void alterar(Cliente cliente) {
//        Cliente containCliente = this.map.get(cliente.getCpf());
//        if(containCliente != null){
//            containCliente.setNome(cliente.getNome());
//            containCliente.setCpf(cliente.getCpf());
//            containCliente.setTelefone(cliente.getTelefone());
//        }
//    }
//
//    @Override
//    public Cliente consultar(Long cpf) {
//        Cliente cliente = map.get(cpf);
//        if(cliente != null){
//            return cliente;
//        }
//        return null;
//    }
//
//    @Override
//    public Collection<Cliente> buscarTodos() {
//        return map.values();
//    }
}
