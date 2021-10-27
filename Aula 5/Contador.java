public class Contador {
	int cont;
	
	public Contador () {
		setCont(0);
	}
	
	public Contador (int cont) {
		setCont(cont);
	}
	
	public void setCont (int cont) {
		this.cont = cont;
	}
	
	//pode mostrar o valor atual do contador
	public int getCont () {
		return cont;
	}
	
	//incrementa o contador em uma unidade
	public int incrementaDefault () {
		return cont++;
	}
	
	//incremeta o contador com um valor dado como parametro
	public int incrementa (int valor) {
		return cont += valor;
	}
	
	//decrementa o contador em uma unidade
	public int decrementaDefault () {
		return cont--;
	}
	
	//decremeta o contador com um valor dado como parametro
	public int decrementa (int valor) {
		return cont-=valor;
	}
	
	public void visualiza () {
		System.out.println("Contador = " + getCont());
	}
	
	public static void main (String[] args) {
		Contador c1 = new Contador();
		Contador c2 = new Contador(5);
		
		System.out.println("Valor inicial default: ");
		c1.visualiza();
		c1.incrementaDefault();
		System.out.println("Valor após incrementar por default: ");
		c1.visualiza();
		c1.decrementaDefault();
		System.out.println("Valor após decrementar por default: ");
		c1.visualiza();
		
		System.out.println("\n-------------------\n");
		
		System.out.println("Valor inicial: ");
		c2.visualiza();
		c2.incrementa(2);
		System.out.println("Valor após incrementar: ");
		c2.visualiza();
		c2.decrementa(4);
		System.out.println("Valor após decrementar: ");
		c2.visualiza();
	}
}