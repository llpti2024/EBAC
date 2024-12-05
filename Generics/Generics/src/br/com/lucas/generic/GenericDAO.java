package br.com.lucas.generic;

import br.com.lucas.dao.generic.IgenericDAO;
import br.com.lucas.domain.Persistente;


import java.util.Collection;
import java.util.HashMap;

import java.util.Map;

public abstract class GenericDAO < T extends Persistente > implements IgenericDAO < T > {

	protected Map < Class, Map < Long, T > > map;

	public abstract void atualizarDados ( T entity , T entityCadastrado );

	protected GenericDAO ( ) {
		if ( this.map == null ) {
			this.map = new HashMap <> ( );
		
		}
	}

	public abstract Class < T > getTipoClasse ( );


	@Override
	public Boolean cadastrar ( T entity ) {
		Map < Long, T > mapaInterno = this.map.get ( getTipoClasse ( ) );
		if ( mapaInterno.containsKey ( entity.getCodigo ( ) ) ) {
			return false;
		}
		mapaInterno.put ( entity.getCodigo ( ) ,
		                  entity );
		return true;
	}

	@Override
	public void excluir ( Long valor ) {
		Map < Long, T > mapaInterno = this.map.get ( getTipoClasse ( ) );
		T objetoCadastrado = mapaInterno.get ( valor );
		if ( objetoCadastrado != null ) {
			this.map.remove ( valor ,
			                  objetoCadastrado );
		}
	}

	@Override
	public void alterar ( T entity ) {
		Map < Long, T > mapaInterno = this.map.get ( getTipoClasse ( ) );
		T objetoCadastrado = mapaInterno.get ( entity.getCodigo ( ) );
		if ( objetoCadastrado != null ) {
			atualizarDados ( entity ,
			                 objetoCadastrado );

		}
	}

	@Override
	public T consultar ( Long valor ) {
		Map < Long, T > mapaInterno = this.map.get ( getTipoClasse ( ) );
		return mapaInterno.get ( valor );
	}

	@Override
	public Collection < T > buscarTodos ( ) {
		Map < Long, T > mapaInterno = this.map.get ( getTipoClasse ( ) );
		return mapaInterno.values ( );
	}
}
