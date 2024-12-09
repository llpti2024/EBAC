package com.lucas.fabricante;


import com.lucas.produto.Carro;

public class Ferrari extends Carro {
	public Ferrari(String modelo, int ano, String cor, double preco) {
		super(modelo, ano, cor, preco);
	}

	@Override
	public void acelerar() {
		aumentarVelocidade();
	}

	@Override
	public void frear() {
		reduzirVelocidade();
	}

	@Override
	public void ligar() {
		System.out.println(getModelo() + " foi ligada, escapamento fazendo rugido extremamente forte.");
	}

	@Override
	public void desligar() {
		System.out.println(getModelo() + " escapamento faz ruido extremamente forte sendo desligada.");
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("\n                                         ||||  FERRARI  |||||                           \n" +
				                   "||||||||||||||||||||||||||||||||||||||||||||||||||||||                       ||||||||||||||||||||||||||||||||||||||||||||||\n"+ this.toString());
	}
}