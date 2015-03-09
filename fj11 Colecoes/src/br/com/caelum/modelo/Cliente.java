package br.com.caelum.modelo;

public class Cliente {
	private String nome;
	private int rg;
	
	//Getters and Setters
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "O nome do cliente é " + getNome();
	}
	
}
