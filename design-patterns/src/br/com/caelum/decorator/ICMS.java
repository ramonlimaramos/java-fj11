package br.com.caelum.decorator;

public class ICMS extends Imposto {

	public ICMS(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ICMS() {}
	
	@Override
	public double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.05 + calcularProximoImposto(orcamento);
	}

}
