package fj11;

public class DBA extends Funcionario {

	@Override
	public double getGanhoAnual() {
		return this.salario * 0.12;
	}

	@Override
	public double getBonus() {
		return this.salario * 0.3;
	}
	
}
