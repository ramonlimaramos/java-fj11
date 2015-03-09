package br.com.caelum.state;

public class Finalizado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos finalizados não recebem descontos");
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos que já foram finalizados, não podem ser aprovados");
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Orçamento que já foram finalizados não podem serem reprovados");
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já finalizado");
	}

}
