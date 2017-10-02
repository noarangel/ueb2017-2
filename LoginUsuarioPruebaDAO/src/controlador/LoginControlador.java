package controlador;

public class LoginControlador {
	private LoginFachada logueo;

	public LoginControlador() {
		this.logueo = new LoginFachada();
	}

	public boolean login(String usuario, String clave) {
		return this.logueo.login(usuario, clave);
	}

	public void logout() {
		this.logueo.logout();
	}
	
	public boolean estaLoguead() {
		return this.logueo.estaLogueado();
	}
	
	public String getUsuario() {
		return this.logueo.getUsuario();
	}
}
