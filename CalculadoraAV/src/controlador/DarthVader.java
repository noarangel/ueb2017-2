package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.VistaCalculadora;
import vista.GuiCono;
import vista.GuiCubo;
import vista.GuiEsfera;

public class DarthVader implements ActionListener{
	
	private VistaCalculadora vistaP;
	private GuiCono vCono;
	private GuiCubo vCubo;
	private GuiEsfera vEsfera;
	
	public DarthVader(VistaCalculadora eVista) {
		this.vistaP = eVista;	
		this.vCono = new GuiCono();
		this.vCubo = new GuiCubo();
		this.vEsfera = new GuiEsfera();
		this.vistaP.boton1.addActionListener(this);
		this.vistaP.boton2.addActionListener(this);
		this.vistaP.boton3.addActionListener(this);
	}
	
	
	
	public void actionPerformed(ActionEvent e) {

		Object botonPulsado = e.getSource();
		
		if(botonPulsado == this.vistaP.boton1) {
			//System.out.println("funciono");
			this.vCono = new GuiCono();
			this.vistaP.dinamico.removeAll();
			this.vistaP.dinamico.add(vCono);
			this.vistaP.dinamico.setBounds(2, 50, this.vistaP.widthMyScreen / 4, this.vistaP.heightMyScreen / 5);
			this.vistaP.add(this.vistaP.dinamico);
			this.vistaP.dinamico.updateUI();
			SithCono sCono = new SithCono(vCono);
		}
		
		if(botonPulsado == this.vistaP.boton2) {
			this.vCubo = new GuiCubo();
			this.vistaP.dinamico.removeAll();
			this.vistaP.dinamico.add(vCubo);
			this.vistaP.dinamico.setBounds(2, 80, this.vistaP.widthMyScreen / 4, this.vistaP.heightMyScreen / 5);
			this.vistaP.add(this.vistaP.dinamico);
			this.vistaP.dinamico.updateUI();
			SithCubo sCubo = new SithCubo(vCubo);
		}
		
		if(botonPulsado == this.vistaP.boton3) {
			this.vEsfera = new GuiEsfera();
			this.vistaP.dinamico.removeAll();
			this.vistaP.dinamico.add(vEsfera);
			this.vistaP.dinamico.setBounds(2, 80, this.vistaP.widthMyScreen / 4, this.vistaP.heightMyScreen / 5);
			this.vistaP.add(this.vistaP.dinamico);
			this.vistaP.dinamico.updateUI();
			SithEsfera sEsfera= new SithEsfera(vEsfera);
		}
		
		
	}
	
	
}
