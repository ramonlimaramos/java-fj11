package br.com.caelum.chainresponsability;

import br.com.caelum.strategy.Orcamento;

public class TesteDeDescontos {
	public static void main(String[] args) {
		CalculadorDeDesconto cdd = new CalculadorDeDesconto();
		
		Orcamento orcamento = new Orcamento(500.0);
		orcamento.adiciona(new Item("CANETA", 250.0));
		orcamento.adiciona(new Item("LAPIS", 250.0));
		
		double descontoFinal = cdd.calcula(orcamento);
		System.out.println(descontoFinal);
	}
}
