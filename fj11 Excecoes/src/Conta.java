
public class Conta {
	private int agencia;
	private int numero;
	private int numeroDoBanco;
	private double saldo;
	
	// Business
	
	public void saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
		} else {
			throw new SaldoInsuficienteException(saldo);
			//throw new RuntimeException("outro erro qualquer !");
		}
	}
	
	public void deposita(double valor) {
		if(!(valor <= 0))
			this.saldo += valor;
		else
			throw new IllegalArgumentException("O valor não pode ser 0 ou negativo");
	}

	// Gettters and Setters
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumeroDoBanco() {
		return numeroDoBanco;
	}

	public void setNumeroDoBanco(int numeroDoBanco) {
		this.numeroDoBanco = numeroDoBanco;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

}
