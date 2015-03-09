package br.com.caelum.templatemethod;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.chainresponsability.Item;
import br.com.caelum.strategy.Orcamento;

public class IHIT extends TemplateDeImpostoCondicional {

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * (0.01 * orcamento.getItens().size());
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100.00;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		if(tem2ItensComOMesmoNome(orcamento)) {
			return true;
		} else {
			return false;
		}
	}

	private boolean tem2ItensComOMesmoNome(Orcamento orcamento) {
		
		List<String>noOrcamento = new ArrayList<>();
		
		for (Item item : orcamento.getItens()) {
			if(noOrcamento.contains(item.getNome())) return true;
			else noOrcamento.add(item.getNome());
		}
		
		return false;
	}

}
