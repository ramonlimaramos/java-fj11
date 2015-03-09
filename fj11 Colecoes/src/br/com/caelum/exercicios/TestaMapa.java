package br.com.caelum.exercicios;

import java.util.HashMap;
import java.util.Map;

public class TestaMapa {
	public static void main(String[] args) {
		Conta c1 = new ContaPoupanca(500.00);
		c1.setNomeDoCliente("Jão");
		c1.setNumero(12345688);
		
		Conta c2 = new ContaPoupanca(550.00);
		c2.setNomeDoCliente("Maria");
		c2.setNumero(98745123);
		
		Map<String, Conta> mapa = new HashMap<String, Conta>();
		mapa.put("diretor", c1);
		mapa.put("gerente", c2);
		
		Conta contaDoDiretor = mapa.get("diretor");
		System.out.println(contaDoDiretor.getSaldo());
		
	}
}
