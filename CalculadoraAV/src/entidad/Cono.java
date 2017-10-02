package entidad;

public class Cono {

	// Variables
	private double radio, altura, respuesta;
	private int bandera;

	// Constructores
	public Cono() {

	}

	public Cono(double aRadio, double aAltura, double fRespuesta, int aBandera) {

		this.radio = aRadio;
		this.altura = aAltura;
		this.respuesta = fRespuesta;
		this.bandera = aBandera;

	}

	// Getter's y Setter's
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
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
