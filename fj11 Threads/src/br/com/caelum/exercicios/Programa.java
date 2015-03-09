package br.com.caelum.exercicios;

public class Programa implements Runnable {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000; i++) {
			System.out.println("Programa "+id+" valor "+ i);
		}
	}
	
	
}
