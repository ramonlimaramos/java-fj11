package br.com.caelum.state;

public class Aprovado implements EstadoDeUmOrcamento {
	private boolean descontoAplicado = false;
	
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(!descontoAplicado){
			orcamento.valor -= orcamento.valor * 0.05;
			descontoAplicado = true;
		} else {
			throw new RuntimeException("Desconto j� aplicado");
		}
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� esta aprovado");
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos aprovados n�o podem ser reprovados!");
		
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}
}
