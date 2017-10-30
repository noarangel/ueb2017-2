package controlador;

import java.util.ArrayList;

import integracion.CuentaDAO;
import integracion.CuentaDTO;

public class SessionFachada {

	private CuentaDTO cuenta;
	private CuentaDAO cuentaDAO;
	private ArrayList<CuentaDTO> cuentas;
	private String usuario;
	private boolean ultimaTransaccion;

	public SessionFachada(String usuario) {
		this.usuario = usuario;
		this.ultimaTransaccion = true;

		this.cuenta = new CuentaDTO();
		this.cuentaDAO = new CuentaDAO();
		this.cuentas = this.cuentaDAO.leerArchivo();
		this.inicializarCuenta();
	}

	private void inicializarCuenta() {
		this.ultimaTransaccion = false;

		for (int i = 0; i < this.cuentas.size(); i++) {
			if (this.usuario.equals(this.cuentas.get(i).getUsuario())) {
				this.cuenta = this.cuentas.get(i);
				this.ultimaTransaccion = true;
				return;
			}
		}

		this.cuenta = null;
	}

	public String consultarCuenta() {
		this.ultimaTransaccion = false;

		if (this.cuenta != null) {
			this.ultimaTransaccion = true;
			return this.cuenta.getnCuenta();
		}

		return "";
	}

	public String consultarSaldo() {
		this.ultimaTransaccion = false;

		if (this.cuenta != null) {
			this.ultimaTransaccion = true;
			return this.cuenta.getSaldo();
		}

		return "";
	}

	private void actualizarArchivo() {
		this.cuentaDAO.limpiarArchivo();

		for (int i = 0; i < this.cuentas.size(); i++) {
			if (this.usuario.equals(this.cuentas.get(i).getUsuario())) {
				this.cuentaDAO.escribirArchivo(this.cuenta);
			} else {
				this.cuentaDAO.escribirArchivo(this.cuentas.get(i));
			}
		}
	}

	public boolean retirarSaldo(float cantidad) {
		this.ultimaTransaccion = false;

		if (this.cuenta != null) {
			float nuevoSaldo = Float.valueOf(this.cuenta.getSaldo()) - cantidad;
			if (cantidad >= 0 && nuevoSaldo >= 0) {
				this.cuenta.setSaldo(String.valueOf(nuevoSaldo));
				this.actualizarArchivo();
				this.ultimaTransaccion = true;
			}
		}

		return this.ultimaTransaccion;
	}

	public boolean ultimaTransaccionExitosa() {
		return this.ultimaTransaccion;
	}
}
