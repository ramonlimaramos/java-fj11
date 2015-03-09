package fj11;

abstract class Conta {
	protected double saldo;
	protected int numero;
	protected int agencia;

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double s) {
		this.saldo += s;
	}

	public void saca(double s) {
		this.saldo -= s;
	}

	public abstract void atualiza(double taxa);
}
