package br.com.caelum.decorator;

public class ICPP extends TemplateDeImpostoCondicional {
	
	public ICPP(){
		super();
	}
	
	public ICPP(Imposto outroImposto) {
		super(outroImposto);
	}
	
	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05 + calcularProximoImposto(orcamento);
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07 + calcularProximoImposto(orcamento);
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {

		if(orcamento.getValor() > 500)
			return true;
		else
			return false;
	}

}
