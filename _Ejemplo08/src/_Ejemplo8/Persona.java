package _Ejemplo8;

public class Persona {
	private String nombre;				//atributo de instancia					
	private String fechaNacimiento;		//atricuto de instancia
	
	private static int poblacion = 0; //atributo de clase
	
	public Persona(String nom, String fNac) {
		this.nombre = nom;
		this.fechaNacimiento = fNac;
		poblacion = poblacion + 1;
	}
	
	public  static void mostrarPoblacion() {
		System.out.println("La población total es " + poblacion);
	}
}
