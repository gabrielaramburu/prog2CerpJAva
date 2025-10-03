package _Ejemplo06_Asociacion;

public class Casa {
	//solo los veo dentro de la clase Casa
	private String calle;
	private String ciudad;
	private String barrio;
	private int codigoPostal;
	
	//constructor por defecto
	public Casa() {
		
	}
	
	//constructor con calle+ciudad
	public Casa(String calle, String ciudad, String barrio, 
			int codigo) {
		this.calle = calle;
		this.ciudad = ciudad;
		this.barrio = barrio;
		this.codigoPostal = codigo;
		
	}

	public String getCalle() {
		return this.calle;
	}

	public String getCiudad() {
		return this.ciudad;
	}
	
	
	public String getBarrio() {
		return barrio;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	//mejoramos el encaspuslamiento de nuestro código
	//ya que no expongo el funcionamiento interno de la casa
	public String darUbicacion() {
		return "ciudad: " + this.ciudad 
				+ ", calle: " + this.calle
				+ ", barrio: " + this.barrio
				+ ", código postal: " + this.codigoPostal;
	}
	
	
}
