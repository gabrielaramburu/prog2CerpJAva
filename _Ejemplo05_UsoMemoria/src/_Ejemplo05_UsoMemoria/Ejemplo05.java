package _Ejemplo05_UsoMemoria;

public class Ejemplo05 {

	public static void main(String[] args) {
		System.out.println("Comienza ejecución prueba");
		int fin = 100000;
		for (int i = 0; i < fin; i++) {
			new Car("Toyota");
			System.out.println("Se creo objeto auto: " + i);
			pausa();
		}
	}
	
	private static void pausa() {
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
