package br.com.caelum.strategy;

public class TesteStrategy {
	public static void main(String[] args) {
		Orcamento o = new Orcamento(500.00);
		Imposto i = new ICMS();
		
		CalculadorDeImpostos cdi = new CalculadorDeImpostos();
		cdi.realizaCalculo(o, i);
	}
}
