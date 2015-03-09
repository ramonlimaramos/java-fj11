package br.com.caelum.templatemethod.exercicios;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.chainresponsability.exercicios.Conta;

public class TesteRelatorio {
	public static void main(String[] args) {
		Conta c1 = new Conta("Ramon", 10000.00);
		Conta c2 = new Conta("Alinne", 10000.00);
		Conta c3 = new Conta("Fulano", 100.00);
		Conta c4 = new Conta("Cliclano", 500.00);
		Conta c5 = new Conta("Beltrano", 600.00);
		
		List<Conta> contas = new ArrayList<>();
		
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		contas.add(c4);
		contas.add(c5);
		
		Relatorio relatorio = new RelatorioComplexo();
		
		GeradorDeRelatorios gdr = new GeradorDeRelatorios();
		gdr.gerar(contas, relatorio);
	}
}
