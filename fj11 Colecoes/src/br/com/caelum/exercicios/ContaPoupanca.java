package br.com.caelum.exercicios;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {

	public ContaPoupanca(double saldo) {
		super(saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(ContaPoupanca o) {
		return this.getNomeDoCliente().compareTo(o.getNomeDoCliente());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Conta numero: "+ this.getNumero() + " - com saldo: "+ this.getSaldo();
	}
	
}
