package _Ejemplo8;

public class Principal {

	public static void main(String[] args) {
		Persona p1 = new Persona("per1", "1/1/2024");
		Persona p2 = new Persona("per2", "2/1/2024");
		Persona p3 = new Persona("per3", "3/1/2024");
		Persona p4 = new Persona("per4", "4/1/2024");

	
		//acceder a un metode de clase utilizando una instancia
		//se puede hacer pero no tiene mucho sentido
		p1.mostrarPoblacion();
		p2.mostrarPoblacion();
		p3.mostrarPoblacion();
		
		//lo que tiene más sentido es acceder a un metodo de clase
		//utilizando la clase
		Persona.mostrarPoblacion();
		
		
		
	}

}
