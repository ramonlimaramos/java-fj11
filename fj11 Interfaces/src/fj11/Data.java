package fj11;

public class Data {
	int dia;
	int mes;
	int ano;

	// pode realizar valida��es
	public void preencherData(int d, int m, int a) {

		if(m == 2 && d > 28) {
			System.out.println("Data inv�lida");
		} else {
			this.dia = d;
			this.mes = m;
			this.ano = a;
		}
	}

	public String getDataFormatada() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}
