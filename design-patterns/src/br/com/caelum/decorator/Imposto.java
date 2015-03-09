package br.com.caelum.decorator;

public abstract class Imposto {
	
	protected Imposto outroImposto;
	
	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}
	
	public Imposto() {}
	
	public abstract double calculaImposto(Orcamento orcamento);
	
	public double calcularProximoImposto(Orcamento orcamento) {
		if(outroImposto == null) {
			return 0;
		} else {
			return outroImposto.calculaImposto(orcamento);
		}
	}
}
