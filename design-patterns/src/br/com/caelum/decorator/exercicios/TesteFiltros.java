package br.com.caelum.decorator.exercicios;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.strategy.Conta;

public class TesteFiltros {
	public static void main(String[] args) {
		Filtro filtros = new FiltroMenorQue100Reais();
		
		Conta c1 = new Conta("Ciclano");
		c1.deposita(500);
		
		Conta c2 = new Conta("Beltrano");
		c2.deposita(600);
		
		Conta c3 = new Conta("Mane");
		c2.deposita(600000);
		
		Conta c4 = new Conta("RecoReco");
		c2.deposita(50);
		
		List<Conta> contas = new ArrayList<Conta>();
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		contas.add(c4);
		
		filtros.filtra(contas);
		for (Conta conta : contas) {
			System.out.println("Conta - " + conta + " - Nome - "+ conta.getTitular()+" - "+ conta.getSaldo());
		}
	}
}
