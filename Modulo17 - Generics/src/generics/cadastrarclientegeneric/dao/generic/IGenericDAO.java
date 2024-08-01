package generics.cadastrarclientegeneric.dao.generic;

import generics.cadastrarclientegeneric.domain.Cliente;
import generics.cadastrarclientegeneric.domain.Persistente;

import java.util.Collection;

public interface IGenericDAO <T extends Persistente> {

    public Boolean cadastrar(T entity);

    public void excluir(Long codigo);

    public void alterar(T entity);

    public T consultar(Long codigo);

    public Collection<T> buscarTodos();

}
