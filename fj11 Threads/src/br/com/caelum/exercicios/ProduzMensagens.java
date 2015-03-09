package br.com.caelum.exercicios;

import java.util.Collection;

public class ProduzMensagens implements Runnable {
	private int comeco;
	private int fim;
	private Collection<String> mensagens;
	
	public ProduzMensagens(int comeco, int fim, Collection<String> mensagens) {
		// TODO Auto-generated constructor stub
		this.comeco = comeco;
		this.fim = fim;
		this.mensagens = mensagens;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; comeco < fim; i++) {
			synchronized (mensagens) {
				mensagens.add("Mensagem "+ i);	
			}
			
		}
	}
	
}
