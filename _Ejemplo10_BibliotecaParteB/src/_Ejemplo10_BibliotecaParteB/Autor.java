package _Ejemplo10_BibliotecaParteB;

public class Autor {
	private String nombre;
	private String nacionalidad;
	
	public Autor(String nombre, String nacionalidad) {
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
	}

	@Override
	public String toString() {
		return this.nombre;
	}
	
	
}
