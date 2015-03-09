package br.com.caelum.strategy;

public class RealizadorDeInvestimento {
	public void realizaInvestimento(Conta conta, Investimento investimentoQualquer) {
		double investimento = investimentoQualquer.calcula(conta);
		System.out.println(investimento);
		
		// Só 75% o investidor recebe de qualquer tipo de investimento.
		conta.deposita(investimento * 0.75);
		System.out.println("Novo saldo: "+ conta.getSaldo());
	}
}
