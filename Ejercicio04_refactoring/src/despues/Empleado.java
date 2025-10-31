package despues;

public class Empleado {
	protected String nombre;
	protected double salarioBase;

	public Empleado(String nombre, double salarioBase) {
		this.nombre = nombre;
		this.salarioBase = salarioBase;
		
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public String getNombre() {
		return nombre;
	}
	
	public double calcularSueldo() {
		return 0;
	}
	
}
