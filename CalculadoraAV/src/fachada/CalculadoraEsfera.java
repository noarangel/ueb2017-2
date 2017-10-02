package fachada;

import entidad.Esfera;

public class CalculadoraEsfera {

	// Variables
	private Esfera esferaI, esferaF;

	// Constructores
	public CalculadoraEsfera() {
	}

	public CalculadoraEsfera(Esfera fEsfera) {
		this.esferaI = fEsfera;
		this.esferaF = null;
	}

	// Metodos
	public Esfera getVolumen() {
		// Variables e Instancias
		double radio = this.esferaI.getRadio();
		int bandera = 0;
		// Operación
		double respuesta = (4 * Math.PI * Math.pow(radio, 3)) / 3;
		// Creamos el objeto de respuesta
		this.esferaF = new Esfera(radio, respuesta, bandera);

		return this.esferaF;
	}

	public Esfera getArea() {
		// Variables e Instancias
		double radio = this.esferaI.getRadio();
		int bandera = 1;
		// Operación
		double respuesta = 4 * Math.PI * Math.pow(radio, 2);
		//Creamos el objeto de respuesta
		this.esferaF = new Esfera(radio, respuesta, bandera);
		
		return this.esferaF;
	}
}
