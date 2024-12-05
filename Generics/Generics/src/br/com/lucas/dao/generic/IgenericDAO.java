package br.com.lucas.dao.generic;

import br.com.lucas.domain.Persistente;

import java.util.Collection;

public interface IgenericDAO < T extends Persistente > {

	public Boolean cadastrar ( T entity );

	public void excluir ( Long valor );

	public void alterar ( T entity );

	public T consultar ( Long valor );

	public Collection < T > buscarTodos ( );
}
