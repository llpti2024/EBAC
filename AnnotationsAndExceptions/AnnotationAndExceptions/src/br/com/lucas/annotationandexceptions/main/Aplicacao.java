package br.com.lucas.annotationandexceptions.main;

import br.com.lucas.annotationandexceptions.core.Tabela;
import br.com.lucas.annotationandexceptions.dao.DAO;
import br.com.lucas.annotationandexceptions.exceptions.TabelaNaoExisteException;

import javax.swing.JOptionPane;

@Tabela ( "Lucas" )
public class Aplicacao {
	public static void main ( String[] args ) {
		try {
			Tabela tabela = Aplicacao.class.getAnnotation ( Tabela.class );
			String nomeTabela = tabela.value ( );

			if ( ! DAO.verificarTabela ( nomeTabela ) ) {
				throw new TabelaNaoExisteException ( "Tabela '" + nomeTabela + "' não existe." );
			}
			JOptionPane.showMessageDialog ( null ,
			                                "Tabela '" + nomeTabela + "' encontrada!!!!!!" );
		} catch ( TabelaNaoExisteException e ) {
			JOptionPane.showMessageDialog ( null ,
			                                e.getMessage ( ) );
		} catch ( Exception e ) {
			JOptionPane.showMessageDialog ( null ,
			                                "Erro: " + e.getMessage ( ) );
		}
	}
}
