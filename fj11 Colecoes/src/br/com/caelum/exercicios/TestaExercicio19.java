package br.com.caelum.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaExercicio19 {
	public static void main(String[] args) {
		List<Integer> conjunto = new ArrayList<Integer>();
		
		for (int i = 0; i <= 1000; i++) {
			conjunto.add(i);
		}
		
		System.out.println("ArrayList<Integer> desc.");
		Collections.reverse(conjunto);
		for (Integer integer : conjunto) {
			System.out.println(integer);
		}
	}
}
