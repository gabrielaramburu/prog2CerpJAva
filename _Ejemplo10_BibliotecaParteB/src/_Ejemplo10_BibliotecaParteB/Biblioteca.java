package _Ejemplo10_BibliotecaParteB;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private String nombre;
	private String direccion;
	private List<Libro> catalogoDeLibros; //este atributo es la asociacion
	private List<Prestamo> prestamos;
	
	public Biblioteca() {
		
	}
	public Biblioteca(String nombre, 
			String direccion, 
			List<Libro> catalogoDeLibros) {
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.catalogoDeLibros = catalogoDeLibros;
		this.prestamos = new ArrayList<Prestamo>(); //lista vacía
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
	
	
	public void listarCatalogo() {
		System.out.println(" El catalogo de la biblioteca es:");
		
		//observar la versión simplificada del for que usamos aca
		for (Libro libroActual: this.catalogoDeLibros) {
			System.out.println(libroActual.darInfoLibro());
		}
	}
	
	public void prestarLibro(Prestamo prestamo) {
		this.prestamos.add(prestamo);
	}
	
	public void listarPrestamos() {
		for (Prestamo prestamo: this.prestamos) {
			System.out.println(prestamo);
		}
	}
	
	
}
