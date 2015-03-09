package br.com.caelum.templatemethod;

import br.com.caelum.chainresponsability.Item;
import br.com.caelum.strategy.Orcamento;

public class IKCV extends TemplateDeImpostoCondicional {

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		
		if(orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento))
			return true;
		else
			return false;
	}
	
	private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {

		for (Item item : orcamento.getItens()) {
			if(item.getValor() > 100) return true;
		}
		return false;
	}

}
