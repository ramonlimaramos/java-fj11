package exercicio2;

public class ContaCorrente extends Conta implements Tributavel {

	@Override
	public double calculaTributos() {
		// TODO Auto-generated method stub
		return this.getSaldo() * 0.01;
	}

}
