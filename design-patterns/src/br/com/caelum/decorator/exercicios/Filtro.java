package br.com.caelum.decorator.exercicios;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.strategy.Conta;

public abstract class Filtro {
	
	protected Filtro outroFiltro;
	
	public Filtro() {}
	
	public Filtro(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
	}
	
	public abstract List<Conta> filtra(List<Conta> contas);
	
	protected List<Conta> proximo(List<Conta> filtrada) {
		if(outroFiltro != null) return outroFiltro.filtra(filtrada);
		else return new ArrayList<Conta>();
	}
}
