package _Ejemplo10_BibliotecaParteB;

import java.time.LocalDate;

public class Prestamo {
	private String nombreUsuario;
	private LocalDate fechaPrestamo;
	private LocalDate fechaDevolucion;
	private Libro libro;
	
	public Prestamo
		(String nom, LocalDate fechaPre, 
		LocalDate fechaDev, Libro libro) {
		
		this.nombreUsuario = nom;
		this.fechaPrestamo = fechaPre;
		this.fechaDevolucion = fechaDev;
		this.libro = libro;
	}

	@Override
	public String toString() {
		return "Prestamo [nombreUsuario=" + this.nombreUsuario 
				+ ", fechaPrestamo=" + this.fechaPrestamo 
				+ ", fechaDevolucion="+ this.fechaDevolucion 
				+ ", libro=" + libro + "]";
	}
	
	
}
