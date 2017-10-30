package GuiAdministrador;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GuiPrincipalA  extends JFrame{

	public int heightMyScreen, widthMyScreen;
	public PanelPrincipal panelP;
	public OpcionesUsuario PanelO;

	public GuiPrincipalA() {

		// Especificaciones de la ventanta
		this.setLayout(null);
		
		Toolkit screenU = Toolkit.getDefaultToolkit();
		Dimension screenSize = screenU.getScreenSize();
		heightMyScreen = screenSize.height;
		widthMyScreen = screenSize.width;
		setBounds(400, 200, widthMyScreen / 2, heightMyScreen / 2);
		setTitle("Aerolinea UEB - Admin -");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Instancias
		panelP = new PanelPrincipal();
		PanelO = new OpcionesUsuario();

		// Especificaciones de los componenetes
		this.PanelO.setBounds(widthMyScreen / 12, heightMyScreen / 15, widthMyScreen / 3 , heightMyScreen / 3);
		this.panelP.setBounds(1, 1, widthMyScreen / 2, heightMyScreen / 2);

		// Add's Panel
		this.panelP.add(PanelO);
		this.add(panelP);

		// Visible
		setVisible(true);

	}

	public class PanelPrincipal extends JPanel {

		public PanelPrincipal() {
			this.setLayout(null);

		}
	}

	public class OpcionesUsuario extends JPanel {

		public JButton opcion1, opcion2, opcion3;

		public OpcionesUsuario() {
			// Especificaciones
			this.setLayout(new GridLayout(3, 1, 7, 7));

			// Instancias
			this.opcion1 = new JButton("Configurar Vuelos");
			this.opcion2 = new JButton("Configurar Horarios"); 
			this.opcion3 = new JButton("Configurar Destino");

			// Especificaciones de los componentes

			this.add(opcion1);
			this.add(opcion2);
			this.add(opcion3);

		}
	}
	
	public class GuiMensajesAdmin extends JPanel {

		public JTextArea campoTexto;
		public JButton enviar2;
		private Font font;

		public GuiMensajesAdmin() {
			this.setLayout(new BorderLayout());

			this.font = new Font("Verdana", Font.ITALIC, 18);

			this.campoTexto = new JTextArea();
			this.enviar2 = new JButton("Terminar");

			this.campoTexto.setEditable(false);
			this.campoTexto.setBackground(getBackground());
			this.campoTexto.setFont(font);

			this.add(campoTexto, BorderLayout.CENTER);
			this.add(enviar2, BorderLayout.SOUTH);
			
			this.setVisible(false);

		}

	}

}
