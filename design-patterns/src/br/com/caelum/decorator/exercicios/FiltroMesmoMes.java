package br.com.caelum.decorator.exercicios;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.strategy.Conta;

public class FiltroMesmoMes extends Filtro {
	
	public FiltroMesmoMes(Filtro filtro) {
		super(filtro);
	}
	
	public FiltroMesmoMes() {
		super();
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtrada = new ArrayList<>();
		for (Conta conta : contas) {
			if(conta.getDataAbertura().get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH) &&
			   conta.getDataAbertura().get(Calendar.YEAR) == Calendar.getInstance().get(Calendar.YEAR)) {
				filtrada.add(conta);
			}
		}
		
		filtrada.addAll(proximo(contas));
		return filtrada;
	}

}
