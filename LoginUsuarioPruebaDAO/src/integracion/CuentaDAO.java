package integracion;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;

public class CuentaDAO implements InterfaceDAO {

	private Path rutaCuenta = FileSystems.getDefault().getPath("archivos", "cuenta_usuarios.txt");
	private ConexionLoginUsuario conexion;
	private BufferedReader br;
	private PrintWriter pw;
	private CuentaDTO cuenta;

	public ArrayList<CuentaDTO> leerArchivo() {
		String[] datos;
		String linea = "";
		ArrayList<CuentaDTO> arrayList = null;

		try {
			conexion = new ConexionLoginUsuario(rutaCuenta.toAbsolutePath().toString());
			arrayList = new ArrayList<CuentaDTO>();
			br = conexion.getConexionLeer();
			while ((linea = br.readLine()) != null) {
				datos = linea.split(";");
				cuenta = new CuentaDTO(datos[0], datos[1], datos[2]);
				arrayList.add(cuenta);
			}
			conexion.cerrarConexiones();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return arrayList;
	}

	public void escribirArchivo(Object obj) {

		cuenta = (CuentaDTO) obj;
		try {
			conexion = new ConexionLoginUsuario(rutaCuenta.toAbsolutePath().toString());
			pw = conexion.setArchivo();
			pw.println(cuenta.getUsuario() + ";" + cuenta.getnCuenta() + ";" + cuenta.getSaldo());
			conexion.cerrarConexiones();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void limpiarArchivo() {
		try {
			FileOutputStream writer = new FileOutputStream(rutaCuenta.toAbsolutePath().toString());
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
