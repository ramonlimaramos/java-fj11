package br.com.caelum.chainresponsability.exercicios;

public class RespostaEmXML implements Resposta {

	private Resposta proximo;

	@Override
	public void responde(Requisicao req, Conta conta) {
		if(req.getFormato() == Formato.XML) {
			System.out.println("<conta><titular>"+conta.getTitular()+"</titular>"+
							   "<saldo>"+conta.getSaldo()+"</saldo></conta>");
		} else {
			this.proximo.responde(req, conta);
		}
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.proximo = resposta;
	}

}
