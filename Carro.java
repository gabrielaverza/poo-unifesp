
public class Carro {
	/* criando atributos */
	String marca;
	String modelo;
	String placa;
	int velocidade;
	boolean estado;
	
	/* criando metodos */
	public void acelerar(String modelo, int velocidade) {
		int aceleracao = 10 + velocidade;
		System.out.println("O " + modelo + " esta acelerando para " + aceleracao + " km");
		estado = ligar();
	}
	
	public void frear(String modelo) {
		velocidade = 0;
		System.out.println("O " + modelo + " esta freando");
		estado = desligar();
	}
	
	public boolean ligar() {
		return true;
	}
	
	public boolean desligar() {
		return false;
	}
	
	public void mostraEstado(String modelo, boolean estado) {
		if(estado == false) {
			System.out.println("O " + modelo + " esta desligado");
		} else {
			System.out.println("O " + modelo + " esta ligado");
		}
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
		c1.frear(c1.modelo);
		c1.mostraEstado(c1.modelo, c1.estado);
		c2.acelerar(c2.modelo, c2.velocidade);
		c2.mostraEstado(c2.modelo, c2.estado);
	}

}
