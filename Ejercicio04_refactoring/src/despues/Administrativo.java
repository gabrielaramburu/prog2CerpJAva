package despues;

public class Administrativo extends Empleado {

	private double bonificacion;
	private int horasExtras;
	
	public Administrativo(
			String nombre, 
			double salarioBase,
			double bonificacion,
			int horasExtras) {
		super(nombre, salarioBase); //llamo al constructor del padre
		
		this.bonificacion = bonificacion;
		this.horasExtras = horasExtras;
		
	}
	
	@Override
	public double calcularSueldo() {
		return this.salarioBase 
				+ (this.horasExtras * 500) + // Pago por horas extras
				this.bonificacion;
	}
	
	
}
