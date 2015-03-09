package br.com.caelum.chainresponsability.exercicios;

public class Conta {
	
	private double saldo;
	private String titular;

	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}
	
}
