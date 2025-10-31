package antes;

public class Principal {
	public static void main(String[] args) {
        Empresa empresa = new Empresa();
        
        empresa.agregarEmpleado(new Empleado("Ana", "GERENTE", 5000, 1000, 0, 0));
        empresa.agregarEmpleado(new Empleado("Luis", "ADMINISTRATIVO", 3000, 500, 10, 0));
        empresa.agregarEmpleado(new Empleado("Maria", "CONTRATADO", 100, 0, 5, 160));
        
        double sueldoTotal = empresa.calcularSueldoTotal();
        System.out.println("Sueldo total: " + sueldoTotal);
    }
}
