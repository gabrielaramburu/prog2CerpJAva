package _Ejemplo02_comparacion_String;

public class Comparacion {

	public static void main(String[] args) {
		String nombrePersona1 = new String("pepe");
		String nombrePersona2 = new String("Pepe");
		
		if (nombrePersona1.equals(nombrePersona2)) { 
			System.out.println("Las dos personas se llaman igual");
		} else {
			System.out.println("Las dos personas se llaman distinto.");
		}
		
		// ¿Que salida produce este programa?
	}

}
