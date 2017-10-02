package fachada;

import entidad.Cono;

public class CalculadoraCono {

	// Variables
	private Cono conoI, conoF;

	// Constructores
	public CalculadoraCono() {

	}

	public CalculadoraCono(Cono fCono) {
		this.conoI = fCono;
		this.conoF = null;
	}

	// Metodos
	public Cono getVolumen() {
		// Variables e Instancias
		double radio = conoI.getRadio();
		double altura = conoI.getAltura();
		int bandera = 0;
		// Operación
		double respuesta = (Math.PI * Math.pow(radio, 2) * altura) / 3;
		// Creamos el objeto de respuesta
		this.conoF = new Cono(radio, altura, respuesta, bandera);

		return this.conoF;
	}

	public Cono getAreaT() {
		// Variables e Instancias
		double radio = this.conoI.getRadio();
		double altura = this.conoI.getAltura();
		int bandera = 1;
		// Calculo de la generatriz
		double generatriz = (Math.pow(altura, 2) * Math.pow(radio, 2));
		// Operación
		double respuesta = Math.PI * radio * (generatriz + radio);
		// Creamos el objeto de respuesta
		this.conoF = new Cono(radio, altura, respuesta, bandera);

		return this.conoF;
	}
}
