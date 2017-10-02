package fachada;

import entidad.Cono;
import entidad.Cubo;
import entidad.Esfera;

public class FachadaCalculadora {

	// Variables
	private Cono conoI, conoF;
	private Cubo cuboI, cuboF;
	private Esfera esferaI, esferaF;
	private CalculadoraCono calCono;
	private CalculadoraCubo calCubo;
	private CalculadoraEsfera calEsfera;

	// Constructores
	public FachadaCalculadora() {

	}

	public FachadaCalculadora(Cono cCono, int cFigura) {
		this.conoI = cCono;
		this.calCono = new CalculadoraCono(this.conoI);
		this.conoF = null;
		this.cuboI = null;
		this.cuboF = null;
		this.esferaI = null;
		this.esferaF = null;
		this.calCubo = null;
		this.calEsfera = null;
	}

	public FachadaCalculadora(Cubo cCubo, int cFigura) {
		this.cuboI = cCubo;
		this.calCubo = new CalculadoraCubo(this.cuboI);
		this.cuboF = null;
		this.conoI = null;
		this.conoF = null;
		this.esferaI = null;
		this.esferaF = null;
		this.calCono = null;
		this.calEsfera = null;
	}

	public FachadaCalculadora(Esfera cEsfera, int cFigura) {
		this.esferaI = cEsfera;
		this.calEsfera = new CalculadoraEsfera(this.esferaI);
		this.esferaF = null;
		this.conoI = null;
		this.conoF = null;
		this.cuboI = null;
		this.cuboF = null;
		this.calCono = null;
		this.calCubo = null;
	}

	// Metodos

	/** Metodo para cono */
	public Cono getResultadoCono() {
		if (this.conoI.getBandera() == 0) {
			this.conoF = this.calCono.getVolumen();
			System.out.print("funciono");
		} else {
			this.conoF = this.calCono.getAreaT();
		}

		return this.conoF;
	}

	/** Metodo para cubo */
	public Cubo getResultadoCubo() {
		if (this.cuboI.getBandera() == 0) {
			this.cuboF = this.calCubo.getVolumen();
		} else {
			this.cuboF = this.calCubo.getAreaT();
		}

		return this.cuboF;
	}

	/** Metodo para Esfera */
	public Esfera getResultadoEsfera() {
		if (this.esferaI.getBandera() == 0) {
			this.esferaF = this.calEsfera.getVolumen();
		} else {
			this.esferaF = this.calEsfera.getArea();
		}

		return this.esferaF;
	}

}
