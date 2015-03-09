
public class TestaExcecoes {

	public static void main(String[] args) {
		Conta joao = new Conta();
		joao.setAgencia(123);
		joao.setNumero(456);
		joao.setNumeroDoBanco(789);
		
		joao.deposita(50);
		
//		try {
//			joao.saca(100);
//		} catch(SaldoInsuficienteException se) {
//			System.out.println(se.getMessage());
//		} catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
		try {
			joao.deposita(-1);
		} catch(IllegalArgumentException ie) {
			System.out.println(ie.getMessage());
		}
		
		System.out.println(joao.getSaldo());
	}

}
