package br.com.caelum.decorator;

public class ImpostoMuitoAlto extends Imposto {
	
	public ImpostoMuitoAlto(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ImpostoMuitoAlto() {}
	
	@Override
	public double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.2 + calcularProximoImposto(orcamento);
	}

}
