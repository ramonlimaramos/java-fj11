package br.com.caelum.modelo;

public class Conta {
	private int numero;
	private int banco;
	private double saldo;
	
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
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Conta outraConta = (Conta) obj;
		return this.numero == outraConta.numero;
	}
	
}
