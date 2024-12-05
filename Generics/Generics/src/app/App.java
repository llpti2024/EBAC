package app;

import br.com.lucas.dao.ClienteMapDAO;
import br.com.lucas.dao.IClienteDAO;
import br.com.lucas.dao.IProdutoDAO;
import br.com.lucas.dao.ProdutoDAO;
import br.com.lucas.domain.Cliente;
import br.com.lucas.domain.Produto;

import javax.swing.*;

public class App {

	private static IClienteDAO iClienteDAO;
	private static IProdutoDAO iProdutoDAO;

	public static void main ( String[] args ) {
		iProdutoDAO = new ProdutoDAO ( );
		iClienteDAO = new ClienteMapDAO ( );

		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		String opcaoProduto = JOptionPane.showInputDialog ( null ,
		                                                    "                               Menu \n\n" +
				                                                    " 1 - Cadastro\n 2 - Consultar\n 3 - Exclusão\n 4 " +
				                                                    "- " +
				                                                    "Alteração\n" +
				                                                    " 5 - Sair\n\n Digite sua opção:" ,
		                                                    "Cadastro" ,
		                                                    JOptionPane.INFORMATION_MESSAGE );
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



		while ( ! isOpcaoValidaProduto ( opcaoProduto ) ) {
			JOptionPane.showMessageDialog ( null ,
			                                "Opção invalida" );
			opcaoProduto = JOptionPane.showInputDialog ( null ,
			                                             "                               Menu \n\n" +
					                                             " 1 - Cadastro\n 2 - Consultar\n 3 - Exclusão\n 4 -" +
					                                             " " +
					                                             "Alteração\n" +
					                                             " 5 - Sair\n\n Digite sua opção:" ,
			                                             "Cadastro" ,
			                                             JOptionPane.INFORMATION_MESSAGE );
		}


		while ( isOpcaoValidaProduto ( opcaoProduto ) ) {
			String dadosProduto;
			if ( isOpcaoCadastroProduto ( opcaoProduto ) ) {
				dadosProduto = JOptionPane.showInputDialog ( null ,
				                                             "Cadastro de Cliente\n\n Digite suas informaçoes " +
						                                             "separadas por" +
						                                             " " +
						                                             "(,)\n Nome completo\n CPF (somente números)\n " +
						                                             "Telefone" +
						                                             " (somente números)\n Endereco (Logradouro e nome" +
						                                             " do " +
						                                             "logradouro) \n Numero da casa (somente números)" +
						                                             "\n " +
						                                             "Cidade\n Estado (Sigla) \n\nExemplo:\n (   " +
						                                             "Carlos " +
						                                             "Alberto, 12345678900, 1122223333,Rua A, 000,São" +
						                                             " " +
						                                             "Paulo," +
						                                             "SP   )" ,
				                                             "Cadastro" ,
				                                             JOptionPane.INFORMATION_MESSAGE );
				cadastrarProduto ( dadosProduto );

			}
			else if ( isOpcaoConsultarProduto ( opcaoProduto ) ) {
				dadosProduto = JOptionPane.showInputDialog ( null ,
				                                             "Consulta de Cliente\n\nDigite o CPF do cliente (Somente" +
						                                             " " +
						                                             "números)\n Ex: 12345678901" ,
				                                             "Consulta" ,
				                                             JOptionPane.INFORMATION_MESSAGE );
				consultarProduto ( dadosProduto );

			}
			else if ( isOpcaoExclusaoProduto ( opcaoProduto ) ) {
				dadosProduto = JOptionPane.showInputDialog ( null ,
				                                             "Exclusao de Cliente\n\nDigite o CPF do cliente (Somente" +
						                                             " " +
						                                             "números)\n Ex: 12345678901" ,
				                                             "Exclusao" ,
				                                             JOptionPane.INFORMATION_MESSAGE );
				exclusaoProduto ( dadosProduto );

			}
			else if ( isOpcaoAlteracaoProduto ( opcaoProduto ) ) {
				dadosProduto = JOptionPane.showInputDialog ( null ,
				                                             "Alteração de Cliente\n\n Digite suas informaçoes " +
						                                             "separadas por" +
						                                             " " +
						                                             "(,)\n Nome completo\n CPF (somente números)\n " +
						                                             "Telefone" +
						                                             " (somente números)\n Endereco (Logradouro e nome" +
						                                             " do " +
						                                             "logradouro) \n Numero da casa (somente números)" +
						                                             "\n " +
						                                             "Cidade\n Estado (Sigla) \n\nExemplo:\n (   " +
						                                             "Carlos " +
						                                             "Alberto, 12345678900, 1122223333,Rua A, 000,São" +
						                                             " " +
						                                             "Paulo," +
						                                             "SP   )" ,
				                                             "Alteracao" ,
				                                             JOptionPane.INFORMATION_MESSAGE );
				alterarProduto ( dadosProduto );

			}
			else if ( isOpcaoSairProduto ( opcaoProduto ) ) {
				sairProduto ( );
			}
			opcaoProduto = JOptionPane.showInputDialog ( null ,
			                                             "                               Menu \n\n" +
					                                             " 1 - Cadastro\n 2 - Consultar\n 3 - Exclusão\n 4 -" +
					                                             " " +
					                                             "Alteração\n" +
					                                             " 5 - Sair\n\n Digite sua opção:" ,
			                                             "Cadastro" ,
			                                             JOptionPane.INFORMATION_MESSAGE );
		}

		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		String opcaoCliente = JOptionPane.showInputDialog ( null ,
		                                                    "                               Menu \n\n" +
				                                                    " 1 - Cadastro\n 2 - Consultar\n 3 - Exclusão\n 4 " +
				                                                    "- " +
				                                                    "Alteração\n" +
				                                                    " 5 - Sair\n\n Digite sua opção:" ,
		                                                    "Cadastro" ,
		                                                    JOptionPane.INFORMATION_MESSAGE );
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


		while ( ! isOpcaoValidaCliente ( opcaoCliente ) ) {
			JOptionPane.showMessageDialog ( null ,
			                                "Opção invalida" );
			opcaoCliente = JOptionPane.showInputDialog ( null ,
			                                             "                               Menu \n\n" +
					                                             " 1 - Cadastro\n 2 - Consultar\n 3 - Exclusão\n 4 -" +
					                                             " " +
					                                             "Alteração\n" +
					                                             " 5 - Sair\n\n Digite sua opção:" ,
			                                             "Cadastro" ,
			                                             JOptionPane.INFORMATION_MESSAGE );
		}
		while ( isOpcaoValidaCliente ( opcaoCliente ) ) {
			String dadosCliente;
			if ( isOpcaoCadastroCliente ( opcaoCliente ) ) {
				dadosCliente = JOptionPane.showInputDialog ( null ,
				                                             "Cadastro de Cliente\n\n Digite suas informaçoes separadas
				                                             por" +
				                                             " " +
						                                             "(,)\n Nome completo\n CPF (somente números)\n " +
						                                             "Telefone" +
						                                             " (somente números)\n Endereco (Logradouro e nome
				do " +
				"logradouro) \n Numero da casa (somente números)\n
				" +
				"Cidade\n Estado (Sigla) \n\nExemplo:\n (   Carlos
				" +
				"Alberto, 12345678900, 1122223333,Rua A, 000,São
				" +
				"Paulo," +
						"SP   )" ,
						"Cadastro" ,
						JOptionPane.INFORMATION_MESSAGE );
				cadastrarCliente ( dadosCliente );

			}
			else if ( isOpcaoConsultarCliente ( opcaoCliente ) ) {
				dadosCliente = JOptionPane.showInputDialog ( null ,
				                                             "Consulta de Cliente\n" +
						                                             "\n" +
						                                             "Digite o CPF do cliente (Somente
				                                             " +
				                                             "números)\n Ex: 12345678901" ,
				                                             "Consulta" ,
				                                             JOptionPane.INFORMATION_MESSAGE );
				consultarCliente ( dadosCliente );

			}
			else if ( isOpcaoExclusaoCliente ( opcaoCliente ) ) {
				dadosCliente = JOptionPane.showInputDialog ( null ,
				                                             "Exclusao de Cliente\n\nDigite o CPF do cliente (Somente
				                                             " +
				                                             "números)\n Ex: 12345678901" ,
				                                             "Exclusao" ,
				                                             JOptionPane.INFORMATION_MESSAGE );
				exclusaoCliente ( dadosCliente );

			}
			else if ( isOpcaoAlteracaoCliente ( opcaoCliente ) ) {
				dadosCliente = JOptionPane.showInputDialog ( null ,
				                                             "Alteração de Cliente\n\n Digite suas informaçoes
				                                             separadas por" +
				                                             " " +
						                                             "(,)\n Nome completo\n CPF (somente números)\n " +
						                                             "Telefone" +
						                                             " (somente números)\n Endereco (Logradouro e nome
				do " +
				"logradouro) \n Numero da casa (somente números)\n
				" +
				"Cidade\n Estado (Sigla) \n\nExemplo:\n (   Carlos
				" +
				"Alberto, 12345678900, 1122223333,Rua A, 000,São
				" +
				"Paulo," +
						"SP   )" ,
						"Alteracao" ,
						JOptionPane.INFORMATION_MESSAGE );
				alterarCliente ( dadosCliente );

			}


			else if ( isOpcaoSairCliente ( opcaoCliente ) ) {
				sairCliente ( );
			}
			opcaoCliente = JOptionPane.showInputDialog ( null ,
			                                             "                               Menu \n\n" +
					                                             " 1 - Cadastro\n 2 - Consultar\n 3 - Exclusão\n 4 - " +
					                                             "Alteração\n" +
					                                             " 5 - Sair\n\n Digite sua opção:" ,
			                                             "Cadastro" ,
			                                             JOptionPane.INFORMATION_MESSAGE );
		}
		
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


		private static void alterarCliente ( String dadosCliente ){
			String[] dadosSeparados = dadosCliente.split ( "," );
			Cliente cliente = new Cliente ( dadosSeparados[ 0 ] ,
			                                dadosSeparados[ 1 ] ,
			                                dadosSeparados[ 2 ] ,
			                                dadosSeparados[ 3 ] ,
			                                dadosSeparados[ 4 ] ,
			                                dadosSeparados[ 5 ] ,
			                                dadosSeparados[ 6 ] );
			iClienteDAO.alterar ( cliente );
		}

		private static void exclusaoCliente ( String dadosProduto ){
			iClienteDAO.excluir ( Long.parseLong ( dadosProduto ) );
			JOptionPane.showMessageDialog ( null ,
			                                "Cliente excluido com sucesso " ,
			                                "EXCLUIDO" ,
			                                JOptionPane.INFORMATION_MESSAGE );
		}

		private static void consultarCliente ( String dadosProduto ){
			Cliente cliente = iClienteDAO.consultar ( Long.parseLong ( dadosProduto ) );
			if ( cliente != null ) {
				JOptionPane.showMessageDialog ( null ,
				                                "Cliente encontrado :\n" + cliente.toString ( ) ,
				                                "Sucesso" ,
				                                JOptionPane.INFORMATION_MESSAGE );
			}
			else {
				JOptionPane.showMessageDialog ( null ,
				                                "Cliente não encontrado " ,
				                                "ERRO" ,
				                                JOptionPane.INFORMATION_MESSAGE );
			}
		}

		private static void cadastrarCliente ( String dadosProduto ){

			String[] dadosSeparados = dadosProduto.split ( "," );
			Cliente cliente = new Cliente ( dadosSeparados[ 0 ] ,
			                                dadosSeparados[ 1 ] ,
			                                dadosSeparados[ 2 ] ,
			                                dadosSeparados[ 3 ] ,
			                                dadosSeparados[ 4 ] ,
			                                dadosSeparados[ 5 ] ,
			                                dadosSeparados[ 6 ] );
			Boolean isCadastradoCliente = iClienteDAO.cadastrar ( cliente );
			if ( isCadastradoCliente ) {
				JOptionPane.showMessageDialog ( null ,
				                                "Cliente cadastrado com sucesso" ,
				                                "Sucesso" ,
				                                JOptionPane.INFORMATION_MESSAGE );
			}
			else {
				JOptionPane.showMessageDialog ( null ,
				                                "Cliente já se encontra cadastrado" ,
				                                "OPS!!" ,
				                                JOptionPane.INFORMATION_MESSAGE );
			}
		}

//		//Lucas Levy Peruchi, 36864689808, 19999501304,Alameda das flores,252,Cordeirópolis,SP

		private static void sairCliente ( ) {
			JOptionPane.showMessageDialog ( null ,
			                                "Saindo do Menu de Cadastro" ,
			                                "SAIR" ,
			                                JOptionPane.INFORMATION_MESSAGE );
			System.exit ( 0 );
		}

		private static boolean isOpcaoValidaCliente ( String opcaoCliente ){
			return "1".equals ( opcaoCliente ) || "2".equals ( opcaoCliente ) || "3".equals ( opcaoCliente ) || "4"
			.equals ( opcaoCliente ) || "5".equals ( opcaoCliente );
		}


	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


	private static void alterarProduto ( String dadosProduto ){
		String[] dadosSeparados = dadosProduto.split ( "," );
		Produto produto = new Produto ( dadosSeparados[ 0 ] ,
		                                dadosSeparados[ 1 ] ,
		                                dadosSeparados[ 2 ] ,
		                                dadosSeparados[ 3 ] ,
		                                dadosSeparados[ 4 ] ,
		                                dadosSeparados[ 5 ] ,
		                                dadosSeparados[ 6 ] );
		iProdutoDAO.alterar ( produto );
	}

	private static void exclusaoProduto ( String dadosProduto ){
		iProdutoDAO.excluir ( Long.parseLong ( dadosProduto ) );
		JOptionPane.showMessageDialog ( null ,
		                                "Cliente excluido com sucesso " ,
		                                "EXCLUIDO" ,
		                                JOptionPane.INFORMATION_MESSAGE );
	}

	private static void consultarProduto ( String dadosProduto ){
		Produto produto = iProdutoDAO.consultar ( Long.parseLong ( dadosProduto ) );
		if ( produto != null ) {
			JOptionPane.showMessageDialog ( null ,
			                                "Cliente encontrado :\n" + produto.toString ( ) ,
			                                "Sucesso" ,
			                                JOptionPane.INFORMATION_MESSAGE );
		}
		else {
			JOptionPane.showMessageDialog ( null ,
			                                "Cliente não encontrado " ,
			                                "ERRO" ,
			                                JOptionPane.INFORMATION_MESSAGE );
		}
	}

	private static void cadastrarProduto ( String dadosProduto ){

		String[] dadosSeparados = dadosProduto.split ( "," );
		Produto produto = new Produto ( dadosSeparados[ 0 ] ,
		                                dadosSeparados[ 1 ] ,
		                                dadosSeparados[ 2 ] ,
		                                dadosSeparados[ 3 ] ,
		                                dadosSeparados[ 4 ] ,
		                                dadosSeparados[ 5 ] ,
		                                dadosSeparados[ 6 ] );
		Boolean isCadastradoProduto = iProdutoDAO.cadastrar ( produto );
		if ( isCadastradoProduto ) {
			JOptionPane.showMessageDialog ( null ,
			                                "Cliente cadastrado com sucesso" ,
			                                "Sucesso" ,
			                                JOptionPane.INFORMATION_MESSAGE );
		}
		else {
			JOptionPane.showMessageDialog ( null ,
			                                "Cliente já se encontra cadastrado" ,
			                                "OPS!!" ,
			                                JOptionPane.INFORMATION_MESSAGE );
		}
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


		private static boolean isOpcaoCadastroCliente ( String opcaoCliente ){
			return "1".equals ( opcaoCliente );
		}

		private static boolean isOpcaoConsultarCliente ( String opcaoCliente ){
			return "2".equals ( opcaoCliente );
		}

		private static boolean isOpcaoExclusaoCliente ( String opcaoCliente ){
			return "3".equals ( opcaoCliente );
		}

		private static boolean isOpcaoAlteracaoCliente ( String opcaoCliente ){
			return "4".equals ( opcaoCliente );
		}

		private static boolean isOpcaoSairCliente ( String opcaoCliente ){
			return "5".equals ( opcaoCliente );
		}

		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	private static void sairProduto ( ) {
		JOptionPane.showMessageDialog ( null ,
		                                "Saindo do Menu de Cadastro" ,
		                                "SAIR" ,
		                                JOptionPane.INFORMATION_MESSAGE );
		System.exit ( 0 );
	}

	private static boolean isOpcaoValidaProduto ( String opcaoProduto ) {
		return "1".equals ( opcaoProduto ) || "2".equals ( opcaoProduto ) || "3".equals ( opcaoProduto ) || "4".equals ( opcaoProduto ) || "5".equals ( opcaoProduto );
	}

	private static boolean isOpcaoCadastroProduto ( String opcaoProduto ) {
		return "1".equals ( opcaoProduto );
	}

	private static boolean isOpcaoConsultarProduto ( String opcaoProduto ) {
		return "2".equals ( opcaoProduto );
	}

	private static boolean isOpcaoExclusaoProduto ( String opcaoProduto ) {
		return "3".equals ( opcaoProduto );
	}

	private static boolean isOpcaoAlteracaoProduto ( String opcaoProduto ) {
		return "4".equals ( opcaoProduto );
	}

	private static boolean isOpcaoSairProduto ( String opcaoProduto ) {
		return "5".equals ( opcaoProduto );
	}


}
