package br.com.empresa.banco.sistema;

import br.com.empresa.banco.conta.Tributavel;

public class GerenciadorDeImpostosDeRenda {
	private double total;
	
	public void adiciona(Tributavel t) {
		System.out.println("Adicionando tributavel " + t);
		
		this.total += t.calculaTributos();
	}
	
	public double getTotal() {
		return this.total;
	}
}
