package br.com.caelum.state;

public class TesteEstadosOrcamento {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(500);
		
		//Em aprovação
		orcamento.aplicaDescontoExtra();
		System.out.println(orcamento.getValor());
		
		//Aprovado
		orcamento.aprova();
		orcamento.aplicaDescontoExtra();
		System.out.println(orcamento.getValor());
		
		//Finalizado
		orcamento.finaliza();
		orcamento.aplicaDescontoExtra();
		System.out.println(orcamento.getValor());
	}
}
