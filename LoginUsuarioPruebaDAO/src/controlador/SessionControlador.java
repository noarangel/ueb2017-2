package controlador;

public class SessionControlador {
	private String usuario;
	private SessionFachada session;

	public SessionControlador(String usuario) {
		this.usuario = usuario;
		this.session = new SessionFachada(this.usuario);
	}

	public boolean retirar(float cantidad) {
		return this.session.retirarSaldo(cantidad);
	}

	public String consultarCuenta() {
		return this.consultarCuenta();
	}

	public String consultarSaldo() {
		return this.session.consultarSaldo();
	}
}
