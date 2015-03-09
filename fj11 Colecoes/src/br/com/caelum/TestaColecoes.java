package br.com.caelum;

import java.util.ArrayList;
import java.util.Collections;

import br.com.caelum.modelo.Conta;

public class TestaColecoes {
	public static void main(String[] args) {
		
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Ramon");
		nomes.add("Alinne");
		
		/*
		 * Ordenando a lista com o Collections.sort();
		 * O método sort() é herdado do Comparable
		 * */
		Collections.sort(nomes);
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
		System.out.println("\n");
		
		Conta c1 = new Conta(500.00);
		Conta c2 = new Conta(600.00);
		Conta c3 = new Conta(100.00);
		
		ArrayList<Conta> contas = new ArrayList<Conta>();
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		
		/*
		 * A minha classe Conta esta implementado a interface Comparable<Conta>
		 * onde eu sobre escrevi o método sort ordendo pelo valor do atributo saldo. 
		 * */
		Collections.sort(contas);
		
		for (Conta conta : contas) {
			System.out.println(conta);
		}
	}
	
	
}
