package integracion;

public class CuentaDTO {

	// Atributos
	private String usuario, nTicket, nVuelo;

	// Constructores

	public CuentaDTO() {

	}

	public CuentaDTO(String aUsuario, String aNTicket, String aVuelo) {
		this.usuario = aUsuario;
		this.nTicket = aNTicket;
		this.nVuelo = aVuelo;
	}

	// Getter's y Setter's
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getnCuenta() {
		return nTicket;
	}

	public void setnCuenta(String nTicket) {
		this.nTicket = nTicket;
	}

	public String getSaldo() {
		return nVuelo;
	}

	public void setSaldo(String nVuelo) {
		this.nVuelo = nVuelo;
	}

}
