package br.com.caelum.state;

public class Finalizado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos finalizados n�o recebem descontos");
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos que j� foram finalizados, n�o podem ser aprovados");
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Or�amento que j� foram finalizados n�o podem serem reprovados");
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� finalizado");
	}

}
