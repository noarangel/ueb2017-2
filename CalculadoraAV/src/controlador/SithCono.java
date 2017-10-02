package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import entidad.Cono;
import fachada.FachadaCalculadora;
import vista.GuiCono;

public class SithCono implements ActionListener{
	private GuiCono vCono;
	private Cono conoI, conoF;
	private FachadaCalculadora fachada;
	
	public SithCono(GuiCono cPCono) {
		this.vCono = cPCono;
		this.conoI = new Cono();
		this.vCono.iBotones.boton1.addActionListener(this);
		this.vCono.iBotones.boton2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object botonPulsado = e.getSource();
		
		if(botonPulsado == vCono.iBotones.boton1) {
			int banderaF = 0;
			this.conoI = this.getCono(banderaF);
			this.fachada = new FachadaCalculadora(this.conoI, 1);
			this.conoF = this.fachada.getResultadoCono();
			JOptionPane.showMessageDialog(null, Double.toString(conoF.getRespuesta()));
		}
		
		if (botonPulsado == vCono.iBotones.boton2) {
			int banderaF = 1;
			this.conoI = this.getCono(banderaF);
			this.fachada = new FachadaCalculadora(this.conoI, 1);
			this.conoF = this.fachada.getResultadoCono();
			JOptionPane.showMessageDialog(null, Double.toString(conoF.getRespuesta()));
		}		
		
	}
	
	public Cono getCono(int aBandera) {
		int vBandera = aBandera;
		this.conoI.setRadio(Double.parseDouble(this.vCono.cElementos.campo1.getText()));
		this.conoI.setAltura(Double.parseDouble(this.vCono.cElementos.campo2.getText()));
		this.conoI.setBandera(vBandera);
		return this.conoI;
	}
}
