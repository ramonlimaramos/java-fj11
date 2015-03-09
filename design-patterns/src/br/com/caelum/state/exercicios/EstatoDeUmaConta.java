package br.com.caelum.state.exercicios;

public interface EstatoDeUmaConta {
	void deposita(double valor, Conta conta);
	void saca(double valor, Conta conta);
}
