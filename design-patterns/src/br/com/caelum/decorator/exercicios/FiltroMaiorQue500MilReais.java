package br.com.caelum.decorator.exercicios;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.strategy.Conta;

public class FiltroMaiorQue500MilReais extends Filtro {
	
	public FiltroMaiorQue500MilReais(Filtro filtro) {
		super(filtro);
	}
	
	public FiltroMaiorQue500MilReais() {
		super();
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtrada = new ArrayList<Conta>();
		
		for (Conta conta : contas) {
			if(conta.getSaldo() > 500000) {
				filtrada.add(conta);
			}
		}
		
		filtrada.addAll(proximo(contas));
		return filtrada;
	}

}
