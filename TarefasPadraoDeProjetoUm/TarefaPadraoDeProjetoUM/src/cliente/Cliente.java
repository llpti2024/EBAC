package cliente;

import interfaces.Carro;
import loja.Loja1;

import java.util.Scanner;
import java.util.logging.Logger;

import fabricas.Ford;
import fabricas.Toyota;

public class Cliente {
	public static void main ( String[] args ) {
		Logger logger = Logger.getLogger ( Cliente.class.getName ( ) );
		Loja1 loja = new Loja1 ( );
		Scanner sc = new Scanner ( System.in );

		System.out.println ( "!!!!!!!!!!!!!!!!!!!!!!!!!!" );
		System.out.println ( "BEM VINDO A LOJA DE CARROS" );
		System.out.println ( "!!!!!!!!!!!!!!!!!!!!!!!!!!" );
		System.out.println ( );
		System.out.println ( "Temos as seguintes opções:" );
		System.out.println ( );
		System.out.println ( "1 - Carro Toyota Suv Basico" );
		System.out.println ( "2 - Carro Toyota Sedan Basico" );
		System.out.println ( "3 - Carro Ford Suv Basico" );
		System.out.println ( "4 - Carro Ford Sedan Basico" );
		System.out.println ( "5 - Carro Toyota Suv Luxo" );
		System.out.println ( "6 - Carro Toyota Sedan Luxo" );
		System.out.println ( "7 - Carro Ford Suv Luxo" );
		System.out.println ( "8 - Carro Ford Sedan Luxo" );
		System.out.println ( );


		System.out.println ( "Você gostaria de comprar qual carro ?" );
		System.out.print ( "Escolha uma das opções: " );
		String resposta = sc.nextLine ( );

		switch ( resposta ) {

			case "1":

				logger.info ( "Compra na Loja 1 - Toyota - Suv - Basico - Vermelho " );
				loja.comprarToyotaSuvBasico ( );
				break;

			case "2":

				logger.info ( "Compra na Loja 1 - Toyota - Sedan - Basico - Branco " );
				loja.comprarToyotaSedanBasico ( );

				break;

			case "3":

				logger.info ( "Compra na Loja 1 - Ford - Suv - Basico - Preto " );
				loja.comprarFordSuvBasico ( );

				break;

			case "4":

				logger.info ( "Compra na Loja 1 - Ford - Sedan - Basico - Azul " );
				loja.comprarFordSedanBasico ( );

				break;

			case "5":

				logger.info ( "Compra na Loja 1 - Toyota - Suv - Luxo - Vermelho " );
				loja.comprarToyotaSuvLuxo ( );

				break;

			case "6":

				logger.info ( "Compra na Loja 1 - Toyota - Sedan - Luxo - Branco " );
				loja.comprarToyotaSedanLuxo ( );

				break;

			case "7":

				logger.info ( "Compra na Loja 1 - Ford - Suv - Luxo - Preto " );
				loja.comprarFordSuvLuxo ( );

				break;

			case "8":

				logger.info ( "Compra na Loja 1 - Ford - Sedan - Luxo - Azul " );
				loja.comprarFordSedanLuxo ( );

				break;

			default:

				logger.info ( "Opção inválida" );

				break;
		}
	}
}
