
public class Teste {
	
	public static void main(String[] args) {
		AreaCalculavel a = new Retangulo(10, 20);
		System.out.println(a.calculaArea());
		
		AreaCalculavel c = new Circulo(1.25);
		System.out.println(c.calculaArea());
	}

}
