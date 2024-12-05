package com.lucas.manager;

import java.util.ArrayList;
import java.util.List;

public class Gerenciador < T > {
	private List < T > lista;

	public Gerenciador ( ) {
		this.lista = new ArrayList <> ( );
	}

	public void adicionar ( T item ) {
		lista.add ( item );
	}

	public void remover ( T item ) {
		lista.remove ( item );
	}

	public void listar ( ) {
		for ( T item : lista ) {
			System.out.println ( item );
		}
	}

}
