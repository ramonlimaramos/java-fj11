package br.com.caelum.modelo;

public class Conta implements Comparable<Conta> {
	protected int numero;
	private int banco;
	private double saldo;
	
	public Conta(double saldo) {
		// TODO Auto-generated constructor stub
		this.saldo = saldo;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public void saca(double valor) {
		this.saldo -= valor;
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Conta com saldo igual á "+ saldo;
	}
	
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

	@Override
	public int compareTo(Conta outra) {
		if(this.saldo < outra.saldo) return -1;
		if(this.saldo > outra.saldo) return 1;
		return 0;
	}
	
	
	
}
