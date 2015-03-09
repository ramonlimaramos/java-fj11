package br.com.caelum.chainresponsability;

import br.com.caelum.strategy.Orcamento;

public class SemDesconto implements Desconto {

	@Override
	public double desconto(Orcamento o) {
		return 0;
	}

	@Override
	public void setProximo(Desconto d) {
		// Não tem próximo
	}

}
