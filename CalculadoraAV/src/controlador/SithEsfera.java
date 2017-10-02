package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import entidad.Esfera;
import vista.GuiEsfera;
import fachada.FachadaCalculadora;

public class SithEsfera implements ActionListener {

	private Esfera esferaI, esferaF;
	private GuiEsfera vEsfera;
	private FachadaCalculadora fachada;

	public SithEsfera(GuiEsfera cPEsfera) {
		this.vEsfera = cPEsfera;
		this.esferaI = new Esfera();
		this.vEsfera.iBotones.boton1.addActionListener(this);
		this.vEsfera.iBotones.boton2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		Object botonPulsado = e.getSource();

		if (botonPulsado == vEsfera.iBotones.boton1) {
			int banderaF = 0;
			this.esferaI = this.getEsfera(banderaF);
			this.fachada = new FachadaCalculadora (esferaI, 3);
			this.esferaF = fachada.getResultadoEsfera();
			JOptionPane.showMessageDialog(null, Double.toString(esferaF.getRespuesta()));
			

		}

		if (botonPulsado == vEsfera.iBotones.boton2) {
			int banderaF = 1;
			this.esferaI = this.getEsfera(banderaF);
			this.fachada = new FachadaCalculadora (esferaI, 3);
			this.esferaF = fachada.getResultadoEsfera();
			JOptionPane.showMessageDialog(null, Double.toString(esferaF.getRespuesta()));
		}

	}
	
	public Esfera getEsfera (int aBandera) {
		this.esferaI.setRadio(Double.parseDouble(vEsfera.campo1.getText()));
		this.esferaI.setBandera(aBandera);
		return this.esferaI;
		
	}

}
