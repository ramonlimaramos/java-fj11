package br.com.caelum.exercicios;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestaColecao {
	public static void main(String[] args) {
		ContaPoupanca c1 = new ContaPoupanca(800.00);
		c1.setNomeDoCliente("Ramon");
		c1.setNumero(123);
		
		ContaPoupanca c2 = new ContaPoupanca(900.00);
		c2.setNomeDoCliente("Alinne");
		c2.setNumero(456);
		
		ContaPoupanca c3 = new ContaPoupanca(700.00);
		c3.setNomeDoCliente("Teste");
		c3.setNumero(789);
		
		List<ContaPoupanca> listaContas = new LinkedList<ContaPoupanca>();
		listaContas.add(c1);
		listaContas.add(c2);
		listaContas.add(c3);
		
		Collections.sort(listaContas);
		
		for (ContaPoupanca contaPoupanca : listaContas) {
			System.out.println("Owner: "+ contaPoupanca.getNomeDoCliente()+ " - n: "+contaPoupanca.getNumero());
		}
		
	}
}
