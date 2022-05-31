package user;
import domain.*;
import java.io.*;
import repositorio.*;

/**
 * The Acceso class is class for writing all the code that will make the program work. With the Accesso class the idea is to create the different objets and
 * put them to work together to make a functional program.
 */

public class AccesoCMD {

	private BufferedReader br;
	private IRepositorio<Cliente> repositorioCliente;
	private IRepositorio<Producto> repositorioProducto;
	private IRepositorio<Empresa> repositorioEmpresa;
	private IRepositorio<Pedido> repositorioPedido;
	private VCliente vCliente;
	private VProducto vProducto;
	private VEmpresa vEmpresa;
	private VPedido vPedido;

	/**
	 * The Acesso constructor initializes the different repositories that will be used to run the program and using the C.R.U.D.S methodology . Also, the buffer is use to ask inputs in the terminal
	 * @throws IOException in case the parse goes wrong
	 */
	public AccesoCMD() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));

		repositorioCliente=new RepositorioClienteFile();
		vCliente= new VCliente(repositorioCliente);

		repositorioEmpresa=new RepositorioEmpresa();
		vEmpresa=new VEmpresa(repositorioEmpresa,repositorioCliente);

		repositorioProducto=new RepositorioProducto();
		vProducto= new VProducto(repositorioProducto,repositorioEmpresa,repositorioCliente);

		repositorioPedido=new RepositorioPedido();
		vPedido=new VPedido(repositorioPedido,repositorioCliente,repositorioProducto);

	}

	/**
	 * Funtion for displaying a basic Menu in the console, and letting the user choose what option he wants to use.
	 */
	public void buclePrincipal(){
		boolean salir = false;
		int opcion;
		int codigo, producto;
		while (!salir) {
			System.out.println("[1] Menu Cliente.");
			System.out.println("[2] Menu Productos.");
			System.out.println("[3] Menu Empresa.");
			System.out.println("[4] Menu Pedidos.");
			System.out.println("[0] Salir.");
			opcion = UtilCMD.leerEnteroPositivo("Elige una opcion: ");
			System.out.println("-------------------------");

			switch (opcion) {
				case 1:		vCliente.menuCliente();
							break;
				case 2:		vProducto.menuProducto();
							break;
				case 3:		vEmpresa.menuEmpresa();
							break;
				case 4:		vPedido.menuPedido();
							break;
				default:	salir = true;
			}
		}
	}

}
