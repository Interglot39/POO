package View;
import Model.*;

/**
 * @author Jaime de Mora
 * 
 * Importamos las tres librerias de java que necesitamos para este codigo
 */
import java.io.*;
import java.util.Vector;
import java.util.List;

public class AccesoCMD {

	//Jaime
	private IRepositorio repositorioC;
	private IRepositorio repositorioA;
	private VCliente vcliente;
	private VAvionNormal vAvionNormal;
	private VCompra vCompra;
	//Ismael
	private IRepositorio repositorioD;
	private IRepositorio repositorioH;
	private VDron vDron;
	private VHelicoptero ventreda;
	private VCompra vcompra;



	public AccesoCMD() {
		//jaime
		repositorioC = new RepositorioClienteFile();
		repositorioA = new RepositorioAvion();
		vcliente = new VCliente();
		//Ismael
		repositorioD = new RepositorioDronFile();
		repositorioH = new RepositorioHelicoptero();
		vDron = new VDron();
	}

	public void buclePrincipal() {
		boolean menu = true;
		System.out.println("[1] Menu Cliente.");
		System.out.println("[2] Menu Dron.");
		System.out.println("[3] Menu compras.");
		System.out.println("[0] Salir.");
		int opcion;
		while (menu) {
			opcion = UtilCMD.leerCodigo("Elige una opcion: ");
			switch (opcion) {
			case 1:
				vcliente.menuCliente();
				break;
			case 2:
				vDron.menuDron();
				break;
			case 3:

				break;
			case 0:
				menu = true;
				break;
			default:
				System.out.println("Elije una opcion valida");

			}
		}
	}

}
