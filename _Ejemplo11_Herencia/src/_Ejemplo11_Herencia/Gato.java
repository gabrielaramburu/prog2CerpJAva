package _Ejemplo11_Herencia;

public class Gato extends Mascota{

	public Gato(String nom, int edad) {
		super(nom, edad);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void saludar() {
		System.out.println("miau miau");
	}
}
