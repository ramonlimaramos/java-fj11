package br.com.caelum.state.exercicios;

public class TesteEstadosConta {
	public static void main(String[] args) {
		Conta c1 = new Conta(500);
		System.out.println(c1.getSaldo());
		c1.deposita(100);
		System.out.println(c1.getSaldo());
		c1.saca(200);
		System.out.println(c1.getSaldo());
		c1.saca(500);
		System.out.println(c1.getSaldo());		
		c1.deposita(200);
		System.out.println(c1.getSaldo());
	}
}
