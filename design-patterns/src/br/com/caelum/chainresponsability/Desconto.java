package br.com.caelum.chainresponsability;

import br.com.caelum.strategy.Orcamento;

public interface Desconto {
	double desconto(Orcamento o);
	void setProximo(Desconto d);
}
