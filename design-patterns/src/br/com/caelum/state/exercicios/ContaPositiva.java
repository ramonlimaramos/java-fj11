package br.com.caelum.state.exercicios;

public class ContaPositiva implements EstatoDeUmaConta {

	@Override
	public void deposita(double valor, Conta conta) {
		conta.saldo += valor * 0.98;
	}

	@Override
	public void saca(double valor, Conta conta) {
		conta.saldo -= valor;
		if(conta.saldo < 0) conta.estadoAtual = new ContaNegativa();
	}

}
