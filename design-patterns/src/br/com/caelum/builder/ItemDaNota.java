package br.com.caelum.builder;

public class ItemDaNota {
	private String descricao;
	private double valor;

	public ItemDaNota(String descricao, double valor) {
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}
	
}
