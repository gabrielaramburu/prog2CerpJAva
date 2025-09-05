package _Ejemplo03_pedir_entero;

import java.util.Scanner; //le tengo que indicar al compilador que voy a usar la clase Scanner

public class PedirEnteroPorTeclado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //creo objeto que me permite leer entrada desde teclado
		String nombre;
		int edad;
		
		System.out.println("¿Cuál es tu nombre?");
		nombre = scanner.nextLine(); //obtengo String
		
		System.out.println("¿Cuál es tu edad?");
		edad = scanner.nextInt();	//obtengo entero
		
		System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años");
	}

}
