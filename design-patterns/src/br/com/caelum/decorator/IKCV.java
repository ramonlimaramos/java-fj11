package br.com.caelum.decorator;

import br.com.caelum.chainresponsability.Item;

public class IKCV extends TemplateDeImpostoCondicional {
	
	public IKCV() {
		super();
	}
	
	public IKCV(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculaImposto(orcamento);
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10 + calculaImposto(orcamento);
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
