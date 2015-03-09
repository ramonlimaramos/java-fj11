package br.com.caelum.builder;

import java.util.Calendar;
import java.util.List;

public class NotaFiscal {
	private String razaoSocial;
	private String CNPJ;
	private double valorBruto;
	private double impostos;
	private Calendar dataDeEmissao;
	private String observacoes;
	private List<ItemDaNota> items;
	
	public NotaFiscal(String razaoSocial, String cNPJ, double valorBruto,
			double impostos, Calendar dataDeEmissao, String observacoes,
			List<ItemDaNota> items) {
		this.razaoSocial = razaoSocial;
		CNPJ = cNPJ;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.dataDeEmissao = dataDeEmissao;
		this.observacoes = observacoes;
		this.items = items;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public double getValorBruto() {
		return valorBruto;
	}

	public double getImpostos() {
		return impostos;
	}

	public Calendar getDataDeEmissao() {
		return dataDeEmissao;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public List<ItemDaNota> getItems() {
		return items;
	}
	
}
