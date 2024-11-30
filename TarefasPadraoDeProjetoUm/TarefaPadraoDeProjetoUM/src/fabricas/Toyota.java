package fabricas;

import carros.Sedan;
import carros.Suv;
import interfaces.Carro;
import interfaces.CarroFabrica;

import java.util.logging.Logger;

public class Toyota implements CarroFabrica {
	Logger logger = Logger.getLogger ( getClass ( ).getName ( ) );

	public Carro criarSuv ( ) {
		logger.info ( "Criando Carro Toyota SUV" );
		return new Suv ( );
	}

	public Carro criarSedan ( ) {
		logger.info ( "Criando carro Toyota Sedan" );
		return new Sedan ( );
	}
}
