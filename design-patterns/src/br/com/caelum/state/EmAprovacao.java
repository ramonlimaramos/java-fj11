package br.com.caelum.state;

public class EmAprovacao implements EstadoDeUmOrcamento {
	private boolean descontAplicado = false;
	
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(!descontAplicado) {
			orcamento.valor -= orcamento.valor * 0.05;
			descontAplicado = true;
		} else {
			throw new RuntimeException("Desconto já aplicado!");
		}
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos deve ser aprovado, depois finalizado");
	}
}
