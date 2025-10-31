package despues;

public class Gerente extends Empleado {
	private double bonificacion;
	
	public Gerente(String nombre, double salarioBase, 
			int bonificacion) {
		super(nombre, salarioBase);
		
		this.bonificacion = this.bonificacion;
	}
	
	@Override
	public double calcularSueldo() {
		return this.salarioBase 
				+ (this.salarioBase * 0.40) + // Bono por gerencia
				this.bonificacion;
	}

}
