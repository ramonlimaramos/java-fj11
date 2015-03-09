package br.com.caelum.chainresponsability.exercicios;

public class GeradorDeRespostas {
	public void gera(Requisicao req, Conta conta) {
		Resposta r1 = new RespostaEmXML();
		Resposta r2 = new RespostaEmCSV();
		Resposta r3 = new RespostasEmPORCENTO();
		Resposta r4 = new RespostaNula();
		
		r1.setProxima(r2);
		r2.setProxima(r3);
		r3.setProxima(r4);
		
		r1.responde(req, conta);
	}
}
