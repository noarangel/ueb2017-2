package controlador;

import java.util.ArrayList;

import integracion.UsuarioDAO;
import integracion.UsuarioDTO;

public class LoginFachada {

	private UsuarioDTO usuario;
	private UsuarioDAO usuarioDAO;
	private ArrayList<UsuarioDTO> usuarios;
	private boolean logueado;

	public LoginFachada() {
		this.logueado = false;
		this.usuario = new UsuarioDTO();
		this.usuarioDAO = new UsuarioDAO();
		this.usuarios = this.usuarioDAO.leerArchivo();
	}

	public boolean login(String usuario, String clave) {
		this.logueado = false;
		this.usuario.setUsuario("");

		for (int i = 0; i < this.usuarios.size(); i++) {
			if (usuario.equals(this.usuarios.get(i).getUsuario())) {
				if (clave.equals(this.usuarios.get(i).getClave())) {
					this.usuario.setUsuario(usuario);
					this.logueado = true;
				}
				break;
			}
		}
		return this.logueado;
	}

	public void logout() {
		this.logueado = false;
		this.usuario.setUsuario("");
	}

	public boolean estaLogueado() {
		return this.logueado;
	}

	public String getUsuario() {
		return this.usuario.getUsuario();
	}
}
