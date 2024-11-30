package fabricas;

import carros.Sedan;
import carros.Suv;
import interfaces.Carro;
import interfaces.CarroFabrica;

import java.util.logging.Logger;

public class Ford implements CarroFabrica {
	Logger logger = Logger.getLogger ( getClass ( ).getName ( ) );

	@Override
	public Carro criarSuv ( ) {
		logger.info ( "Criando carro FORD SUV" );
		return new Suv ( );
	}

	@Override
	public Carro criarSedan ( ) {
		logger.info ( "Criando carro FORD Sedan" );
		return new Sedan ( );
	}
}
