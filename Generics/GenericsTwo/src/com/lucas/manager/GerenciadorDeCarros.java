package com.lucas.manager;

import com.lucas.fabrica.SistemaInteligente;
import com.lucas.produto.Carro;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GerenciadorDeCarros {
	private List < Carro > carros = new ArrayList <> ( );
	private String[] itens = { "Teto Solar" , "Câmera Traseira" , "Ar Condicionado" , "Suspensão Regulável" };
	private Random random = new Random ( );

	public void adicionarCarro ( Carro carro ) {
		carros.add ( carro );
	}

	public void removerCarro ( Carro carro ) {
		carros.remove ( carro );
	}

	public void adicionarItensAosCarros ( ) {
		System.out.println ( );
		System.out.println (
				"|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||" );
		System.out.println ( "|||||||||||||||||      ADICIONANDO ITENS AOS CARROS          |||||||||||||||||||||||" );
		System.out.println ( "||||||||||||||||||||||                          (FABRICANTE )                 " +
				                     "||||||||||||||||||||||||" );
		System.out.println (
				"|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||" );
		System.out.println ( );

		for ( int i = 0 ; i < carros.size ( ) ; i++ ) {
			if ( i % 2 == 0 ) {
				carros.get ( i ).adicionarItem ( itens[ i % itens.length ] );
				carros.get ( i ).adicionarItem ( itens[ ( i + 1 ) % itens.length ] );
			}
		}
		System.out.println ( );
		System.out.println (
				"|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||" );
		System.out.println (
				"|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||" );
		System.out.println (
				"|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||" );
		System.out.println ( );
		System.out.println ( );
		System.out.println ( );
		System.out.println ( );

	}

	public void manipularItensAleatoriamente ( ) {
		System.out.println ( );
		System.out.println (
				"|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||" );
		System.out.println ( "||||||||||||||||||||||                 TESTE ITEMS  DO CARRO          " +
				                     "||||||||||||||||||||||||" );
		System.out.println ( "||||||||||||||||||||||                          (FABRICANTE )                 " +
				                     "||||||||||||||||||||||||" );
		System.out.println (
				"|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||" );
		System.out.println ( );
		for ( Carro carro : carros ) {
			if ( random.nextBoolean ( ) ) {
				carro.ligarItem ( itens[ random.nextInt ( itens.length ) ] );
			}
			else {
				carro.desligarItem ( itens[ random.nextInt ( itens.length ) ] );
			}
		}
		System.out.println ( );
		System.out.println (
				"|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||" );
		System.out.println (
				"|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||" );
		System.out.println (
				"|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||" );
		System.out.println ( );
		System.out.println ( );
		System.out.println ( );
		System.out.println ( );
	}

	public void executarAcoesNosCarros ( ) {
		System.out.println ( );
		System.out.println (
				"|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||" );
		System.out.println ( "|||||||||||||||||||||||||||||||             TESTE INDIVIDUAL                 " +
				                     "||||||||||||||||||||||||" );
		System.out.println ( "|||||||||||||||||||||||||||||||                (FABRICANTE )                    " +
				                     "||||||||||||||||||||||||" );
		System.out.println (
				"|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||" );
		System.out.println ( );
		for ( Carro carro : carros ) {
			carro.exibirDetalhes ( );
			for ( int i = 0 ; i < 3 ; i++ ) {
				carro.acelerar ( );
			}
			for ( int i = 0 ; i < 2 ; i++ ) {
				carro.frear ( );
			}

			if ( carro instanceof SistemaInteligente ) {
				SistemaInteligente inteligente = ( SistemaInteligente ) carro;

				if ( random.nextBoolean ( ) ) {
					inteligente.ativarPilotoAutomatico ( );
				}
				if ( random.nextBoolean ( ) ) {
					inteligente.ativarEstacionamentoAutomatico ( );
				}
			}
		}
		System.out.println ( );
		System.out.println (
				"|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||" );
		System.out.println (
				"|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||" );
		System.out.println (
				"|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||" );
		System.out.println ( );
		System.out.println ( );
		System.out.println ( );
		System.out.println ( );
	}


	public void atividadeDoMotor ( ) {
		System.out.println ( );
		System.out.println (
				"|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||" );
		System.out.println ( "|||||||||||||||||      TESTE DE FUNCIONAMENTO DO MOTOR      |||||||||||||||||" );
		System.out.println ( "|||||||||||||||||||            (CONTROLE DE QUALIDADE )                 " +
				                     "|||||||||||||||||" );
		System.out.println (
				"|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||" );
		System.out.println ( );
		for ( Carro carro : carros ) {
			int acelerar = random.nextInt ( 3 ) + 1;
			for ( int i = 0 ; i < acelerar ; i++ ) {
				carro.acelerar ( );
				System.out.println ( "O carro |" + carro.getModelo ( ) + "| acelerou para " + carro.getVelocidade ( ) + " KM/h." );
			}

			int freiar = random.nextInt ( 2 ) + 1;
			for ( int i = 0 ; i < freiar ; i++ ) {
				carro.frear ( );
				System.out.println ( "O carro |" + carro.getModelo ( ) + "| reduziu para " + carro.getVelocidade ( ) + " KM/h." );
			}
		}
		System.out.println ( );
		System.out.println (
				"|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||" );
		System.out.println (
				"|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||" );
		System.out.println (
				"|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||" );
		System.out.println ( );
		System.out.println ( );
		System.out.println ( );
		System.out.println ( );
	}

	public void listarCarros ( ) {
		System.out.println ( );
		System.out.println (
				"|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||" );
		System.out.println ( "|||||||||||||||||||||||||      RELATÓRIO DE CARROS APÓS TESTE    " +
				                     "|||||||||||||||||||||" );
		System.out.println ( "|||||||||||||||||||            (CONTROLE DE QUALIDADE )                 " +
				                     "|||||||||||||||||" );
		System.out.println (
				"|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||" );
		System.out.println ( );
		for ( Carro carro : carros ) {
			carro.exibirDetalhes ( );
		}
		System.out.println ( );
		System.out.println (
				"|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||" );
		System.out.println (
				"|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||" );
		System.out.println (
				"|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||" );
	}
}
