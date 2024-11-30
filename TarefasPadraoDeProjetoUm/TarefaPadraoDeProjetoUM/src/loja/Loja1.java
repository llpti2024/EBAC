package loja;

import fabricas.Ford;
import fabricas.Toyota;
import interfaces.Carro;
import interfaces.CarroFabrica;
import interfaces.Loja;

import java.util.logging.Logger;


public class Loja1 implements Loja {
	Logger logger = Logger.getLogger ( getClass ( ).getName ( ) );
	CarroFabrica fordFabrica = new Ford ( );
	CarroFabrica toyotaFabrica = new Toyota ( );

	@Override
	public void comprarToyotaSuvBasico ( ) {
		Carro modeloToyotaSuvBasico = toyotaFabrica.criarSuv ( );
		modeloToyotaSuvBasico.exibirInfo ( );
		modeloToyotaSuvBasico.direcao ( "Hidraulica" );
		modeloToyotaSuvBasico.banco ( "Tecido" );
		modeloToyotaSuvBasico.freio ( "Discos" );
		modeloToyotaSuvBasico.farol ( "Normal" );
		modeloToyotaSuvBasico.motor ( "1.6" );
	}

	@Override
	public void comprarToyotaSedanBasico ( ) {
		Carro modeloToyotaSedanBasico = toyotaFabrica.criarSedan ( );
		modeloToyotaSedanBasico.exibirInfo ( );
		modeloToyotaSedanBasico.direcao ( "Hidraulica" );
		modeloToyotaSedanBasico.banco ( "Tecido" );
		modeloToyotaSedanBasico.freio ( "Discos" );
		modeloToyotaSedanBasico.farol ( "Normal" );
		modeloToyotaSedanBasico.motor ( "1.6" );
	}

	@Override
	public void comprarFordSuvBasico ( ) {
		Carro modeloFordSuvBasico = fordFabrica.criarSuv ( );
		modeloFordSuvBasico.exibirInfo ( );
		modeloFordSuvBasico.direcao ( "Hidraulica" );
		modeloFordSuvBasico.banco ( "Tecido" );
		modeloFordSuvBasico.freio ( "Discos" );
		modeloFordSuvBasico.farol ( "Normal" );
		modeloFordSuvBasico.motor ( "1.6" );

	}

	@Override
	public void comprarFordSedanBasico ( ) {
		Carro modeloFordSedanBasico = fordFabrica.criarSedan ( );
		modeloFordSedanBasico.exibirInfo ( );
		modeloFordSedanBasico.direcao ( "Hidraulica" );
		modeloFordSedanBasico.banco ( "Tecido" );
		modeloFordSedanBasico.freio ( "Discos" );
		modeloFordSedanBasico.farol ( "Normal" );
		modeloFordSedanBasico.motor ( "1.6" );
	}

	@Override
	public void comprarToyotaSuvLuxo ( ) {
		Carro modeloToyotaSuvLuxo = toyotaFabrica.criarSuv ( );
		modeloToyotaSuvLuxo.exibirInfo ( );
		modeloToyotaSuvLuxo.direcao ( "Elétrica" );
		modeloToyotaSuvLuxo.banco ( "Couro" );
		modeloToyotaSuvLuxo.freio ( "ABS" );
		modeloToyotaSuvLuxo.farol ( "Xenon" );
		modeloToyotaSuvLuxo.motor ( "2.0" );
	}

	@Override
	public void comprarToyotaSedanLuxo ( ) {
		Carro modeloToyotaSedanLuxo = toyotaFabrica.criarSedan ( );
		modeloToyotaSedanLuxo.exibirInfo ( );
		modeloToyotaSedanLuxo.direcao ( "Elétrica" );
		modeloToyotaSedanLuxo.banco ( "Couro" );
		modeloToyotaSedanLuxo.freio ( "ABS" );
		modeloToyotaSedanLuxo.farol ( "Xenon" );
		modeloToyotaSedanLuxo.motor ( "2.0" );
	}

	@Override
	public void comprarFordSuvLuxo ( ) {
		Carro modeloFordSuvLuxo = fordFabrica.criarSuv ( );
		modeloFordSuvLuxo.exibirInfo ( );
		modeloFordSuvLuxo.direcao ( "Elétrica" );
		modeloFordSuvLuxo.banco ( "Couro" );
		modeloFordSuvLuxo.freio ( "ABS" );
		modeloFordSuvLuxo.farol ( "Xenon" );
		modeloFordSuvLuxo.motor ( "2.0" );
	}

	@Override
	public void comprarFordSedanLuxo ( ) {
		Carro modeloFordSedanLuxo = fordFabrica.criarSedan ( );
		modeloFordSedanLuxo.exibirInfo ( );
		modeloFordSedanLuxo.direcao ( "Elétrica" );
		modeloFordSedanLuxo.banco ( "Couro" );
		modeloFordSedanLuxo.freio ( "ABS" );
		modeloFordSedanLuxo.farol ( "Xenon" );
		modeloFordSedanLuxo.motor ( "2.0" );
	}

}
