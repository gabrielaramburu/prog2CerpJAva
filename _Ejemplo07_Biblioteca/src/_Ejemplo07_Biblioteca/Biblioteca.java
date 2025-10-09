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
	
	public void agregarLibro(Libro libro) {
		this.catalogoDeLibros.add(libro); //a la lista de libros le 
		//agrego un nuevo elemento (libro)
	}
	
	public void agregarLibro(String isbn, String titulo, String autor) {
		Libro nuevoLibro = new Libro(isbn, titulo, autor);
		this.catalogoDeLibros.add(nuevoLibro);
	}
	
	public void listarCatalogo() {
		System.out.println(" El catalogo de la biblioteca es:");
		for (Libro libroActual: this.catalogoDeLibros) {
			System.out.println(libroActual.darInfoLibro());
		}
	}
	
	
}
