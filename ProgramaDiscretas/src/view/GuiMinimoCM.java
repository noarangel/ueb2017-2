package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EmptyStackException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.DarthVader;

public class GuiMinimoCM extends JPanel {
	
	private DarthVader sith5;
	private JPanel norte, centro, sur;
	private JTextField numero1;
	private JTextField numero2;
	private JTextField numero3;	
	private JTextField resultado;
	private Capturar guardar;

	public GuiMinimoCM() {
		
		this.setLayout(new BorderLayout());

		// Instancias
		sith5 = new DarthVader();
		guardar = new Capturar();
		norte = new JPanel();
		centro = new JPanel();
		sur = new JPanel();
		numero1 = new JTextField(5);
		numero2 = new JTextField(5);
		numero3 = new JTextField(5);
		resultado = new JTextField(40);

		// Bloque

		JLabel etiquetaCDB = new JLabel("Ingrese el número a comprobar");
		etiquetaCDB.setHorizontalAlignment(getWidth());
		JButton enviar = new JButton("Enviar");
		JLabel etiquetaNumero1 = new JLabel("Ingrese el primer número");
		numero1.setHorizontalAlignment(numero1.CENTER);
		JLabel etiquetaNumero2 = new JLabel("Ingrese el primer número");
		numero2.setHorizontalAlignment(numero2.CENTER);
		JLabel etiquetaNumero3 = new JLabel("Ingrese el primer número");
		numero3.setHorizontalAlignment(numero3.CENTER);


		resultado.setHorizontalAlignment(resultado.CENTER);
		resultado.setEditable(false);
		centro.setLayout(new GridLayout(5, 1));

		// add's
		norte.add(etiquetaCDB);
		centro.add(etiquetaNumero1);
		centro.add(numero1);
		centro.add(etiquetaNumero2);
		centro.add(numero2);
		centro.add(etiquetaNumero3);
		centro.add(numero3);
		sur.add(enviar);

		add(norte, BorderLayout.NORTH);
		add(centro, BorderLayout.CENTER);
		add(sur, BorderLayout.SOUTH);
		
		//Acciones
		enviar.addActionListener(guardar);
	}

	private class Capturar implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			String cNumero1 = "";
			String cNumero2 = "";
			String cNumero3 = "";

			try {
				cNumero1 = numero1.getText().trim();
				cNumero2 = numero2.getText().trim();
				cNumero3 = numero3.getText().trim();
				
				int nNumero1 = Integer.parseInt(cNumero1);
				int nNumero2 = Integer.parseInt(cNumero2);
				int nNumero3 = Integer.parseInt(cNumero3);

				
				resultado.setText(sith5.enviarDatosMinimoCM(nNumero1, nNumero2, nNumero3));
				JOptionPane.showMessageDialog(null, resultado);
				numero1.setText(null);
				numero2.setText(null);
				numero3.setText(null);
				
			} catch (Exception w) {
				JOptionPane.showMessageDialog(null, "Valor incorrecto, por favor, intentelo de nuevo");
				numero1.setText(null);
				numero2.setText(null);
				numero3.setText(null);
				resultado.setText(null);
			}

		}

	}

}
