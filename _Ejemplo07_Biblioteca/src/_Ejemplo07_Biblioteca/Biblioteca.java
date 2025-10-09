package _Ejemplo07_Biblioteca;

import java.util.List;

public class Biblioteca {
	private String nombre;
	private String direccion;
	private List<Libro> catalogoDeLibros; //este atributo es la asociacion
	
	public Biblioteca() {
		
	}
	public Biblioteca(String nombre, 
			String direccion, 
			List<Libro> catalogoDeLibros) {
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.catalogoDeLibros = catalogoDeLibros;
	}
	
	//observar que existen dos versiones del mimso método agregarLibro
	//a esto se le llama sobrecarga de un método
	//esta versión es preferible sobre la versión donde pasamos todos los 
	//atributos por separado (ver abajo)
	//en esta versión favorecemos el Encapsulamiento 
	public void agregarLibro(Libro libro) {
		this.catalogoDeLibros.add(libro); //a la lista de libros le 
		//agrego un nuevo elemento (libro)
	}
	
	//esta método lo realizamos para analizar la otra posibilidad:
	//no pasar el objeto sino que pasar parámetros sueltos que me sirvan 
	//para construir el objeto a partir de los mismos
	//Este método NO favorece el encapsulamiento.
	public void agregarLibro(String isbn, String titulo, String autor) {
		Libro nuevoLibro = new Libro(isbn, titulo, autor);
		this.catalogoDeLibros.add(nuevoLibro);
	}
	
	public void listarCatalogo() {
		System.out.println(" El catalogo de la biblioteca es:");
		
		//observar la versión simplificada del for que usamos aca
		for (Libro libroActual: this.catalogoDeLibros) {
			System.out.println(libroActual.darInfoLibro());
		}
	}
	
	
}
