package exercicio2;

public class ValorInvalidoException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ValorInvalidoException(double valor) {
		super("O valor " + valor + " é inválido");
	}
}
