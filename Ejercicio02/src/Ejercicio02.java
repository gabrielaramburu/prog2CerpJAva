
public class Ejercicio02 {
	static String nacionalidad ="uruguaya";
	static int edad = 18;
	
	public static void main(String[] args) {
		
		ejecutarPunto1();
	}

	public static void ejecutarPunto1() {
		
		if (nacionalidad.equals("uruguayo") && edad >= 18) {
			System.out.println("Puede votar.");
		} else {
			if (edad < 18) 
				System.out.println("no puedo votar porque no tiene la edad suficiente");	
			
			if (!nacionalidad.equals("uruguayo"))
				System.out.println("la nacionalidad no lo permite");
		}
	}
}
