package fj11;

public class Empresa {
	private String nomeFantasia;
	private String razaoSocial;
	private String cnpj;
	private Funcionario[] funcionarios;
	private int posicaoVazia = 0;

	public Empresa(int qtdFunctionario) {
		this.funcionarios = new Funcionario[qtdFunctionario];
	}

	//Getters and Setters
	public void setNomeFantasia(String nf) {
		this.nomeFantasia = nf;
	}

	public void setRazaoSocial(String rs) {
		this.razaoSocial = rs;
	}

	public void setCnpj(String c) {
		this.cnpj = c;
	}

	public void setFuncionario(Funcionario f) {
        this.funcionarios[this.posicaoVazia] = f;
        this.posicaoVazia++;
    }

    public Funcionario getFuncionario(int posicao) {
    	return this.funcionarios[posicao];
    }

    //Regra de Negocio
	public void getTodasAsInformacoes() {
		for (int j=0; j < this.funcionarios.length; j++) {
			Funcionario funcionario = this.funcionarios[j];
			
			if(this.funcionarios[j] == null)  continue;
			
			funcionario.mostra();
			System.out.println("\n\n");
		}
	}

	public boolean contem(Funcionario f) {
		for (int i=0; i < this.posicaoVazia; i++) {
			if(f == this.funcionarios[i])
				return true;
		}

		return false;
	}
}
