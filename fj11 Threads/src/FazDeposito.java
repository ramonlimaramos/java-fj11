

public class FazDeposito implements Runnable {
	private Conta conta;
	
	public FazDeposito(Conta c) {
		// TODO Auto-generated constructor stub
		this.conta = c;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		conta.deposita(100.00);
	}

}
