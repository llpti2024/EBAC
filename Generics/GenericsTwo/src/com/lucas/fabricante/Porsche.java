package com.lucas.fabricante;

import com.lucas.fabrica.SistemaInteligente;
import com.lucas.produto.Carro;

public class Porsche extends Carro implements SistemaInteligente {
	public Porsche ( String modelo , int ano , String cor , double preco ) {
		super ( modelo ,
		        ano ,
		        cor ,
		        preco );
	}

	@Override
	public void acelerar ( ) {
		aumentarVelocidade ( );
	}

	@Override
	public void frear ( ) {
		reduzirVelocidade ( );
	}

	@Override
	public void ligar ( ) {
		System.out.println ( getModelo ( ) + " foi ligada, escapamento fazendo rugido extremamente forte." );
	}

	@Override
	public void desligar ( ) {
		System.out.println ( getModelo ( ) + "escapamento faz ruido extremamente forte sendo desligada." );
	}

	@Override
	public void exibirDetalhes ( ) {
		System.out.println ( "\n                                         ||||  PORSCHE ||||                            " +
				                     "\n" +
				                     "||||||||||||||||||||||||||||||||||||||||||||||||||||||                       " +
				                     "||||||||||||||||||||||||||||||||||||||||||||||\n" + this.toString ( ) );
	}

	@Override
	public void ativarPilotoAutomatico ( ) {
		System.out.println ( getModelo ( ) + " ativou o piloto automático, continue atento" );
	}

	@Override
	public void ativarEstacionamentoAutomatico ( ) {
		System.out.println ( getModelo ( ) + " estaciona automaticamente com sensores 360°." );
	}
}
