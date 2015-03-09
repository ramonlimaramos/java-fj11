package br.com.caelum.chainresponsability;

import br.com.caelum.strategy.Orcamento;

public class DescontoPorCincoItens implements Desconto {
	private Desconto proximo;

	public double desconto(Orcamento o) {
		if(o.getItens().size() > 5) {
			return o.getValor() * 0.1;
		} else {
			return proximo.desconto(o);
		}
	}

	@Override
	public void setProximo(Desconto d) {
		this.proximo = d;
		
	}
}
