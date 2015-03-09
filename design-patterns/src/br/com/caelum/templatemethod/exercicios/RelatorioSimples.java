package br.com.caelum.templatemethod.exercicios;

import java.util.List;

import br.com.caelum.chainresponsability.exercicios.Conta;

public class RelatorioSimples extends Relatorio {

	@Override
	protected void cabecalho() {
		System.out.println("Banco XYZ");
		System.out.println("\n");
	}

	@Override
	protected void rodape() {
		System.out.println("\n");
		System.out.println("(11) 1234-5678");
	}

	@Override
	protected void corpo(List<Conta> contas) {
		for (Conta conta : contas) {
			System.out.println(conta.getTitular() + " - " + conta.getSaldo());
		}
	}

}
