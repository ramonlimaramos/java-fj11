package br.com.caelum.strategy;

public class CalculadorDeImpostos {
	public void realizaCalculo(Orcamento o, Imposto impostoQualquer) {
		double impostoCalculado = impostoQualquer.calculaImposto(o);
		System.out.println(impostoCalculado);
	}
}
