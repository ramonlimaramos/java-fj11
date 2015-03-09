package br.com.caelum.exercicios;

import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class TesteExercicio18 {
	public static void main(String[] args) {
		Collection<Integer> listaNumeros = new TreeSet<Integer>( Collections.reverseOrder() );
		
		for (int i = 1; i <= 1000; i++) {
			listaNumeros.add(i);
		}
		
		
		for (Integer integer : listaNumeros) {
			System.out.println(integer);
		}
		
		outraManeira();
	}
	
	private static void outraManeira() {
		System.out.println("\nOutra maneira usando descendingSet();");
		
		TreeSet<Integer> conjunto = new TreeSet<Integer>();
		for (int i = 1; i <= 1000; i++) {
			conjunto.add(i);
		}
		
		for (Integer integer : conjunto.descendingSet()) {
			System.out.println(integer + " ");
		}
	}
}
