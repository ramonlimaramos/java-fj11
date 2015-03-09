package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaPoupanca;
import br.com.empresa.banco.exception.ValorInvalidoException;


public class TestaDeposita {
	public static void main(String[] args) {
		Conta cp = new ContaPoupanca();
		
		System.out.println(cp + "\n");
		
		try {
			cp.deposita(-100);
		} catch(ValorInvalidoException ie) {
			System.out.println(ie.getMessage());
		}
		cp.imprimirSaldo();
	}
}
