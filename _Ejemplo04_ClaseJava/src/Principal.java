
public class Principal {

	public static void main(String[] args) {
		//creamos instancia per1
		Persona per1 = new Persona();
		per1.setEdad(20);
		per1.setNombre("Maria");
		per1.saludar();
		
		//creamos instancia per2
		Persona per2 = new Persona();
		per2.setEdad(25);
		per2.setNombre("Pedro");
		per2.saludar();
		
		Persona per3 = new Persona("Jose", 21);
		per3.saludar();
		
		System.out.println("el  nombre de per2 es "
		+ per2.getNombre());
		
		
	}

}
