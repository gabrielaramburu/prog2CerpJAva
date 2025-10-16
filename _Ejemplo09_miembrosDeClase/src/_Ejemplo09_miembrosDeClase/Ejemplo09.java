package _Ejemplo09_miembrosDeClase;

import java.lang.reflect.Array;
import java.time.LocalDate;

public class Ejemplo09 {

	public static void main(String[] args) {
		//https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
			
		//el uso de constante es un ejemplo de un atributo estático
		System.out.println("Valor PI: " 
				+ Math.PI);
		 
		//una funcionalidad cualquiera de las tantas que ofrece la clase Match
		System.out.println("Valor máximo: "
				+ Math.max(100, 150));
		
		//en este caso of en un método de clase que me permite crear un 
		//objeto
		//https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html
		LocalDate miFecha = LocalDate.of(2025, 10, 1);
		System.out.println("Mi fecha: " + miFecha);
		
	}

}
