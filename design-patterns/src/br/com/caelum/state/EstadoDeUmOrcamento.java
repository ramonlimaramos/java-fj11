package br.com.caelum.state;

public interface EstadoDeUmOrcamento {
	void aplicaDescontoExtra(Orcamento orcamento);
	
	void aprovar(Orcamento orcamento);
	void reprovar(Orcamento orcamento);
	void finalizar(Orcamento orcamento);
}
