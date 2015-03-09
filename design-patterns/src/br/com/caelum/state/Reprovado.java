package br.com.caelum.state;

public class Reprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos reprovados não recebem descontos");
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos reprovados não podem ser aprovados");
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já foi reprovado");
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}

}
