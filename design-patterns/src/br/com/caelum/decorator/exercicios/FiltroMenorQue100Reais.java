package br.com.caelum.decorator.exercicios;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.strategy.Conta;

public class FiltroMenorQue100Reais extends Filtro {
	
	public FiltroMenorQue100Reais(Filtro filtro) {
		super(filtro);
	}
	
	public FiltroMenorQue100Reais() {
		super();
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtrada = new ArrayList<>();
		
		for (Conta conta : contas) {
			if(conta.getSaldo() < 100) {
				filtrada.add(conta);
			}
		}
		
		filtrada.addAll(proximo(contas));
		return filtrada;
	}

}
