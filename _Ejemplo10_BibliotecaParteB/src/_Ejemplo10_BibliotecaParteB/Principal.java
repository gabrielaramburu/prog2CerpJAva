package _Ejemplo10_BibliotecaParteB;

import java.time.LocalDate;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Biblioteca biblioteca = 
				new Biblioteca("miPrimerBiblio", "18 de julio", 
						new ArrayList<Libro>()); 
		//el tercer parámetro es una lista de libros vacía
		
		Autor autor1 = new Autor("Mario Benedetti", "uruguayo");
		Autor autor2 = new Autor("Gabriel García Márquez", "colombiano");
		
		Libro libro1 = 
				new Libro("1", "100 años de soledad", autor2);
		Libro libro2 = 
				new Libro("2", "La tregua", autor1);

		
		biblioteca.agregarLibro(libro1);
		biblioteca.agregarLibro(libro2);
		
		biblioteca.listarCatalogo();
		
		
		LocalDate fechaInicio = LocalDate.now(); 
		LocalDate fechaDevolucion = LocalDate.of(2025,  10, 17);
		Prestamo p1 = new Prestamo(
				"usuario1", fechaInicio, fechaDevolucion, libro1);
		
		biblioteca.prestarLibro(p1);
		
		System.out.println("");
		biblioteca.listarPrestamos();
}
}
