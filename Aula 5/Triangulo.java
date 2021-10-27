public class Triangulo {
	int base, altura;
	
	/* construtor que define valores
	default para os atributos */
	public Triangulo () {
		this.base = 5;
		this.altura = 4;
	}
	
	/* construtor que define os atributos
	de acordo com os parametros que recebe */
	public Triangulo (int base, int altura) {
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
	
	public int calculaArea (int base, int altura) {
		return (base * altura) / 2;
	}
	
	public void mostraAtributos () {
		System.out.println("Base do triangulo: " + getBase() + "\nAltura do triangulo: " + getAltura());
	}
	
	public static void main (String[] args) {
		Triangulo tri_1 = new Triangulo();
		Triangulo tri_2 = new Triangulo(6, 8);
		
		System.out.println("--------- TRIANGULO 1 ---------");
		System.out.println("Area do triangulo: " + tri_1.calculaArea(tri_1.getBase(), tri_1.getAltura()));
		tri_1.mostraAtributos();
		
		System.out.println("\n--------- TRIANGULO 2 ---------");
		System.out.println("Area do triangulo: " + tri_2.calculaArea(tri_2.getBase(), tri_2.getAltura()));
		tri_2.mostraAtributos();
	}
}
