package br.com.caelum.state;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.caelum.chainresponsability.Item;

public class Orcamento {
	protected double valor;
	private final List<Item> itens;
	
	protected EstadoDeUmOrcamento estadoAtual;

	public Orcamento(double valor) {
		super();
		this.valor = valor;
		itens = new ArrayList<>();
		estadoAtual = new EmAprovacao();
	}

	public double getValor() {
		return valor;
	}
	
	public void adiciona(Item item) {
		itens.add(item);
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}
	
	public void aprova() {
		estadoAtual.aprovar(this);
	}
	
	public void reprova() {
		estadoAtual.reprovar(this);
	}
	
	public void finaliza(){
		estadoAtual.finalizar(this);
	}
	
}
