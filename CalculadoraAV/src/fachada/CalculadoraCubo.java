package fachada;

import entidad.Cubo;

public class CalculadoraCubo {

	// Variables
	private Cubo cuboI, cuboF;

	// Constructores
	public CalculadoraCubo() {

	}

	public CalculadoraCubo(Cubo fCubo) {
		this.cuboI = fCubo;
		this.cuboF = null;
	}

	// Metodos

	public Cubo getVolumen() {
		// Variables e Instancias
		double arista = this.cuboI.getArista();
		int bandera = 0;
		// Operación
		double respuesta = Math.pow(arista, 3);
		// Creamos el objeto de respuesta
		this.cuboF = new Cubo(arista, respuesta, bandera);
		
		return this.cuboF;
	}
	
	public Cubo getAreaT() {
		// Variables e Instancias
		double arista = this.cuboI.getArista();
		int bandera = 1;
		// Operación
		double respuesta = 6*Math.pow(arista, 2);
		// Creamos el objeto de respuesta
		this.cuboF = new Cubo(arista, respuesta, bandera);
		
		return this.cuboF;
	}

}
