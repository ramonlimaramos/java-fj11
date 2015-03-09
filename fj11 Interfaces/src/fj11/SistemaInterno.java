package fj11;

public class SistemaInterno {
	
	public void autentica(Autenticavel a) {
		int senha = 123; // Depois pegaremos do teclado;
		
		if(a.autentica(senha) == true) {
			System.out.println("Usuário logado no sistema");
		} else {
			System.out.println("Usuário não encontrado");
		}
	}

}
