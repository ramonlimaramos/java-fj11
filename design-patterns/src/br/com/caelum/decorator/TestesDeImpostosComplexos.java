package br.com.caelum.decorator;

public class TestesDeImpostosComplexos {
	
	public static void main(String[] args) {
		Imposto iss = new ISS(new ICPP(new ImpostoMuitoAlto()));
		Orcamento orcamento = new Orcamento(3628);
		
		double valor = iss.calculaImposto(orcamento);
		System.out.println(valor);
	}	
}
