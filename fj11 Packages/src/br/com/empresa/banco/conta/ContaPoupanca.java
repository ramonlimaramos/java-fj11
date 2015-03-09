package br.com.empresa.banco.conta;

import br.com.empresa.banco.exception.ValorInvalidoException;

public class ContaPoupanca extends Conta {
	
	@Override
	public void deposita(double valor) throws ValorInvalidoException {
		super.deposita(valor);
		this.saldo -= 0.3;  
	}
}
