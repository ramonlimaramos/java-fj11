package br.com.caelum.templatemethod.exercicios;

import java.util.Calendar;
import java.util.List;

import br.com.caelum.chainresponsability.exercicios.Conta;

public class RelatorioComplexo extends Relatorio {

	@Override
	protected void cabecalho() {
		System.out.println("Banco XYZ");
		System.out.println("Avenida Paulista, 1234");
		System.out.println("(11) 1234-5678");
		System.out.println("\n");
	}

	@Override
	protected void rodape() {
		System.out.println("\n");
		System.out.println("banco@xyz.com.br");
		System.out.println(Calendar.getInstance().getTime());
	}

	@Override
	protected void corpo(List<Conta> contas) {
		for (Conta conta : contas) {
			System.out.println(conta.getTitular() + " - 123456 - " + conta.getSaldo() + " - 789456.");
		}
		
	}

}