
public class SaldoInsuficienteException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double saldoAtual;

	public SaldoInsuficienteException(double saldoAtual) {
		super("Saldo insuficiente: " + saldoAtual + " by SaldoInsuficienteException");
		this.saldoAtual = saldoAtual;
	}

	public double getSaldoAtual() {
		return saldoAtual;
	}

}
