package br.com.caelum.state;

public class Aprovado implements EstadoDeUmOrcamento {
	private boolean descontoAplicado = false;
	
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(!descontoAplicado){
			orcamento.valor -= orcamento.valor * 0.05;
			descontoAplicado = true;
		} else {
			throw new RuntimeException("Desconto já aplicado");
		}
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já esta aprovado");
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos aprovados não podem ser reprovados!");
		
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}
}
