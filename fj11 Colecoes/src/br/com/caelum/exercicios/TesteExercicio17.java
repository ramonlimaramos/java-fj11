package br.com.caelum.exercicios;

import java.util.Collection;
import java.util.HashSet;

public class TesteExercicio17 {
	public static void main(String[] args) {
		Collection<Conta> contas = new HashSet<Conta>();
		
		Conta c1 = new ContaPoupanca(200.00);
		c1.setNomeDoCliente("Fulano");
		c1.setNumero(123);
		
		Conta c2 = new ContaPoupanca(200.00);
		c2.setNomeDoCliente("Cliclano");
		c2.setNumero(123);
		
		contas.add(c1);
		contas.add(c2);
		
		System.out.println(contas.size());
	}
}
