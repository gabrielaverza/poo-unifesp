public class Retangulo {
	int base, altura;
	
	//construtor
	public Retangulo (int base, int altura) {
		setBase(base);
		setAltura(altura);
	}
	
	public void setBase (int base) {
		this.base = base;
	}
	
	public void setAltura (int altura) {
		this.altura = altura;
	}
	
	public int getBase () {
		return base;
	}
	
	public int getAltura () {
		return altura;
	}
	
	
	public int calculaArea () {
		return getBase() * getAltura();
	}
	
	public int calculaPerimetro () {
		return (2 * getBase()) + (2 * getAltura());
	}
	
	public int relacao () {
		return getBase() / getAltura();
	}
	
	public void ehQuadrado () {
		if(getBase() == getAltura()) {
			System.out.println("O retangulo eh um quadrado");
		} else {
			System.out.println("O retangulo nao eh um quadrado");
		}
	}
	
	public void mostraDimensoes () {
		System.out.println("Base do retangulo: " + getBase() + "\nAltura do retangulo: " + getAltura());
	}
	
	public static void main (String[] args) {
		Retangulo ret_1 = new Retangulo(8, 4);
		Retangulo ret_2 = new Retangulo(4, 4);
		
		System.out.println("---------RETANGULO 1 ---------");
		ret_1.mostraDimensoes();
		System.out.println("Relacao entre a base e a altura: " + ret_1.relacao());
		System.out.println("Area do retangulo: " + ret_1.calculaArea() + "\nPerimetro do retangulo: " + ret_1.calculaPerimetro());
		ret_1.ehQuadrado();
		
		System.out.println("\n---------RETANGULO 2 ---------");
		ret_2.mostraDimensoes();
		System.out.println("Relacao entre a base e a altura: " + ret_2.relacao());
		System.out.println("Area do retangulo: " + ret_2.calculaArea() + "\nPerimetro do retangulo: " + ret_2.calculaPerimetro());
		ret_2.ehQuadrado();
	}
}