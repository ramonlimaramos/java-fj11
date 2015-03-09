package br.com.empresa.banco;

import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.SeguroDeVida;
import br.com.empresa.banco.exception.ValorInvalidoException;
import br.com.empresa.banco.sistema.GerenciadorDeImpostosDeRenda;


public class TestaTributavel {

	public static void main(String[] args) {
		
		GerenciadorDeImpostosDeRenda gr = new GerenciadorDeImpostosDeRenda();
		
		SeguroDeVida sv = new SeguroDeVida();
		gr.adiciona(sv);
		
		ContaCorrente cc = new ContaCorrente();
		
		try {
			cc.deposita(100);
		} catch (ValorInvalidoException ve) {
			System.out.println(ve.getMessage());
		}
		
		gr.adiciona(cc);
		
		System.out.println(gr.getTotal());
		
		cc.imprimirSaldo();

	}

}
