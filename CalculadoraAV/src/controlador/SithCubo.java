package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import entidad.Cubo;
import vista.GuiCubo;
import fachada.FachadaCalculadora;

public class SithCubo implements ActionListener {
	private GuiCubo vCubo;
	private Cubo cuboI, cuboF;
	private FachadaCalculadora fachada;

	public SithCubo(GuiCubo cPCubo) {
		this.vCubo = cPCubo;
		this.cuboI = new Cubo();
		this.vCubo.iBotones.boton1.addActionListener(this);
		this.vCubo.iBotones.boton2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		Object botonPulsado = e.getSource();

		if (botonPulsado == vCubo.iBotones.boton1) {
			int banderaF = 0;
			this.cuboI = this.getCubo(banderaF);
			this.fachada = new FachadaCalculadora(this.cuboI, 2);
			this.cuboF = this.fachada.getResultadoCubo();
			JOptionPane.showMessageDialog(null, Double.toString(cuboF.getRespuesta()));
		}
		if (botonPulsado == vCubo.iBotones.boton2) {
			int banderaF = 1;
			this.cuboI = this.getCubo(banderaF);
			this.fachada = new FachadaCalculadora(this.cuboI, 2);
			this.cuboF = this.fachada.getResultadoCubo();
			JOptionPane.showMessageDialog(null, Double.toString(cuboF.getRespuesta()));
		}

	}

	public Cubo getCubo(int aBandera) {
		this.cuboI.setArista(Double.parseDouble(this.vCubo.campo1.getText()));
		this.cuboI.setBandera(aBandera);

		return this.cuboI;
	}

}
