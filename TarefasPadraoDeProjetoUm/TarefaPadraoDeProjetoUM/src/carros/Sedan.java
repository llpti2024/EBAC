package carros;

import java.util.logging.Logger;

import interfaces.Carro;

public class Sedan implements Carro {
	Logger logger = Logger.getLogger ( getClass ( ).getName ( ) );


	@Override
	public void exibirInfo ( ) {
		logger.info ( "Sedan" );
	}

	@Override
	public void direcao ( String direcao ) {
		if ( direcao.equalsIgnoreCase ( "Hidráulica" ) ) {
			logger.info ( "adicionado direção Hidráulica" );
		}
		else if ( direcao.equalsIgnoreCase ( "Elétrica" ) ) {
			logger.info ( "adicionado direção Elétrica" );
		}

	}

	@Override
	public void banco ( String banco ) {
		if ( banco.equalsIgnoreCase ( "Couro" ) ) {
			logger.info ( "adicionado banco de Couro" );
		}
		else if ( banco.equalsIgnoreCase ( "Tecido" ) ) {
			logger.info ( "adicionado banco de Tecido" );
		}
	}

	@Override
	public void freio ( String freio ) {
		if ( freio.equalsIgnoreCase ( "ABS" ) ) {
			logger.info ( "adicionado freio ABS" );
		}
		else if ( freio.equalsIgnoreCase ( "Discos" ) ) {
			logger.info ( "adicionado freio a Discos" );
		}
	}

	@Override
	public void motor ( String motor ) {
		if ( motor.equalsIgnoreCase ( "2.0" ) ) {
			logger.info ( "adicionado motor 2.0" );
		}
		else if ( motor.equalsIgnoreCase ( "1.6" ) ) {
			logger.info ( "adicionado motor 1.6" );
		}
	}

	@Override
	public void farol ( String farol ) {
		if ( farol.equalsIgnoreCase ( "Xenon" ) ) {
			logger.info ( "adicionado farol Xenon" );
		}
		else if ( farol.equalsIgnoreCase ( "Normal" ) ) {
			logger.info ( "adicionado direção Normal" );
		}
	}

	@Override
	public void cor ( String cor ) {
		if ( cor.equalsIgnoreCase ( "Branco" ) ) {
			logger.info ( "adicionado cor Branco" );
		}
		else if ( cor.equalsIgnoreCase ( "Preto" ) ) {
			logger.info ( "adicionado cor Preto" );
		}
		else if ( cor.equalsIgnoreCase ( "Vermelho" ) ) {
			logger.info ( "adicionado cor Vermelho" );
		}
		else if ( cor.equalsIgnoreCase ( "Azul" ) ) {
			logger.info ( "adicionado cor Azul" );

		}

	}
}
