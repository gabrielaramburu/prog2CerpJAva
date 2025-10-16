package _Ejemplo10_BibliotecaParteB;

public class Libro {
	private String isbn;
	private String titulo;
	private Autor autor; 
	
	public Libro() {
		
	}

	public Libro(String isbn, String titulo, Autor autor) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
	}
	
	public String darInfoLibro() {
		//TODO: concatener el resto de los parametros
		return "isbn: " + this.isbn + ", " + this.titulo 
				+ " autor: " + this.autor;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + "]";
	}
	
	
	
}
