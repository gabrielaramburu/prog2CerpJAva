package _Ejemplo07_Biblioteca;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		
		Biblioteca biblioteca = 
				new Biblioteca("miPrimerBiblio", "18 de julio", 
						new ArrayList<Libro>()); 
		//el tercer parámetro es una lista de libros vacía
		
		Libro libro1 = new Libro("1", "titulo libro 1", "autor libro 1");
		Libro libro2 = new Libro("2", "titulo libro 2", "autor libro 2");

		
		biblioteca.agregarLibro(libro1);
		biblioteca.agregarLibro(libro2);
		
		biblioteca.listarCatalogo();
	}

}
