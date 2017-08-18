package controller;

import entity.*;

public class DarthVader {
	
	//Instancias
	private UnidadesDC udc;
	
	//constructor
	public DarthVader() {
		udc = new UnidadesDC();
	}
	
	//Metodos
	
	public String EnviarDatosUDC (String numeroC) {
		String respuesta = udc.verificaUDC(numeroC);
		return respuesta;
	}

}
