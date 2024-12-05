package br.com.lucas.dao;

import br.com.lucas.domain.Cliente;

import br.com.lucas.generic.GenericDAO;

import java.util.HashMap;
import java.util.Map;


public class ClienteMapDAO extends GenericDAO < Cliente > implements IClienteDAO {

	public ClienteMapDAO ( ) {
		super ( );
		Map < Long, Cliente > mapaInterno = this.map.get ( getTipoClasse ( ) );
		if ( mapaInterno == null ) {
			mapaInterno = new HashMap <> ( );
			this.map.put ( getTipoClasse ( ) ,
			               mapaInterno );
		}

	}

	@Override
	public void atualizarDados ( Cliente entity , Cliente entityCadastrado ) {
		entityCadastrado.setNome ( entity.getNome ( ) );
		entityCadastrado.setCidade ( entity.getCidade ( ) );
		entityCadastrado.setCpf ( entity.getCpf ( ) );
		entityCadastrado.setEnd ( entity.getEnd ( ) );
		entityCadastrado.setNumero ( entity.getNumero ( ) );
		entityCadastrado.setEstado ( entity.getEstado ( ) );
		entityCadastrado.setTel ( entity.getTel ( ) );
	}



	@Override
	public Class < Cliente > getTipoClasse ( ) {
		return Cliente.class;
	}






//    private Map<Long, Cliente> map;
//
//    public ClienteMapDAO() {
//        this.map = new HashMap<>();
//    }
//
//    @Override
//    public Boolean cadastrar(Cliente cliente) {
//        if(this.map.containsKey(cliente.getCpf())){
//            return false;
//        }
//        this.map.put(cliente.getCpf(), cliente);
//         return true;
//
//    }
//
//    @Override
//    public void excluir(Long cpf) {
//        Cliente clienteCadastrado = this.map.get(cpf);
//
//        if(clienteCadastrado != null){
//            this.map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
//        }
//    }
//
//    @Override
//    public void alterar(Cliente cliente) {
//       Cliente clienteCadastrado = this.map.get(cliente.getCpf());
//
//       if(clienteCadastrado != null){
//           clienteCadastrado.setNome(cliente.getNome());
//           clienteCadastrado.setCidade(cliente.getCidade());
//           clienteCadastrado.setCpf(cliente.getCpf());
//           clienteCadastrado.setEnd(cliente.getEnd());
//           clienteCadastrado.setNumero(cliente.getNumero());
//           clienteCadastrado.setEstado(cliente.getEstado());
//           clienteCadastrado.setTel(cliente.getTel());
//
//       }
//
//    }
//
//    @Override
//    public Cliente consultar(Long cpf) {
//        return this.map.get(cpf);
//
//    }
//
//    @Override
//    public Collection<Cliente> buscarTodos() {
//
//        return this.map.values();
//
//    }
}
