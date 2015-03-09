package br.com.caelum.builder;

import java.util.Calendar;

public class TesteDeBuilder {
	
	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.comRazaoSocial("Caelum Ensino e Inovação")
				.comCNPJ("111.222.333/562")
				.comItem(new ItemDaNota("item a", 200))
				.comItem(new ItemDaNota("item b", 300))
				.comItem(new ItemDaNota("item c", 400))
				.comItem(new ItemDaNota("item d", 500))
				.naData(Calendar.getInstance())
				.comObservacoes("Observações da Nota Fiscal");
		
		NotaFiscal nf = builder.constroi();
		
		System.out.println(nf.getValorBruto());
		
		ItemDaNotaBuilder ibuilder = new ItemDaNotaBuilder();
		ibuilder.comDescricao("item a")
				.comValor(200);
		
		ItemDaNota idn = ibuilder.constroi();
		System.out.println(idn.getValor());
	}
}
