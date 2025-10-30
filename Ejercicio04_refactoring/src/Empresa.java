import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Empleado> empleados;

	public Empresa() {
		this.empleados = new ArrayList<>();
	}

	public void agregarEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}
	public double calcularSueldoTotal() {
		double total = 0;
		for (Empleado empleado : empleados) {
			total += calcularSueldoIndividual(empleado);
		}
		return total;
	}

	private double calcularSueldoIndividual(Empleado empleado) {
		String tipo = empleado.getTipo();

		if ("GERENTE".equals(tipo)) {
			return empleado.getSalarioBase() 
					+ (empleado.getSalarioBase() * 0.20) + // Bono por gerencia
					empleado.getBonificacion();

		} else if ("ADMINISTRATIVO".equals(tipo)) {
			return empleado.getSalarioBase() 
					+ (empleado.getHorasExtras() * 500) + // Pago por horas extras
					empleado.getBonificacion();

		} else if ("CONTRATADO".equals(tipo)) {
			return empleado.getSalarioBase() * empleado.getHorasTrabajadas() 
					+ (empleado.getHorasExtras() * 300); // Tarifa
						

		} else {
			throw new IllegalArgumentException("Tipo de empleado no válido: " + tipo);
		}
	}
}
