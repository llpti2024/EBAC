package com.lucas.produto;


import java.util.HashMap;
import java.util.Map;


public abstract class Carro {
	private String modelo;
	private int ano;
	private String cor;
	private double preco;
	private int velocidade = 0;
	private Map < String, Boolean > itensAdicionais = new HashMap <> ( );

	public Carro ( String modelo , int ano , String cor , double preco ) {
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.preco = preco;
	}

	public abstract void acelerar ( );

	public abstract void frear ( );

	public abstract void ligar ( );

	public abstract void desligar ( );

	public abstract void exibirDetalhes ( );


	public void adicionarItem ( String item ) {
		itensAdicionais.put ( item ,
		                      false );
		System.out.println ( "|" + item + "| foi incluido ao carro |" + modelo + "|" );
	}

	public void removerItem ( String item ) {
		if ( itensAdicionais.remove ( item ) != null ) {
			System.out.println ( "|" + item + "| foi removido do carro |" + modelo + "|" );
		}
		else {
			System.out.println ( "|" + item + "|  não está disponível no carro |" + modelo + "|" );
		}
	}

	public void ligarItem ( String item ) {
		if ( itensAdicionais.containsKey ( item ) ) {
			itensAdicionais.put ( item ,
			                      true );
			System.out.println ( "|" + item + "| O item foi ligado no carro |" + modelo + "|" );
		}
		else {
			System.out.println ( "|" + item + "| não está disponível no carro |" + modelo + "|" );
		}
	}

	public void desligarItem ( String item ) {
		if ( itensAdicionais.containsKey ( item ) ) {
			itensAdicionais.put ( item ,
			                      false );
			System.out.println ( "|" + item + "| foi desligado no carro |" + modelo + "|" );
		}
		else {
			System.out.println ( "|" + item + "| não está disponível no carro |" + modelo + "|" );
		}
	}

	public void listarItens ( ) {
		System.out.println ( "Itens adicionais do carro |" + modelo + "|" );
		for ( Map.Entry < String, Boolean > entry : itensAdicionais.entrySet ( ) ) {
			System.out.println ( entry.getKey ( ) + " - " + ( entry.getValue ( ) ? "LIGADO" : "DESLIGADO" ) );
		}
	}


	public void aumentarVelocidade ( ) {
		velocidade += 60;
		System.out.println ( "O carro  |" + modelo + "| acelerou para " + velocidade + " KM/h." );
	}

	public void reduzirVelocidade ( ) {
		if ( velocidade > 0 ) {
			velocidade -= 30;
			System.out.println ( "O carro  |" + modelo + "| reduziu para " + velocidade + " KM/h." );
		}
		else {
			System.out.println ( "O carro  |" + modelo + "|  já está parado." );
		}
	}


	public String getModelo ( ) {
		return modelo;
	}

	public int getAno ( ) {
		return ano;
	}

	public String getCor ( ) {
		return cor;
	}

	public double getPreco ( ) {
		return preco;
	}

	public int getVelocidade ( ) {
		return velocidade;
	}

	@Override
	public String toString ( ) {
		return "\n" +
				"|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||" +
				"\nModelo:       " + modelo +
				"\nAno:             " + ano +
				"\nCor:              " + cor +
				"\nPreço:          R$" + preco +
				"\nVelocidade:    " + velocidade + " KM/h" +
				"\nItens adicionais: " + itensAdicionais +
				"\n|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n";
	}
}
