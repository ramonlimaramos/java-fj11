package br.com.caelum.chainresponsability;

import br.com.caelum.strategy.Orcamento;

public class DescontoPorMaisDeQuinhentosReais implements Desconto {
	private Desconto proximo;

	public double desconto(Orcamento o) {
		if(o.getValor() > 500) {
			return o.getValor() * 0.07;
		} else {
			return proximo.desconto(o);
		}
	}

	@Override
	public void setProximo(Desconto d) {
		this.proximo = d;
	}
}
