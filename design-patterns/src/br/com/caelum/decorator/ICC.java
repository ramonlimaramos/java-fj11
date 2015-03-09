package br.com.caelum.decorator;

public class ICC extends Imposto {
	
	public ICC(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ICC() {}
	
	@Override
	public double calculaImposto(Orcamento orcamento) {
		if(orcamento.getValor() < 1000) {
			return orcamento.getValor() * 0.05 + calcularProximoImposto(orcamento);
		}
		else if(orcamento.getValor() >= 1000 && orcamento.getValor() <= 3000) {
			return orcamento.getValor() * 0.07 + calcularProximoImposto(orcamento);
		}
		else {
			return orcamento.getValor() * 0.08 + 30 + calcularProximoImposto(orcamento);
		}
	}

}
