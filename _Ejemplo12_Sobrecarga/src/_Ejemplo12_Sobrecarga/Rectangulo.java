package _Ejemplo12_Sobrecarga;

public class Rectangulo extends Figura {

	public Rectangulo(int base, int altura) {
		super(base, altura);
	}
	
	@Override
	public float calcularArea( ) {
		System.err.println("Calculo area rectángulo");
		return (this.base * this.altura);
	}
	
	

}
