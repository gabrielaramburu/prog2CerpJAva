package _Ejemplo11_Herencia;

public class Perro extends Mascota {

	public Perro(String nom, int edad) {
		super(nom, edad);
	}
	
	@Override
	public void saludar() {
		System.out.println("gua gua");
	}
}
