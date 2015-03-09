package exercicio2;

public class ContaPoupanca extends Conta {
	
	@Override
	public void deposita(double valor) throws ValorInvalidoException {
		super.deposita(valor);
		this.saldo -= 0.3;  
	}
}
