package br.com.caelum.chainresponsability.exercicios;

public class RespostaEmCSV implements Resposta {

	private Resposta proximo;

	@Override
	public void responde(Requisicao req, Conta conta) {
		if(req.getFormato().equals(Formato.CSV)) {
			System.out.println("titular:"+conta.getTitular()+",\nsaldo:"+conta.getSaldo()+";");
		} else {
			this.proximo.responde(req, conta);
		}

	}

	@Override
	public void setProxima(Resposta resposta) {
		this.proximo = resposta;

	}

}
