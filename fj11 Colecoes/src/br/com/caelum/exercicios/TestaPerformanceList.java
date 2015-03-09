package br.com.caelum.exercicios;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaPerformanceList {
	public static void main(String[] args) {
		System.out.println("Iniciando ...");
		
		List<Integer> listTest = new ArrayList<Integer>();
		long incio = System.currentTimeMillis();
		
		long total = 300000;
		
		long inicioInsert = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			listTest.add(i);
		}
		long fimInsert = System.currentTimeMillis();
		
		
		long inicioRead = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			listTest.contains(i);
		}
		long fimRead = System.currentTimeMillis();
		
		long fim = System.currentTimeMillis();
		
		System.out.println("Fim ...");
		
		System.out.println("Tempo total: "+ (fim - incio));
		System.out.println("Insert: "+ (fimInsert - inicioInsert));
		System.out.println("Read: "+ (fimRead - inicioRead));
		
	}
}
