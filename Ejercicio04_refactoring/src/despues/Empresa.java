package despues;
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
		public double calcularSueldoTotal() {		double total = 0;
		for (Empleado emp : empleados) {
			total += emp.calcularSueldo();
		}
		return total;
	}

}
