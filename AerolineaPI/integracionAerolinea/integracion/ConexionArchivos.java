package integracion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class ConexionArchivos {

	// Atributos

	private String ruta;
	private File f;
	private FileReader fr;
	private BufferedReader br;
	private FileWriter fw;
	private PrintWriter pw;

	// Constructores
	public ConexionArchivos() {

	}

	public ConexionArchivos(String aPath) {
		this.ruta = aPath;
		this.existFile();
	}

	// Metodos
	public boolean existFile() {
		boolean bandera = true;

		File f = new File(ruta);
		if (!f.isDirectory()) {
			f.getParentFile().mkdirs();
			bandera = false;
		}
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			bandera = false;
		}
		return bandera;
	}

	public BufferedReader getConexionLeer() {
		try {
			f = new File(ruta);
			fr = new FileReader(f);
			br = new BufferedReader(fr);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return br;
	}

	public PrintWriter setArchivo() {

		try {
			fw = new FileWriter(ruta, true);
			pw = new PrintWriter(fw);
		} catch (Exception w) {
			w.printStackTrace();
		}
		return pw;
	}

	public void cerrarConexiones() throws IOException {
		if (this.br != null) {
			this.br.close();
		}

		if (this.pw != null) {
			this.pw.close();
		}
	}

}
