package br.com.lucas.annotationandexceptions.exceptions;

public class TabelaNaoExisteException extends Exception {
	public TabelaNaoExisteException ( String message ) {
		super ( message );
	}
}
