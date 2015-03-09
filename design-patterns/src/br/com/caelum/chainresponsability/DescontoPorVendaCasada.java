package br.com.caelum.chainresponsability;

import br.com.caelum.strategy.Orcamento;

public class DescontoPorVendaCasada implements Desconto {
	private Desconto proximo;

	@Override
	public double desconto(Orcamento o) {
		if (existe("LAPIS", o) && existe("CANETA", o)) {
			return o.getValor() * 0.05;
		} else {
			return proximo.desconto(o);
		}
	}

	private boolean existe(String string, Orcamento o) {
		for (Item item : o.getItens()) {
			if (item.getNome().equals(string))
				return true;
		}

		return false;
	}

	@Override
	public void setProximo(Desconto d) {
		this.proximo = d;
	}

}
