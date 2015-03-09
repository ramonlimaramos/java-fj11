package br.com.caelum.modelo;

public class TestaComparacaoDeContas {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		
		c1.setNumero(123);
		c2.setNumero(123);
		
		if(c1 == c2) {
			System.out.println("São iguais utilizando ==");
		} else {
			System.out.println("Não são iguais utilizando o ==");
		}
		
		if(c1.equals(c2)) {
			System.out.println("São iguais utilizando o método equals()");
		} else {
			System.out.println("Não são iguais utilizando o método equals()");
		}
	}
}
