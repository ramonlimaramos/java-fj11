package br.com.caelum.chainresponsability.exercicios;

public class TesteDeRequisicao {
	public static void main(String[] args) {
		Requisicao requisicao = new Requisicao(Formato.XML);
		Conta conta = new Conta("Ramon", 500.00);
		GeradorDeRespostas gdr = new GeradorDeRespostas();
		
		gdr.gera(requisicao, conta);
	}
}
