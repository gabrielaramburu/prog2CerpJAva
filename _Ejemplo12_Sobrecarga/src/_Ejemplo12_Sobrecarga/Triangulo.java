package _Ejemplo12_Sobrecarga;

public class Triangulo extends Figura {

	public Triangulo(int base, int altura) {
		super(base, altura); //llama al constructor del padre
		//es una manera de no repetir código.
		
	}
	
	@Override
	public float calcularArea() {
		System.out.println("Calculo area triángulo");
		return (this.base * this.altura) / 2;
	}
}
