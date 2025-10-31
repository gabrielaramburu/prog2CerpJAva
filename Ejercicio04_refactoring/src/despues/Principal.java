package despues;

public class Principal {
	public static void main(String[] args) {
        Empresa empresa = new Empresa();
        
        //intercambiabilidad: un objeto de una clase derivada
        //lo puedo cargar a una variable de tipo clase padre.
        Empleado emp = new Gerente("Ana", 5000, 1000); 
        
        empresa.agregarEmpleado(emp); //es lo mismo que lo de abajo
        empresa.agregarEmpleado(new Administrativo("Luis", 3000, 500, 10));
        empresa.agregarEmpleado(new Contratado("Maria", 100, 5, 160));
        
        double sueldoTotal = empresa.calcularSueldoTotal();
        System.out.println("Sueldo total: " + sueldoTotal);
    }
}
