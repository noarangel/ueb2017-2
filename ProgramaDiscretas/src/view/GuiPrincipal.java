package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.text.JTextComponent;

public class GuiPrincipal extends JFrame {

	private LienzoP opciones;
	private JPanel dinamico;

	public GuiPrincipal() {

		// Especificaciones de la ventana
		Toolkit screenU = Toolkit.getDefaultToolkit();
		Dimension screenSize = screenU.getScreenSize();
		
		int heightMyScreen = screenSize.height;
		int widthMyScreen = screenSize.width;
		
		setBounds(400, 200, widthMyScreen / 2, heightMyScreen / 2);
		setTitle("Pagina Principal");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Lienzos
		opciones = new LienzoP();
		dinamico = new JPanel(new BorderLayout());
		JLabel text1 = new JLabel("Seleccione una opción", (int) CENTER_ALIGNMENT);
		
		add(text1, BorderLayout.NORTH);
		add(opciones, BorderLayout.WEST);

		setVisible(true);
	}

	class LienzoP extends JPanel implements ActionListener {

		JButton udc = new JButton("Unidades, decenas, centenas");
		JButton divisor = new JButton("División exacta e inexacta");
		JButton divisores = new JButton("Determinar si un número es primo");
		JButton mcd = new JButton("Máximo común divisor (algoritmo Euclidiano)");
		JButton mcm = new JButton("Mínimo común múltiplo");
		JButton conversorBD = new JButton("Convertir de binario a decimal");
		JButton conversorDB = new JButton("Convertir de decimal a binario");
		JButton sumaB = new JButton("Suma de binarios");

		public LienzoP() {

			setLayout(new GridLayout(1, 2));
			JPanel opcionesL = new JPanel(new BorderLayout());
			opcionesL.setLayout(new GridLayout(8, 1, 20, 0));
			
			opcionesL.add(udc);
			opcionesL.add(divisor);
			opcionesL.add(divisores);
			opcionesL.add(mcd);
			opcionesL.add(mcm);
			opcionesL.add(conversorBD);
			opcionesL.add(conversorDB);
			opcionesL.add(sumaB).setEnabled(false);
			
			add(opcionesL);
			
			udc.addActionListener(this);
			divisor.addActionListener(this);
			divisores.addActionListener(this);
			mcd.addActionListener(this);
			mcm.addActionListener(this);
			conversorBD.addActionListener(this);
			conversorDB.addActionListener(this);

		}

		public void actionPerformed(ActionEvent e) {

			Object botonPulsado = e.getSource();

			if (botonPulsado == udc) {
				dinamico.removeAll();
				GuiUniDecCen decenasCU = new GuiUniDecCen();
				dinamico.add(decenasCU);
				this.add(dinamico, BorderLayout.CENTER);
				dinamico.updateUI();
			}
			
			if (botonPulsado == divisor) {
				dinamico.removeAll();
				GuiDivisionEI divisor = new GuiDivisionEI();
				dinamico.add(divisor);
				this.add(dinamico, BorderLayout.CENTER);
				dinamico.updateUI();
				
			}
			
			if(botonPulsado == divisores) {
				dinamico.removeAll();
				GuiDivisores divs = new GuiDivisores();
				dinamico.add(divs);
				this.add(dinamico, BorderLayout.CENTER);
				dinamico.updateUI();
				
			}
			
			if (botonPulsado == mcd) {
				dinamico.removeAll();
				GuiEuclidiano mcdEu = new GuiEuclidiano();
				dinamico.add(mcdEu);
				this.add(dinamico, BorderLayout.CENTER);
				dinamico.updateUI();

			}
			
			if (botonPulsado == mcm) {
				dinamico.removeAll();
				GuiMinimoCM minimoCM = new GuiMinimoCM();
				dinamico.add(minimoCM);
				this.add(dinamico, BorderLayout.CENTER);
				dinamico.updateUI();
			}
			
			if (botonPulsado == conversorBD) {
				dinamico.removeAll();
				GuiBinToDec decimalBoI = new GuiBinToDec();
				dinamico.add(decimalBoI);
				this.add(dinamico, BorderLayout.CENTER);
				dinamico.updateUI();				
			}
			
			if (botonPulsado == conversorDB) {
				dinamico.removeAll();
				GuiDecToBin decimalToB = new GuiDecToBin();
				dinamico.add(decimalToB);
				this.add(dinamico, BorderLayout.CENTER);
				dinamico.updateUI();
				
			}
		}
	}

	class LienzoPB extends JPanel {

		public LienzoPB() {
			setSize(1, 1);
		}

	}

}