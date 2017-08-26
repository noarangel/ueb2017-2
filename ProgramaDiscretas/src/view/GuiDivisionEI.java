package view;

import controller.DarthVader;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EmptyStackException;
import javax.swing.*;

public class GuiDivisionEI extends JPanel {

	private DarthVader sith2;
	private JPanel norte, centro, sur;
	private JTextField dividendo;
	private JTextField divisor;
	private JTextField resultado;
	private Capturar guardar;

	public GuiDivisionEI() {

		this.setLayout(new BorderLayout());

		// Instancias
		sith2 = new DarthVader();
		guardar = new Capturar();
		norte = new JPanel();
		centro = new JPanel();
		sur = new JPanel();
		dividendo = new JTextField(5);
		divisor = new JTextField(5);
		resultado = new JTextField(40);

		// Bloque

		JLabel etiquetaDiv = new JLabel("Ingrese El dividendo y el divisor");
		etiquetaDiv.setHorizontalAlignment(getWidth());
		JButton enviar = new JButton("Enviar");
		JLabel etiquetaDividendo = new JLabel("Ingrese el dividendo");
		dividendo.setHorizontalAlignment(dividendo.CENTER);
		JLabel etiquetaDivisor = new JLabel("Ingrese el divisor");
		divisor.setHorizontalAlignment(divisor.CENTER);

		resultado.setHorizontalAlignment(resultado.CENTER);
		resultado.setEditable(false);
		
		centro.setLayout(new GridLayout(5, 1));

		// add's
		norte.add(etiquetaDiv);
		centro.add(etiquetaDividendo);
		centro.add(dividendo);
		centro.add(etiquetaDivisor);
		centro.add(divisor);
		sur.add(enviar);

		add(norte, BorderLayout.NORTH);
		add(centro, BorderLayout.CENTER);
		add(sur, BorderLayout.SOUTH);
		
		//Acciones
		enviar.addActionListener(guardar);
	}

	private class Capturar implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			String cDividendo = "";
			String cDivisor ="";

			try {
				cDividendo = dividendo.getText().trim();
				cDivisor = divisor.getText().trim();
				
				int nDividendo = Integer.parseInt(cDividendo);
				int nDivisor = Integer.parseInt(cDivisor);


			if (nDividendo < nDivisor) {
				throw new EmptyStackException();
					
			} else 	if((nDividendo == 0) || (nDivisor == 0)) {
					throw new EmptyStackException();
				
					}
			
				resultado.setText(sith2.enviarDatosDivisor(nDividendo, nDivisor));
				JOptionPane.showMessageDialog(null, resultado);
				dividendo.setText(null);
				divisor.setText(null);

			} catch (Exception w) {
				JOptionPane.showMessageDialog(null, "Valor incorrecto, por favor, intentelo de nuevo");
				dividendo.setText(null);
				divisor.setText(null);
				resultado.setText(null);
			}

		}

	}

}
