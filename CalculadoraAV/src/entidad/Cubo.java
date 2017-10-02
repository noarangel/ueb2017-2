package entidad;

public class Cubo {
	
	//Variables
	private double arista, respuesta;
	private int bandera;

	//Constructores
	public Cubo() {
	}

	public Cubo(double aArista, double fRespuesta, int aBandera) {

		this.arista = aArista;
		this.respuesta = fRespuesta;
		this.bandera = aBandera;
	}

	// Getter's y Setter's
	public double getArista() {
		return arista;
	}

	public void setArista(double arista) {
		this.arista = arista;
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
