package br.com.empresa.banco.exception;

public class ValorInvalidoException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ValorInvalidoException(double valor) {
		super("O valor " + valor + " � inv�lido");
	}
}
