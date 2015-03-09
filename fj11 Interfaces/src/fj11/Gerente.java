package fj11;

public class Gerente extends Funcionario implements Autenticavel {

	@Override
	public double getGanhoAnual() {
		// TODO Auto-generated method stub
		return this.salario * 0.15;
	}

	@Override
	public double getBonus() {
		// TODO Auto-generated method stub
		return this.salario * 0.3;
	}

	@Override
	public boolean autentica(int senha) {
		// TODO método de logar
		return false;
	}
	
}
