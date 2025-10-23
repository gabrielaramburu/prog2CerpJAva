package _Ejemplo11_Herencia;

public class Mascota {
	protected String nombre;
	protected int edad;
	
	public Mascota(String nom, int edad) {
		this.nombre = nom;
		this.edad = edad;
	}
	
	public void decirNombreyEdad() {
		System.out.println("Mi nombre es " + this.nombre 
				+  " y tengo " + this.edad);
	}
}
