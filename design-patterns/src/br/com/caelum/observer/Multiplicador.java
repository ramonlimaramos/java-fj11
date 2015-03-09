package br.com.caelum.observer;

import br.com.caelum.builder.NotaFiscal;

public class Multiplicador implements AcoesAposGerarNota {
	private double fator;
	
	public Multiplicador(double fator) {
		this.fator = fator;
	}

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println(nf.getValorBruto() * fator);
	}

}
