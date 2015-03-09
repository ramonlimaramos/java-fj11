package exercicio2;

public class TestaTributavel {

	public static void main(String[] args) {
		
		GerenciadorDeImpostosDeRenda gr = new GerenciadorDeImpostosDeRenda();
		
		SeguroDeVida sv = new SeguroDeVida();
		gr.adiciona(sv);
		
		ContaCorrente cc = new ContaCorrente();
		try {
			cc.deposita(100);
		} catch (ValorInvalidoException ve) {
			System.out.println(ve.getMessage());
		}
		gr.adiciona(cc);
		
		System.out.println(gr.getTotal());
		
		cc.imprimirSaldo();

	}

}
