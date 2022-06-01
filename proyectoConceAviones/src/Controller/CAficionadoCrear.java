package Controller;
import Model.IRepositorio;
import Model.Aficionado;
import Model.AficionadoAbonado;
import Model.RepositorioAficionadoFile;
import View.UtilCMD;
import View.VAficionadoCrear;
public class CAficionadoCrear {
	private IRepositorio repositorio;
	private VAficionadoCrear vac;
	public CAficionadoCrear(VAficionadoCrear vac) {
		super();
		this.vac = vac;
		repositorio = new RepositorioAficionadoFile();
	}
    	public boolean create() {
		vac.nombre = UtilCMD.leerCadena("Introduce un nombre:");
		vac.correo = UtilCMD.leerCadena("Introduce un correo: ");
		 vac.descuento = UtilCMD.leerCodigoDouble("Introduce un descuento: ");
		Aficionado a = (vac.descuento > 0) ? new AficionadoAbonado(vac.nombre, vac.correo, vac.descuento) : new Aficionado(vac.nombre, vac.correo);
		boolean bret = repositorio.create(a);
		return bret;
	}

}
