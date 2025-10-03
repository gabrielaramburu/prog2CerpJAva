package _Ejemplo06_Asociacion;

public class Principal {

	public static void main(String[] args) {
		Casa casa1 = new Casa("18 de Julio", "Maldonado", "Rivera", 20000);
		
		Persona juan = new Persona("Juan", 20, casa1);
		
		//juan.saludar();
		
		juan.saludarMejorado();

	}

}
