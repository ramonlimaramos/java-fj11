package exercicio2;

public class TestaDeposita {
	public static void main(String[] args) {
		Conta cp = new ContaPoupanca();
		try {
			cp.deposita(-100);
		} catch(ValorInvalidoException ie) {
			System.out.println(ie.getMessage());
		}
		cp.imprimirSaldo();
	}
}
