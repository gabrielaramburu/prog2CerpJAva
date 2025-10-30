package _Ejemplo12_Sobrecarga;

public class Cuadrado extends Figura{

	public Cuadrado(int base, int altura) {
		super(base, altura);
		if (base != altura) {
			throw new RuntimeException("No puedo crear objeto");
		}
	}

	@Override
	public float calcularArea( ) {
		System.out.println("Calculo area cuadrado");
		return (this.base * this.altura);
	}
}
