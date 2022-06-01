package Controller;
import Model.IRepositorio;
import Model.Dron;
import Model.DronEspia;
import Model.RepositorioDronFile;
import View.UtilCMD;
import View.VDronCrear;
public class CDronCrear {
	private IRepositorio repositorio;
	private VDronCrear vac;
	public CDronCrear(VDronCrear vac) {
		super();
		this.vac = vac;
		repositorio = new RepositorioDronFile();
	}
    	public boolean create() {
		vac.Marca = UtilCMD.leerCadena("Introduce un Marca:");
		vac.Modelo = UtilCMD.leerCadena("Introduce un Modelo: ");
		 vac.descuento = UtilCMD.leerCodigoDouble("Introduce un descuento: ");
		Dron a = (vac.descuento > 0) ? new DronEspia(vac.Marca, vac.Modelo, vac.descuento) : new Dron(vac.Marca, vac.Modelo);
		boolean bret = repositorio.create(a);
		return bret;
	}

}
