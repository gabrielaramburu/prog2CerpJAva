package _Ejemplo12_Sobrecarga;

public class Principal {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo(10, 5);
		Rectangulo r2 = new Rectangulo(5, 5);
		
		System.out.println(t1.calcularArea());
		System.out.println(r2.calcularArea());

		Cuadrado c1 = new Cuadrado(12, 12);
	}

}
