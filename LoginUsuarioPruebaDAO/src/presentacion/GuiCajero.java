package presentacion;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class GuiCajero extends JPanel {

	// Atributos
	private OpcionesCajero opcionesP;

	public GuiCajero() {
		setLayout(new GridLayout());

		// Instancias
		opcionesP = new OpcionesCajero();

		// Caracteristicas

		// Add's
		this.add(opcionesP);

	}

	public class OpcionesCajero extends JPanel {

		// Atributos
		private JButton consultar, retirar;

		public OpcionesCajero() {

			this.setLayout(new GridLayout(1,1));

			// Instancias
			this.consultar = new JButton("Consultar Saldo");
			this.retirar = new JButton("Retirar Dinero");

			// Caracteristicas

			// Add's

			this.add(consultar, BorderLayout.NORTH);
			this.add(retirar, BorderLayout.SOUTH);

		}
	}

}
