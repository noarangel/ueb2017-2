package negocio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import presentacion.ConversosUnidades;

public class ControladorConversor implements ActionListener{

	private ConversosUnidades vistaUnidades;
	private Cantidad cantidadInicial;
	private Cantidad cantidadFinal;
	private FachadaConversor fachada;
	
	
	public ControladorConversor(ConversosUnidades vista, Cantidad entidad ){
		
		this.cantidadInicial=entidad;
		this.vistaUnidades=vista;
		vistaUnidades.convertir.addActionListener(this);
	}
	

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
				
		cantidadInicial.setUnidad(vistaUnidades.unidadOrigen.getSelectedIndex());
		cantidadInicial.setValor(Double.parseDouble(vistaUnidades.valorOrigen.getText()));
		fachada = new FachadaConversor(cantidadInicial);
		cantidadFinal=fachada.Convertir();
		vistaUnidades.valorDestino.setText(String.valueOf(cantidadFinal.getValor()));
		if(cantidadFinal.getUnidad()==0){
			vistaUnidades.unidadDestino.setText("M");
		}else{
			vistaUnidades.unidadDestino.setText("KM");
		}
		
	
		
	}
	
	
	
	
}
