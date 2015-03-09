package br.com.caelum.state.exercicios;

public class ContaNegativa implements EstatoDeUmaConta {

	@Override
	public void deposita(double valor, Conta conta) {
		conta.saldo += valor * 0.95;
		if(conta.saldo > 0) conta.estadoAtual = new ContaPositiva();
	}

	@Override
	public void saca(double valor, Conta conta) {
		throw new RuntimeException("Uma conta em negativo não permite saques!");
	}

}
