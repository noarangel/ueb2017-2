package view;

import controller.DarthVader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EmptyStackException;
import javax.swing.*;

public class GuiBinToDec extends JPanel{

		private DarthVader sith6;
		private JPanel norte, centro, sur;
		private JTextField numeroC;
		private JTextField resultado;
		private Capturar guardar;

		public GuiBinToDec() {
			
			this.setLayout(new BorderLayout());

			// Instancias
			sith6 = new DarthVader();
			guardar = new Capturar();
			norte = new JPanel();
			centro = new JPanel();
			sur = new JPanel();
			numeroC = new JTextField(20);
			resultado = new JTextField(40);

			// Bloque

			JLabel etiquetaCDB = new JLabel("Ingrese el número Binario que desea convertir");
			etiquetaCDB.setHorizontalAlignment(getWidth());
			JButton enviar = new JButton("Enviar");
			JLabel etiquetaDividendo = new JLabel("Número Binario");
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
					
					if (nNumero < 0) {
						throw new EmptyStackException();
					}
					
//					for (int i = 0; i < length; i++) {
//						char pNumero = cNumero.charAt(i);
//						System.out.println(pNumero);	
//						if (pNumero == 1) {
//							
//						} else 
//							throw new EmptyStackException();
//					}
					
					resultado.setText(sith6.EnviarDatosBinToDec(cNumero));
					JOptionPane.showMessageDialog(null, resultado);
					numeroC.setText(null);
					
				} catch (Exception w) {
					w.printStackTrace();
					JOptionPane.showMessageDialog(null, "Valor incorrecto, por favor, intentelo de nuevo");
					numeroC.setText(null);
					resultado.setText(null);
				}

			}

		}
}
