package com.university.files.ej1;
//PruebaLeerArchivoSecuencial.java
//Este programa prueba la clase ReadSequentialFile.

public class PruebaLeerArchivoSecuencial {
    public static void main( String args[] ) {
       LeerArchivoSecuencial aplicacion = new LeerArchivoSecuencial();
    
       aplicacion.abrirArchivo();
       aplicacion.leerRegistros();
       aplicacion.cerrarArchivo();
    } // fin de main
} // fin de la clase PruebaLeerArchivoSecuencial

