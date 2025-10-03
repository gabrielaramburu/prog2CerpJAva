
public class Persona {
	//primero ponemos los atributos
	private String nombre;
	private int edad;
	
	//construcor por defecto
	public Persona() {
		System.out.println("Uso el constructor por defecto.");
	}
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		System.out.println("Uso el constructor personalizado");
	}
	
	//declaro las operaciones
	public void saludar() {
		System.out.println
			("Hola, mi nombre es " + this.nombre);
	}

	public int getEdad() {
		return edad;
	}

	//seteamos el atributo edad según el parámetro
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
}
