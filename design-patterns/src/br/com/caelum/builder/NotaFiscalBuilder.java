package br.com.caelum.builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String CNPJ;
	private List<ItemDaNota> todosItens = new ArrayList<>();
	private double impostos;
	private double valorBruto;
	private Calendar dataEmissao;
	private String observacoes;

	public NotaFiscalBuilder comRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder comCNPJ(String CNPJ) {
		this.CNPJ = CNPJ;
		return this;
	}

	public NotaFiscalBuilder comItem(ItemDaNota itemDaNota) {
		this.todosItens.add(itemDaNota);
		this.impostos += itemDaNota.getValor() * 0.05;
		this.valorBruto += itemDaNota.getValor();
		return this;
	}

	public NotaFiscalBuilder naData(Calendar dataEmissao) {
		this.dataEmissao = dataEmissao;
		return this;
	}

	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}
	
	public NotaFiscal constroi() {
		return new NotaFiscal(razaoSocial, CNPJ, valorBruto, impostos, dataEmissao, observacoes, todosItens);
	}
	
}
