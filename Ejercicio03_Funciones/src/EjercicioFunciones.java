import java.util.Random;

public class EjercicioFunciones {

	public static void main(String[] args) {
		int res = sumarAsiMismo(50); //llamada a la función
		System.out.println("Salida " + res);
		
		//otra alternativa
		System.out.println("Salida " + sumarAsiMismo(50));
		
		valorRandom();
	}
	
	//declaración de la función
	public static int sumarAsiMismo(int valor) {
		int resultado = valor + valor;
		return resultado;
		//return valor + valor;
	}
	
	public static void valorRandom() {
		//creo objeto Random
		Random random = new Random(); 
		
		//le pido al objeto un valor entre 0 y 10
		int valorAleatorio = random.nextInt(11); 
		
		//muestro valor
		System.out.println("Valor Aleatorio " + valorAleatorio);
	}

}
