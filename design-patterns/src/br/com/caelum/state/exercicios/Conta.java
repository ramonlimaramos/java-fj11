package br.com.caelum.state.exercicios;

public class Conta {
	protected double saldo;
	protected EstatoDeUmaConta estadoAtual;
	
	public Conta(double valor) {
		this.saldo = valor;
		if(valor > 0) estadoAtual = new ContaPositiva();
	}
	
	public void deposita(double valor) {
		estadoAtual.deposita(valor, this);
	}
	
	public void saca(double valor) {
		estadoAtual.saca(valor, this);
	}

	public double getSaldo() {
		return saldo;
	}
	
}
