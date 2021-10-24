
public class Carro {
	/* criando atributos */
	String marca;
	String modelo;
	String placa;
	int velocidade;
	
	/* criando metodos */
	public void acelerar (String modelo, int velocidade) {
		int aceleracao = 10 + velocidade;
		System.out.println("Acelerando " + modelo + " para " + aceleracao + " km");
	}
	
	public void frear (String modelo) {
		System.out.println("Freando o " + modelo);
	}

	public static void main(String[] args) {
		/* criando objetos */
		Carro c1 = new Carro();
		Carro c2 = new Carro();
		
		/* acessando e alterando atributos */
		c1.marca = "Toyota";
		c1.modelo = "Etios";
		c1.placa = "ABC-1234";
		c1.velocidade = 50;
		
		c2.marca = "Toyota";
		c2.modelo = "Yaris";
		c2.placa = "DEF-5678";
		c2.velocidade = 70;
		
		/* chamando os metodos */
		c1.acelerar(c1.modelo, c1.velocidade);
		c1.frear(c1.modelo);
		c2.acelerar(c2.modelo, c2.velocidade);
		c2.frear(c2.modelo);
	}

}
