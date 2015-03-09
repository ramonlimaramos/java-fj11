package br.com.caelum.exercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Banco extends LinkedList<Conta> {
	private List<Conta> contas = new ArrayList<Conta>();
	private Map<String, Conta> contaPorNome = new HashMap<String, Conta>();
	
	public void adiciona(Conta conta) {
		this.contas.add(conta);
		this.contaPorNome.put(conta.getNomeDoCliente(), conta);
	}
	
	public Conta pega(int x) {
		return this.contas.get(x);
	}
	
	public int pegaQuantidadeDeContas() {
		return this.contas.size();
	}
	
	public Conta buscaPorNome(String nome) {
		return this.contaPorNome.get(nome);
	}
}
