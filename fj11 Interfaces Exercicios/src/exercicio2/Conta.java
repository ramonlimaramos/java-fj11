package exercicio2;

public abstract class Conta {
	private int agencia;
	private int numero;
	private int codBanco;
	protected double saldo;
	
	// Business methods
	
	public void deposita(double valor) throws ValorInvalidoException {
		if(!(valor <= 0))
			this.saldo += valor;
		else
			throw new ValorInvalidoException(valor);
	}
	
	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	public void imprimirSaldo() {
		System.out.printf("O saldo é: %.2f", getSaldo());
	}
	
	
	// Getters and Setters
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
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
	public int getCodBanco() {
		return codBanco;
	}
	public void setCodBanco(int codBanco) {
		this.codBanco = codBanco;
	}
}
