package br.com.caelum.chainresponsability.exercicios;

public interface Resposta {
	void responde(Requisicao req, Conta conta);
	void setProxima(Resposta resposta);
}
