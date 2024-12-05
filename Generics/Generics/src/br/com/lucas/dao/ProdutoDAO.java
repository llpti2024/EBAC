package br.com.lucas.dao;

import br.com.lucas.domain.Produto;
import br.com.lucas.generic.GenericDAO;

import java.util.HashMap;
import java.util.Map;

public class ProdutoDAO extends GenericDAO < Produto > implements IProdutoDAO {

	public ProdutoDAO ( ) {
		super ( );
		Map < Long, Produto > mapaInterno = this.map.get ( getTipoClasse ( ) );
		if ( mapaInterno == null ) {
			mapaInterno = new HashMap <> ( );
			this.map.put ( getTipoClasse ( ) ,
			               mapaInterno );
		}

	}


	@Override
	public void atualizarDados ( Produto entity , Produto entityCadastrado ) {
		entityCadastrado.setCodigo ( entity.getCodigo ( ) );
		entityCadastrado.setNome ( entity.getNome ( ) );
		entityCadastrado.setQuantidade ( entity.getQuantidade ( ) );
		entityCadastrado.setPreco ( entity.getPreco ( ) );
		entityCadastrado.setFabricante ( entity.getFabricante ( ) );
		entityCadastrado.setDescricao ( entity.getDescricao ( ) );
		entityCadastrado.setCategoria ( entity.getCategoria ( ) );


	}

	@Override
	public Class < Produto > getTipoClasse ( ) {

		return Produto.class;
	}









//	@Override
//	public Boolean cadastrar ( Produto produto ) {
//		return null;
//	}
//
//	@Override
//	public void excluir ( Long codigo ) {
//
//	}
//
//	@Override
//	public void alterar ( Produto produto ) {
//
//	}
//
//	@Override
//	public Produto consultar ( Long codigo ) {
//		return null;
//	}
//
//	@Override
//	public Collection < Produto > buscarTodos ( ) {
//		return List.of ( );
//	}
}
