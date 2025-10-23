package _Ejemplo11_Herencia;

public class Principal {
	//si no fuera static ¿quien construye la instancia?
	//al ser estático, no necesito instanciar nada, solo preciso
	//la clase.
	public static void main(String[] args) {
		Perro p1 = new Perro("sultan", 1);
		p1.decirNombreyEdad();
		
		Gato g1 = new Gato("mishifu", 10);
		g1.decirNombreyEdad();
	}
}
