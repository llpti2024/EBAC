package com.lucas.main;

import com.lucas.fabricante.BMW;
import com.lucas.fabricante.Ferrari;
import com.lucas.fabricante.Lamborghini;
import com.lucas.fabricante.Porsche;
import com.lucas.manager.GerenciadorDeCarros;

public class Main {
	public static void main ( String[] args ) {
		GerenciadorDeCarros gerenciador = new GerenciadorDeCarros ( );

		gerenciador.adicionarCarro ( new Ferrari ( "F8 Tributo" ,
		                                           2023 ,
		                                           "Vermelha" ,
		                                           2500000 ) );
		gerenciador.adicionarCarro ( new Ferrari ( "SF90 Stradale" ,
		                                           2023 ,
		                                           "Preta" ,
		                                           3000000 ) );
		gerenciador.adicionarCarro ( new Ferrari ( "296 GTB" ,
		                                           2024 ,
		                                           "Branca" ,
		                                           2700000 ) );

		gerenciador.adicionarCarro ( new Lamborghini ( "Huracan" ,
		                                               2023 ,
		                                               "Amarela" ,
		                                               2200000 ) );
		gerenciador.adicionarCarro ( new Lamborghini ( "Aventador" ,
		                                               2022 ,
		                                               "Laranja" ,
		                                               3500000 ) );
		gerenciador.adicionarCarro ( new Lamborghini ( "Urus" ,
		                                               2024 ,
		                                               "Cinza" ,
		                                               2100000 ) );

		gerenciador.adicionarCarro ( new Porsche ( "911 Turbo S" ,
		                                           2023 ,
		                                           "Prata" ,
		                                           1800000 ) );
		gerenciador.adicionarCarro ( new Porsche ( "Taycan" ,
		                                           2023 ,
		                                           "Azul" ,
		                                           1600000 ) );
		gerenciador.adicionarCarro ( new Porsche ( "Panamera" ,
		                                           2024 ,
		                                           "Preto" ,
		                                           1900000 ) );

		gerenciador.adicionarCarro ( new BMW ( "i8" ,
		                                       2023 ,
		                                       "Azul" ,
		                                       1200000 ) );
		gerenciador.adicionarCarro ( new BMW ( "X6" ,
		                                       2023 ,
		                                       "Preto" ,
		                                       500000 ) );
		gerenciador.adicionarCarro ( new BMW ( "M4" ,
		                                       2024 ,
		                                       "Branco" ,
		                                       750000 ) );

		gerenciador.adicionarItensAosCarros ( );
		gerenciador.manipularItensAleatoriamente ( );
		gerenciador.executarAcoesNosCarros ( );
		gerenciador.atividadeDoMotor ( );
		gerenciador.listarCarros ( );
	}
}
