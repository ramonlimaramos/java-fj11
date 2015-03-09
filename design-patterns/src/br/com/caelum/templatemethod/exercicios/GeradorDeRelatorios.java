package br.com.caelum.templatemethod.exercicios;

import java.util.List;

import br.com.caelum.chainresponsability.exercicios.Conta;

public class GeradorDeRelatorios {
	public void gerar(List<Conta> contas, Relatorio relatorio) {
		relatorio.imprime(contas);
	}
}
