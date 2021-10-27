public class Quadrado {
	int lado;
	
	public Quadrado (int lado) {
		setLado(lado);
	}
	
	public void setLado (int lado) {
		this.lado = lado;
	}
	
	public int getLado () {
		return lado;
	}
	
	public void aumentaQuadrado () {
		setLado(getLado() * (1 + (int) (Math.random() * 10)));
	}
	
	public int calculaArea (int lado) {
		return lado * lado;
	}
	
	public static void main (String[] args) {
		Quadrado q1 = new Quadrado(1);
		Quadrado q2 = new Quadrado(2);
		Quadrado q3 = new Quadrado(3);
		Quadrado q4 = new Quadrado(4);
		Quadrado q5 = new Quadrado(5);
		Quadrado q6 = new Quadrado(6);
		Quadrado q7 = new Quadrado(7);
		Quadrado q8 = new Quadrado(8);
		Quadrado q9 = new Quadrado(9);
		Quadrado q10 = new Quadrado(10);
		
		/* definindo lados aleatorios */
		q1.aumentaQuadrado();
		System.out.println("Lado 1: " + q1.getLado());
		int area_1 = q1.calculaArea(q1.getLado());
		System.out.println("Area 1: " + area_1);
		
		q2.aumentaQuadrado();
		System.out.println("\nLado 2: " + q2.getLado());
		int area_2 = q2.calculaArea(q2.getLado());
		System.out.println("Area 2: " + area_2);
		
		q3.aumentaQuadrado();
		System.out.println("\nLado 3: " + q3.getLado());
		int area_3 = q3.calculaArea(q3.getLado());
		System.out.println("Area 3: " + area_3);
		
		q4.aumentaQuadrado();
		System.out.println("\nLado 4: " + q4.getLado());
		int area_4 = q1.calculaArea(q4.getLado());
		System.out.println("Area 4: " + area_4);
		
		q5.aumentaQuadrado();
		System.out.println("\nLado 5: " + q5.getLado());
		int area_5 = q5.calculaArea(q5.getLado());
		System.out.println("Area 5: " + area_5);
		
		q6.aumentaQuadrado();
		System.out.println("\nLado 6: " + q6.getLado());
		int area_6 = q6.calculaArea(q6.getLado());
		System.out.println("Area 6: " + area_6);
		
		q7.aumentaQuadrado();
		System.out.println("\nLado 7: " + q7.getLado());
		int area_7 = q7.calculaArea(q7.getLado());
		System.out.println("Area 7: " + area_7);
		
		q8.aumentaQuadrado();
		System.out.println("\nLado 8: " + q8.getLado());
		int area_8 = q8.calculaArea(q8.getLado());
		System.out.println("Area 8: " + area_8);
		
		q9.aumentaQuadrado();
		System.out.println("\nLado 9: " + q9.getLado());
		int area_9 = q9.calculaArea(q9.getLado());
		System.out.println("Area 9: " + area_9);
		
		q10.aumentaQuadrado();
		System.out.println("\nLado 10: " + q10.getLado());
		int area_10 = q10.calculaArea(q10.getLado());
		System.out.println("Area 10: " + area_10);
		
		int soma = area_1 + area_2 + area_3 + area_4 + area_5 + area_6 + area_7 + area_8 + area_9 + area_10;
		System.out.println("\n\nSoma das areas: " + soma);
	}
}