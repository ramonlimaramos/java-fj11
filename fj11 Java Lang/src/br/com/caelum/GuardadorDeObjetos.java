package br.com.caelum;

public class GuardadorDeObjetos {
	
	private Object[] objs;
	private int posicaoLivre;
	
	public GuardadorDeObjetos() {
		// TODO Auto-generated constructor stub
		this.objs = new Object[100];
		this.posicaoLivre = 0;
	}
	
	public void adiciona(Object obj) {
		this.objs[this.posicaoLivre] = obj;
		this.posicaoLivre++;
	}
	
	public Object recupera(int posicao) {
		return this.objs[posicao];
	}
}
