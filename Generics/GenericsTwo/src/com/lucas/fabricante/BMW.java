package com.lucas.fabricante;

import com.lucas.fabrica.SistemaInteligente;
import com.lucas.produto.Carro;

public class BMW extends Carro implements SistemaInteligente {
	public BMW ( String modelo , int ano , String cor , double preco ) {
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
		System.out.println ( getModelo ( ) + " está ligada." );
	}

	@Override
	public void desligar ( ) {
		System.out.println ( getModelo ( ) + " foi desligada com eficiência energética." );
	}

	@Override
	public void exibirDetalhes ( ) {
		System.out.println ( "\n                                        |||||  BMW  |||||                           " +
				                     "\n" +
				                     "||||||||||||||||||||||||||||||||||||||||||||||||||||||                    " +
				                     "|||||||||||||||||||||||||||||||||||||||||||||||||||\n" + this.toString ( ) );
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
