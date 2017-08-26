package view;

import controller.DarthVader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EmptyStackException;
import javax.swing.*;

public class GuiDecToBin extends JPanel {
	
	private DarthVader sith7;
	private JPanel norte, centro, sur;
	private JTextField numeroC;
	private JTextField resultado;
	private Capturar guardar;

	public GuiDecToBin() {
		
		this.setLayout(new BorderLayout());

		// Instancias
		sith7 = new DarthVader();
		guardar = new Capturar();
		norte = new JPanel();
		centro = new JPanel();
		sur = new JPanel();
		numeroC = new JTextField(5);
		resultado = new JTextField(40);

		// Bloque

		JLabel etiquetaCDB = new JLabel("Ingrese el número decimal que desea convertir");
		etiquetaCDB.setHorizontalAlignment(getWidth());
		JButton enviar = new JButton("Enviar");
		JLabel etiquetaDividendo = new JLabel("Número decimal");
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
				
				if (nNumero < 0) {
					throw new EmptyStackException();
				}
				
				
				resultado.setText(sith7.enviarDatosDecToBin(nNumero));
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
