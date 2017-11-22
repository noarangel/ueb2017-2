package com.university.files.ej1;

//RegistroCuentaSerializable.java
//Una clase que representa un registro de informaci�n.

import java.io.Serializable;

public class RegistroCuentaSerializable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int cuenta;
	private String primerNombre;
	private String apellidoPaterno;
	private double saldo;

	// el constructor sin argumentos llama al otro constructor con valores
	// predeterminados
	public RegistroCuentaSerializable() {
		this(0, "", "", 0.0);
	} // fin del constructor de RegistroCuentaSerializable sin argumentos

	// el constructor con cuatro argumentos inicializa un registro
	public RegistroCuentaSerializable(int cta, String nombre, String apellido,
			double sal) {
		this.cuenta = cta;
		this.primerNombre = nombre;
		this.apellidoPaterno = apellido;
		this.saldo = sal;

	} // fin del constructor de RegistroCuentaSerializable con cuatro argumentos

	public int getCuenta() {
		return cuenta;
	}

	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

} // fin de la clase RegistroCuentaSerializable

