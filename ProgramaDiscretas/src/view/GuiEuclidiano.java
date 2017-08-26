package view;

import controller.DarthVader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EmptyStackException;
import javax.swing.*;

public class GuiEuclidiano extends JPanel{
	
	private DarthVader sith4;
	private JPanel norte, centro, sur;
	private JTextField numeroP;
	private JTextField numeroG;
	private JTextField resultado;
	private Capturar guardar;

	public GuiEuclidiano() {

		this.setLayout(new BorderLayout());

		// Instancias
		sith4 = new DarthVader();
		guardar = new Capturar();
		norte = new JPanel();
		centro = new JPanel();
		sur = new JPanel();
		numeroP = new JTextField(5);
		numeroG = new JTextField(5);
		resultado = new JTextField(40);

		// Bloque

		JLabel etiquetaDiv = new JLabel("Algoritmo Euclidiano \" M.C.D\"");
		etiquetaDiv.setHorizontalAlignment(getWidth());
		JButton enviar = new JButton("Enviar");
		JLabel etiquetaDividendo = new JLabel("Ingrese el número mayor");
		numeroG.setHorizontalAlignment(numeroP.CENTER);
		JLabel etiquetaDivisor = new JLabel("Ingrese el número menor");
		numeroP.setHorizontalAlignment(numeroG.CENTER);

		resultado.setHorizontalAlignment(resultado.CENTER);
		resultado.setEditable(false);
		
		centro.setLayout(new GridLayout(5, 1));

		// add's
		norte.add(etiquetaDiv);
		centro.add(etiquetaDividendo);
		centro.add(numeroG);
		centro.add(etiquetaDivisor);
		centro.add(numeroP);
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
				
				cDivisor = numeroP.getText().trim();
				cDividendo = numeroG.getText().trim();
			
				int nDivisor = Integer.parseInt(cDivisor);
				int nDividendo = Integer.parseInt(cDividendo);


			if (nDividendo < nDivisor) {
				throw new EmptyStackException();
					
			} else 	if((nDividendo == 0) || (nDivisor == 0)) {
					throw new EmptyStackException();
				
						}
				resultado.setText(sith4.enviarDatosEuclidiano(nDividendo, nDivisor));
				JOptionPane.showMessageDialog(null, resultado);
				numeroP.setText(null);
				numeroG.setText(null);

			} catch (Exception w) {
				JOptionPane.showMessageDialog(null, "Valor incorrecto, por favor, intentelo de nuevo");
				numeroP.setText(null);
				numeroG.setText(null);
				resultado.setText(null);
			}

		}

	}


}
