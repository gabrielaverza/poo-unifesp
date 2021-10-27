public class Carro {
	String modelo;
	String placa;
	int velocidade;
	boolean estado;
	Contador vezesAcelerou = new Contador();
	Contador vezesFreou = new Contador();
	Contador vezesLigou = new Contador();
	
	//construtor
	public Carro (String modelo, String placa) {
		setModelo(modelo);
		setPlaca(placa);
		setVelocidade(0);
		setEstado(false);
	}
	
	//metodos get e set
	public void setModelo (String modelo) {
		this.modelo = modelo;
	}
	
	public void setPlaca (String placa) {
		this.placa = placa;
	}
	
	public void setVelocidade (int velocidade) {
		this.velocidade = velocidade;
	}
	
	public void setEstado (boolean estado) {
		this.estado = estado;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	//metodos de acao
	public void ligar() {
		setEstado(true);
		vezesLigou.incrementaDefault();
		//System.out.println("O carro ligou");
	}
	
	public void acelerar() {
		setVelocidade(getVelocidade() + 1);
		vezesAcelerou.incrementaDefault();
		//System.out.println("O carro acelerou");
	}
	
	public void frear() {
		setVelocidade(getVelocidade() - 1);
		if(getVelocidade() < 0) {
			setVelocidade(0);
		}
		vezesFreou.incrementaDefault();
		//System.out.println("O carro freou");
	}
	
	public void mostraContadores () {
		System.out.println("Ligou: ");
		vezesLigou.visualiza();
		System.out.println("Acelerou: ");
		vezesAcelerou.visualiza();
		System.out.println("Freou: ");
		vezesFreou.visualiza();
	}
	
	public static void main (String[] args) {
		Carro carro = new Carro("Etios", "ABC-1234");
		
		carro.ligar();
		carro.acelerar();
		carro.acelerar();
		carro.frear();
		carro.acelerar();
		carro.frear();
		
		carro.mostraContadores();
	}
}

