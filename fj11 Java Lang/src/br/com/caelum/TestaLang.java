package br.com.caelum;

import br.com.caelum.modelo.Cliente;
import br.com.caelum.modelo.Conta;

public class TestaLang {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		
		c1.deposita(500.00);
		c2.deposita(600.00);
		
		Cliente cl1 = new Cliente();
		
		cl1.setNome("Joao RecoReco");
		
		GuardadorDeObjetos armario = new GuardadorDeObjetos();
		
		armario.adiciona(c1);
		armario.adiciona(c2);
		armario.adiciona(cl1);
		
		Conta c1NoArmario = (Conta) armario.recupera(0);
		Cliente cl1NoArmario = (Cliente) armario.recupera(2);
		
		System.out.println(c1NoArmario);
		System.out.println(cl1NoArmario+"\n");
		
		if(c1.equals(c2)) {
			System.out.println("São objetos do tipo Conta");
		}
		
		if(!c1.equals(cl1)) {
			System.out.println("Não são objetos do tipo Conta");
		}
		
		String quantosCharacters = "Paralepipeto";
		System.out.println("String: "+ quantosCharacters+ " Contem: "+ quantosCharacters.length()+" Caracteres");
		
	}
}
