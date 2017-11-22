package com.university.files.ej1;

//PruebaCrearArchivoSecuencial.java
//Prueba de la clase CrearArchivoSecuencial.

public class PruebaCrearArchivoSecuencial {
	public static void main(String args[]) {
		CrearArchivoSecuencial aplicacion = new CrearArchivoSecuencial();

		aplicacion.abrirArchivo();
		aplicacion.agregarRegistros();
		aplicacion.cerrarArchivo();
	} // fin de main
} // fin de la clase PruebaCrearArchivoSecuencial

