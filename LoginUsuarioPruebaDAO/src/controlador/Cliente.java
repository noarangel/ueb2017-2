package controlador;

import java.io.BufferedReader;
import java.util.ArrayList;

import integracion.CuentaDAO;
import integracion.CuentaDTO;
import integracion.UsuarioDAO;
import integracion.UsuarioDTO;

public class Cliente {
	
	private UsuarioDAO dao;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UsuarioDAO dao= new UsuarioDAO();
		ArrayList<UsuarioDTO> usuarios= null;
		UsuarioDTO usuario= null;
		CuentaDAO daoC= new CuentaDAO();
		ArrayList<CuentaDTO> cuentas= null;
		CuentaDTO cuenta= null;
		try{
			usuarios= new ArrayList<UsuarioDTO>();
			usuarios=dao.leerArchivo();
			for(int i=0; i< usuarios.size(); i++){
				
				System.out.println("USUARIO="+usuarios.get(i).getUsuario()+" CLAVE= "+usuarios.get(i).getClave());
			}
			
			usuario = new UsuarioDTO("WWWW","0000");
			dao.escribirArchivo(usuario);
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		try{
			cuentas = new ArrayList<CuentaDTO>();
			cuentas =daoC.leerArchivo();
			
			for(int i=0; i< cuentas.size(); i++){

				System.out.println("USUARIO= "+cuentas.get(i).getUsuario()+" CUENTA= "+cuentas.get(i).getnCuenta() + " SALDO= " + cuentas.get(i).getSaldo());
			}
			
			cuenta = new CuentaDTO("WWWW","xxxxxxx","50000000");
			daoC.escribirArchivo(cuenta);
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
		

}
