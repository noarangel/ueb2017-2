package integracion;

public class UsuarioDTO {
	
	// Atributos
	
	private String usuario, clave;
	
	// Constructores
	
	public UsuarioDTO(){
		
	}	
	public UsuarioDTO (String aUsuario, String aClave){
		this.usuario = aUsuario;
		this.clave = aClave;		
	}
	
	// Getter´s y Setter´s
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
}
