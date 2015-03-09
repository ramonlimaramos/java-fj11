package br.com.empresa.banco.sistema;

import br.com.empresa.banco.conta.Conta;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public void roda(Conta c) {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Saldo anterior: " + c.getSaldo());
		c.atualiza(this.selic);
		System.out.println("Saldo final: " + c.getSaldo());
		System.out.println("\n");
		this.saldoTotal += c.getSaldo();
	}

	public double getSaldoTotal() {
		return this.saldoTotal;
	}
}