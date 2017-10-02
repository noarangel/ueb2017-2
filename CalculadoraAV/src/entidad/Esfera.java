package entidad;

public class Esfera {

	// varibles
	private double radio, respuesta;
	private int bandera;

	// Constructores
	public Esfera() {

	}
	
	public Esfera(double aRadio, double fVolumen, int aBandera) {

		this.radio = aRadio;
		this.respuesta = fVolumen;
		this.bandera = aBandera;
		
	}

	// Getter's y Setter's
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(double respuesta) {
		this.respuesta = respuesta;
	}

	public int getBandera() {
		return bandera;
	}

	public void setBandera(int bandera) {
		this.bandera = bandera;
	}
	
}
