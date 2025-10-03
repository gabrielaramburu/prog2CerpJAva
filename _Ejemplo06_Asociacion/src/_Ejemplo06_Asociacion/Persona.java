package _Ejemplo06_Asociacion;

public class Persona {
	private String nombre;
	private int edad;
	private Casa vive; //esta linea crea la asociación 
	//de objetos
	
	public Persona(String nombre, int edad, Casa casa) {
		this.nombre = nombre;
		this.edad = edad;
		this.vive = casa;
	}
	
	public void saludar() {
		//primera versión con getters
		System.out.println("hola soy " 
				+ this.nombre 
				+ " vivo en " 
				+ vive.getCiudad()
				+ ", en la calle " + vive.getCalle() 
				+ " en el barrio " + vive.getBarrio() 
				+ " con el código postal " + vive.getCodigoPostal());
	}
	
	//mejoramos el encaspuslamiento de nuestro código
	public void saludarMejorado() {
		System.out.println("hola soy " 
				+ this.nombre 
				+ " vivo en " 
				+ vive.darUbicacion());
	}
	
	
}
