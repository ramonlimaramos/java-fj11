package br.com.caelum.state;

public class Reprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos reprovados n�o recebem descontos");
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos reprovados n�o podem ser aprovados");
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� foi reprovado");
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}

}
