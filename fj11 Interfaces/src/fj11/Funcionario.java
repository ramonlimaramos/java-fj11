package fj11;

abstract class Funcionario {
	private static int numeroIncremental = 0;
	private int id;
	private String nome;
	protected double salario;
	private Data dataEntradaNoBanco = new Data();
	private String departamento;
	private String rg;
	private int senha;

	public Funcionario(String nome) {
		this.nome = nome;
	}

	public Funcionario() {
		this.id = this.numeroIncremental;
		this.numeroIncremental++;
	}

	//Getters and Setters
	public int getId() {
		return this.id;
	}

	public void setNome(String n) {
		this.nome = n;
	}

	public String getNome() {
		return this.nome;
	}

	public void setDepartamento(String d) {
		this.departamento = d;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	public void setRg(String r) {
		this.rg = r;
	}

	public String getRg() {
		return this.rg;
	}

	public Data getDataEntradaNoBanco() {
		return this.dataEntradaNoBanco;
	}

	// Regra de Negócio class Funcionario
	public void setRecebeAumento(double valor) {
		if(valor != 0) {
			this.salario += valor;
		}
	}

	public abstract double getGanhoAnual();
	
	public abstract double getBonus();

	public void mostra() {
		System.out.println("Identificador: "+ this.id);
		System.out.println("Nome: "+ this.nome);
		System.out.println("Salario: "+ this.salario);
		System.out.println("Data de Entrada no Banco: "+ this.dataEntradaNoBanco.getDataFormatada());
		System.out.println("Departamento: "+ this.departamento);
		System.out.println("RG: "+ this.rg);
		System.out.println("Ganho Anual: "+ this.getGanhoAnual());
		System.out.println("\n\n");
	}

}
