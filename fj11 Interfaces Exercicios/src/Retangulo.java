
public class Retangulo implements AreaCalculavel {
	private int largura;
	private int altura;
	
	public Retangulo(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return this.largura * this.altura;
	}

}
