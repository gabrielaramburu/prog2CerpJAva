package despues;

public class Contratado extends Empleado {
	private int horasTrabajadas;
	private int horasExtras;
	
	public Contratado(
			String nombre, 
			double salarioBase,
			int horasExtras,
			int horasTrabajadas
			) {
		
		super(nombre, salarioBase);
		this.horasExtras = horasExtras;
		this.horasTrabajadas = horasTrabajadas;
		
	}
	
	@Override
	public double calcularSueldo() {
		return this.salarioBase * this.horasTrabajadas 
				+ (this.horasExtras * 300); // Tarifa
	}
	
	
	
	
	
}
