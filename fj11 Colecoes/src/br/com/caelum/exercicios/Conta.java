package br.com.caelum.exercicios;

public abstract class Conta {
	protected int numero;
	private double saldo;
	private String nomeDoCliente;

	public Conta(double saldo) {
		// TODO Auto-generated constructor stub
		this.saldo = saldo;
	}
	
	
	
	// Getters and Setters

	public String getNomeDoCliente() {
		return nomeDoCliente;
	}

	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return this.saldo;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	// Overrides
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}
	
}
