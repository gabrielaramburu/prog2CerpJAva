package _Ejemplo07_Biblioteca;

public class Libro {
	private String isbn;
	private String titulo;
	private String auto; 
	
	public Libro() {
		
	}

	public Libro(String isbn, String titulo, String auto) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.auto = auto;
	}
	
	public String darInfoLibro() {
		//TODO: concatener el resto de los parametros
		return "isbn: " + this.isbn;
	}
	
	
}
