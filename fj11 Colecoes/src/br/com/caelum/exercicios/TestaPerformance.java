package br.com.caelum.exercicios;

import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {
	public static void main(String[] args) {
		System.out.println("Iniciando ...");
		
		Collection<Integer> teste = new HashSet<Integer>();
		long inicio = System.currentTimeMillis();
		
		int total = 300000;
		
		long inicioInsert = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		long fimInsert = System.currentTimeMillis();
		
		long inicioPesquisa = System.currentTimeMillis();
		for (int i = 0; i <= total; i++) {
			teste.contains(i);
		}
		long fimPesquisa = System.currentTimeMillis();
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		long tempoInsercao = fimInsert - inicioInsert;
		long tempoPesquisa = fimPesquisa - inicioPesquisa;
		
		System.out.println("Fim ...");
		
		System.out.println("\nTempo total gasto: "+ tempo);
		System.out.println("Tempo total inserção gasto:"+ tempoInsercao);
		System.out.println("Tempo total pesquisa gasto:"+ tempoPesquisa);
	}
}
