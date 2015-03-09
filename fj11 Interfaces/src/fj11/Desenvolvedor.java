package fj11;

public class Desenvolvedor extends Funcionario {
	@Override
	public double getBonus() {
		return this.salario * 0.3;
	}

	@Override
	public double getGanhoAnual() {
		return this.salario * 0.8;
	}
}
