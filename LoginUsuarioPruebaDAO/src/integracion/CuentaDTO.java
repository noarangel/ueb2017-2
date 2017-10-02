package integracion;

public class CuentaDTO {

	// Atributos
	private String usuario, nCuenta, saldo;

	// Constructores

	public CuentaDTO() {

	}

	public CuentaDTO(String aUsuario, String aNCuenta, String aSaldo) {
		this.usuario = aUsuario;
		this.nCuenta = aNCuenta;
		this.saldo = aSaldo;
	}

	// Getter's y Setter's
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getnCuenta() {
		return nCuenta;
	}

	public void setnCuenta(String nCuenta) {
		this.nCuenta = nCuenta;
	}

	public String getSaldo() {
		return saldo;
	}

	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}

}
