package fj11;

public class Diretor extends Funcionario implements Autenticavel {

	@Override
	public double getGanhoAnual() {
		// TODO Auto-generated method stub
		return this.salario * 0.20;
	}

	@Override
	public double getBonus() {
		// TODO Auto-generated method stub
		return this.salario * 0.8;
	}

	@Override
	public boolean autentica(int senha) {
		// TODO implementaremos a regra de login do Diretor
		return false;
	}

}
