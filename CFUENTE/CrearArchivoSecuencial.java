package com.university.files.ej1;
//CrearArchivoSecuencial.java
//Escritura de objetos en forma secuencial a un archivo, con la clase ObjectOutputStream.
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class CrearArchivoSecuencial {
        private ObjectOutputStream salida; // env�a los datos a un archivo

        // permite al usuario especificar el nombre del archivo
        public void abrirArchivo() {
           try { // abre el archivo
              salida = new ObjectOutputStream(new FileOutputStream( "EstructuraNoche.dat" ) );
           } // fin de try
           catch ( IOException ioException ){
              System.err.println( "Error al abrir el archivo." );
           } // fin de catch
        } // fin del m�todo abrirArchivo

        // agrega registros al archivo
        public void agregarRegistros()  {
           RegistroCuentaSerializable registro; // objeto que se va a escribir al archivo
           int numeroCuenta = 0; // n�mero de cuenta para el objeto registro
           String primerNombre; // primer nombre para el objeto registro
           String apellidoPaterno; // apellido paterno para el objeto registro
           double saldo; // saldo para el objeto registro
        
           Scanner entrada = new Scanner( System.in );
        
           System.out.printf( "%s\n%s\n%s\n%s\n\n",
              "Para terminar de introducir datos, escriba el indicador de fin de archivo ",
              "Cuando se le pida que introduzca los datos.",
              "En UNIX/Linux/Mac OS X escriba <ctrl> d y oprima ENTER",
              "En Windows escriba <ctrl> z y oprima ENTER" );
        
           System.out.printf( "%s\n%s", "Escriba el numero de cuenta (> 0), primer nombre, apellido y saldo.","? " );
        
           while ( entrada.hasNext() ) { // itera hasta el indicador de fin de archivo
              try { // env�a los valores al archivo
                 numeroCuenta = entrada.nextInt(); // lee el n�mero de cuenta
                 primerNombre = entrada.next(); // lee el primer nombre
                 apellidoPaterno = entrada.next(); // lee el apellido paterno
                 saldo = entrada.nextDouble(); // lee el saldo
        
                 if ( numeroCuenta > 0 ){
                    // crea un registro nuevo
                    registro = new RegistroCuentaSerializable();
                    registro.setCuenta(numeroCuenta);
                    registro.setPrimerNombre(primerNombre);
                    registro.setApellidoPaterno(apellidoPaterno);
                    registro.setSaldo(saldo);
                    salida.writeObject( registro ); // env�a el registro como salida
                 } // fin de if
                 else{
                    System.out.println("El numero de cuenta debe ser mayor de 0." );
                 } // fin de else
              } // fin de try
              catch ( IOException ioException ) {
                 System.err.println( "Error al escribir en el archivo." );
                 return;
              } // fin de catch
              catch ( NoSuchElementException elementException ) {
                 System.err.println( "Entrada invalida. Intente de nuevo." );
                 entrada.nextLine(); // descarta la entrada para que el usuario intente de nuevo
              } // fin de catch
              System.out.printf( "%s %s\n%s", "Escriba el numero de cuenta (>0),","primer nombre, apellido y saldo.", "? " );
           } // fin de while
        } // fin del m�todo agregarRegistros

        // cierra el archivo y termina la aplicaci�n
        public void cerrarArchivo() {
           try { // cierra el archivo
              if ( salida != null )
                 salida.close();
           } // fin de try
           catch ( IOException ioException ) {
              System.err.println( "Error al cerrar el archivo." );
              System.exit( 1 );
           } // fin de catch
        } // fin del m�todo cerrarArchivo
} // fin de la clase CrearArchivoSecuencial
