package br.com.caelum.observer;

import br.com.caelum.builder.NotaFiscal;

public class NotaFiscalDao implements AcoesAposGerarNota {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("nota salva no banco de dados");
	}

}
