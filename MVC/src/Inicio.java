import negocio.Cantidad;
import negocio.ControladorConversor;
import presentacion.ConversosUnidades;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConversosUnidades vista = new ConversosUnidades();
		Cantidad entidad = new Cantidad();
		ControladorConversor controlador = new ControladorConversor(vista, entidad);

	}

}
