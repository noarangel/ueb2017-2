package integracion;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;

public class UsuarioDAO implements InterfaceDAO {

	private Path rutaUsuarios = FileSystems.getDefault().getPath("archivos", "UsersLogin.txt");
	private ConexionLoginUsuario conexion;
	private BufferedReader br;
	private PrintWriter pw;
	private UsuarioDTO usuario;

	public ArrayList<UsuarioDTO> leerArchivo() {

		String[] datos;
		String linea = "";
		ArrayList<UsuarioDTO> arrayList = null;

		try {
			conexion = new ConexionLoginUsuario(rutaUsuarios.toAbsolutePath().toString());
			arrayList = new ArrayList<UsuarioDTO>();
			br = conexion.getConexionLeer();
			while ((linea = br.readLine()) != null) {

				datos = linea.split(";");
				usuario = new UsuarioDTO(datos[0], datos[1]);
				arrayList.add(usuario);
			}
			conexion.cerrarConexiones();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return arrayList;
	}

	public void escribirArchivo(Object obj) {

		usuario = (UsuarioDTO) obj;
		try {
			conexion = new ConexionLoginUsuario(rutaUsuarios.toAbsolutePath().toString());
			pw = conexion.setArchivo();
			pw.println(usuario.getUsuario() + ";" + usuario.getClave());
			conexion.cerrarConexiones();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
