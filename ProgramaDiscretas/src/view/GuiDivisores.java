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

public class GuiDivisores extends JPanel{
	
	private DarthVader sith3;
	private JPanel norte, centro, sur;
	private JTextField numeroC;
	private JTextField resultado;
	private Capturar guardar;

	public GuiDivisores () {
		
		this.setLayout(new BorderLayout());

		// Instancias
		sith3 = new DarthVader();
		guardar = new Capturar();
		norte = new JPanel();
		centro = new JPanel();
		sur = new JPanel();
		numeroC = new JTextField(20);
		resultado = new JTextField(40);

		// Bloque

		JLabel etiquetaCDB = new JLabel("Ingrese el número a comprobar");
		etiquetaCDB.setHorizontalAlignment(getWidth());
		JButton enviar = new JButton("Enviar");
		JLabel etiquetaDividendo = new JLabel("Número Entero");
		numeroC.setHorizontalAlignment(numeroC.CENTER);


		resultado.setHorizontalAlignment(resultado.CENTER);
		resultado.setEditable(false);
		centro.setLayout(new GridLayout(5, 1));

		// add's
		norte.add(etiquetaCDB);
		centro.add(etiquetaDividendo);
		centro.add(numeroC);
		sur.add(enviar);

		add(norte, BorderLayout.NORTH);
		add(centro, BorderLayout.CENTER);
		add(sur, BorderLayout.SOUTH);
		
		//Acciones
		enviar.addActionListener(guardar);
	}

	private class Capturar implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			String cNumero = "";

			try {
				cNumero = numeroC.getText().trim();
				int nNumero = Integer.parseInt(cNumero);
				int length = cNumero.length();
				
				if (nNumero < 2) {
					throw new EmptyStackException();
				}
				
				resultado.setText(sith3.EnviarDatosDivisores(nNumero));
				JOptionPane.showMessageDialog(null, resultado);
				numeroC.setText(null);
				
			} catch (Exception w) {
				JOptionPane.showMessageDialog(null, "Valor incorrecto, por favor, intentelo de nuevo");
				numeroC.setText(null);
				resultado.setText(null);
			}

		}

	}

}
