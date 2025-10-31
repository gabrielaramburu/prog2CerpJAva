package antes;

public class Empleado {
	private String nombre;
	private String tipo; // GERENTE, ADMINISTRATIVO, CONTRATADO
	private double salarioBase;
	private double bonificacion;
	private int horasExtras;
	private int horasTrabajadas;

	public Empleado(String nombre, String tipo, double salarioBase, double bonificacion, int horasExtras,
			int horasTrabajadas) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.salarioBase = salarioBase;
		this.bonificacion = bonificacion;
		this.horasExtras = horasExtras;
		this.horasTrabajadas = horasTrabajadas;
	}

	public String getTipo() {
		return tipo;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public double getBonificacion() {
		return bonificacion;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public String getNombre() {
		return nombre;
	}
}
