package presentacion;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiLogin extends JPanel {

	private JButton enviar;
	private Componentes login;

	public GuiLogin() {
		this.setLayout(new BorderLayout());
		// this.setBounds(0, 20, , height);

		enviar = new JButton("Aceptar");
		login = new Componentes();

		// Caracteristicas

		// Add's
		this.add(login, BorderLayout.CENTER);
		this.add(enviar, BorderLayout.SOUTH);

	}

	public class Componentes extends JPanel {

		private JLabel usuario, contraseña;
		private JTextField cUsuario, cContraseña;

		public Componentes() {
			this.setLayout(new GridLayout(5, 1, 7, 6));

			usuario = new JLabel("Usuario");
			cUsuario = new JTextField(20);
			contraseña = new JLabel("Contraseña");
			cContraseña = new JTextField(20);

			// Caracteristicas
			this.usuario.setHorizontalAlignment((int) this.CENTER_ALIGNMENT);
			this.contraseña.setHorizontalAlignment((int) this.CENTER_ALIGNMENT);

			// Add's
			this.add(usuario);
			this.add(cUsuario);
			this.add(contraseña);
			this.add(cContraseña);

		}

	}

}
