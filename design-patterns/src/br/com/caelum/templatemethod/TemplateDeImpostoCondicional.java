package br.com.caelum.templatemethod;

import br.com.caelum.strategy.Imposto;
import br.com.caelum.strategy.Orcamento;

public abstract class TemplateDeImpostoCondicional implements Imposto {

	@Override
	public final double calculaImposto(Orcamento orcamento) {
		
		if(deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		} else {
			return minimaTaxacao(orcamento);
		}
	}

	protected abstract double minimaTaxacao(Orcamento orcamento);

	protected abstract double maximaTaxacao(Orcamento orcamento);

	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
