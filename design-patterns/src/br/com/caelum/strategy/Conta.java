package br.com.caelum.strategy;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Conta {
	private double saldo;
	private String titular;
	private Calendar dataAbertura;
	
	public Conta(String titular) {
		this.titular = titular;
		this.dataAbertura = GregorianCalendar.getInstance();
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}
	
	
}
