

public class Conta {
	private int numero;
	private int banco;
	private double saldo;
	
	public Conta(double valor) {
		// TODO Auto-generated constructor stub
		this.saldo = valor;
	}
	
	public synchronized void deposita(double valor) {
		this.saldo += valor;
	}
	
	// Getters and Setters
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getBanco() {
		return banco;
	}

	public void setBanco(int banco) {
		this.banco = banco;
	}

	public double getSaldo() {
		return saldo;
	}
}
