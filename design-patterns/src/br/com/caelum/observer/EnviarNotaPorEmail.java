package br.com.caelum.observer;

import br.com.caelum.builder.NotaFiscal;

public class EnviarNotaPorEmail implements AcoesAposGerarNota{

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("enviei por email");
	}

}
