package br.com.caelum.modelo;

public class TestaComparacaoDeContas {
	public static void main(String[] args) {
		Conta c1 = new Conta(200);
		Conta c2 = new Conta(300);
		
		c1.setNumero(123);
		c2.setNumero(123);
		
		if(c1 == c2) {
			System.out.println("S�o iguais utilizando ==");
		} else {
			System.out.println("N�o s�o iguais utilizando o ==");
		}
		
		if(c1.equals(c2)) {
			System.out.println("S�o iguais utilizando o m�todo equals()");
		} else {
			System.out.println("N�o s�o iguais utilizando o m�todo equals()");
		}
	}
}
