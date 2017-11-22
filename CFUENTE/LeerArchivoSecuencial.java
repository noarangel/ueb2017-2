package com.university.files.ej1;

//LeerArchivoSecuencial.java
//Este programa lee un archivo de objetos en forma secuencial
//y muestra cada registro.
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeerArchivoSecuencial  {
        private ObjectInputStream entrada;

        // permite al usuario seleccionar el archivo a abrir
        public void abrirArchivo() {
           try { // abre el archivo
              entrada = new ObjectInputStream(new FileInputStream( "Archivo.dat" ) );
           } // fin de try
           catch ( IOException ioException ) {
              System.err.println( "Error al abrir el archivo." );
           } // fin de catch
        } // fin del m�todo abrirArchivo

        // lee el registro del archivo
        public void leerRegistros() {
           RegistroCuentaSerializable registro;
           System.out.printf( "%-10s%-15s%-15s%10s\n", "Cuenta","Primer nombre", "Apellido paterno", "Saldo" );
        
           try {// recibe los valores del archivo
              while ( true ) {
                 registro = ( RegistroCuentaSerializable ) entrada.readObject();
        
                 // muestra el contenido del registro
                 System.out.printf( "%-10d%-15s%-15s%11.2f\n",
                    registro.getCuenta(), registro.getPrimerNombre(),
                    registro.getApellidoPaterno(), registro.getSaldo() );
              } // fin de while
           } // fin de try
           catch ( EOFException endOfFileException ) {
              return; // se lleg� al fin del archivo
           } // fin de catch
           catch ( ClassNotFoundException classNotFoundException ) {
              System.err.println( "No se pudo crear el objeto." );
           } // fin de catch
           catch ( IOException ioException ) {
              System.err.println( "Error al leer del archivo." );
           } // fin de catch
        } // fin del m�todo leerRegistros

        // cierra el archivo y termina la aplicaci�n
        public void cerrarArchivo(){
           try { // cierra el archivo y sale
              if ( entrada != null )
                 entrada.close();
              System.exit( 0 );
           } // fin de try
           catch ( IOException ioException ) {
              System.err.println( "Error al cerrar el archivo." );
              System.exit( 1 );
           } // fin de catch
        } // fin del m�todo cerrarArchivo
} // fin de la clase LeerArchivoSecuencial
