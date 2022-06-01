package Controller;
import Model.IRepositorio;
import Model.Cliente;
import Model.ClienteVip;
import Model.RepositorioClienteFile;
import View.UtilCMD;
import View.VClienteCrear;
public class CClienteCrear {
	private IRepositorio repositorio;
	private VClienteCrear vac;
	public CClienteCrear(VClienteCrear vac) {
		super();
		this.vac = vac;
		repositorio = new RepositorioClienteFile();
	}
    	public boolean create() {
		vac.nombre = UtilCMD.leerCadena("Introduce un nombre:");
		vac.correo = UtilCMD.leerCadena("Introduce un correo: ");
		vac.descuento = UtilCMD.leerCodigoDouble("Introduce un descuento: ");
		Cliente a = (vac.descuento > 0) ? new ClienteVip(vac.nombre, vac.correo, vac.descuento) : new Cliente(vac.nombre, vac.correo);
		boolean bret = repositorio.create(a);
		return bret;
	}

}
