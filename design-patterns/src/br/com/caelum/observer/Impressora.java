package br.com.caelum.observer;

import br.com.caelum.builder.NotaFiscal;

public class Impressora implements AcoesAposGerarNota{

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("nota impressa");
	}

}
