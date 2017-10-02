package presentacion;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class ConversosUnidades extends JFrame {

	private JLabel etiquetaOr;
	private JLabel etiquetaDs;
	private String unidades[] = { "M", "KM" };

	public JTextField valorOrigen;
	public JComboBox unidadOrigen;
	public JTextField valorDestino;
	public JTextField unidadDestino;
	public JButton convertir;

	public ConversosUnidades() {

		super("Ejemplo Conversor Unidades");
		setLayout(new FlowLayout());

		etiquetaOr = new JLabel("Valor-Inicial");
		valorOrigen = new JTextField("0.0", 10);
		valorOrigen.setHorizontalAlignment(SwingConstants.RIGHT);
		unidadOrigen = new JComboBox(unidades);

		etiquetaDs = new JLabel("Resultado");
		valorDestino = new JTextField("0.0", 10);
		valorDestino.setHorizontalAlignment(SwingConstants.RIGHT);
		valorDestino.setEditable(false);
		unidadDestino = new JTextField("NA", 5);
		unidadDestino.setEditable(false);

		convertir = new JButton("<< Convertir >>");

		add(etiquetaOr);
		add(valorOrigen);
		add(unidadOrigen);
		add(etiquetaDs);
		add(valorDestino);
		add(unidadDestino);
		add(convertir);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 130);
		setVisible(true);

	}

}
