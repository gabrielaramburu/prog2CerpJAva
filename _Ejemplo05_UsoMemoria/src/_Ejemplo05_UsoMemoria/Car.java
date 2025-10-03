package _Ejemplo05_UsoMemoria;

public class Car {
	private String brand;
	private byte[] datosAdicionales;
	
	public Car (String brand) {
		//cada auto tendrá un atributo que consumira 1Kb 
		//de memoria 1024 byte = 1K
		this.datosAdicionales = new byte[1024]; 
		this.brand = brand;
	}
}
