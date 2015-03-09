package fj11;

public class ContaPoupanca extends Conta {
	
	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}
	
}
