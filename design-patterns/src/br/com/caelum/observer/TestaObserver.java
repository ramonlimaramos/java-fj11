package br.com.caelum.observer;

import java.util.Calendar;

import br.com.caelum.builder.ItemDaNota;
import br.com.caelum.builder.NotaFiscal;

public class TestaObserver {

	public static void main(String[] args) {

		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.adicionaAcao(new EnviarNotaPorEmail())
				.adicionaAcao(new NotaFiscalDao())
				.adicionaAcao(new Impressora())
				.adicionaAcao(new Multiplicador(5))
				.adicionaAcao(new Multiplicador(3))
				.adicionaAcao(new Multiplicador(2))
				.adicionaAcao(new Multiplicador(1));

		builder.comRazaoSocial("Caelum").comCNPJ("123")
				.comItem(new ItemDaNota("recoreco", 100))
				.naData(Calendar.getInstance())
				.comObservacoes("aqui observacoes");

		NotaFiscal nf = builder.constroi();

		System.out.println("\nImpostos da Nota " + nf.getImpostos());
		System.out.println("Valor Bruto da Nota " + nf.getValorBruto());
	}
}
