package Controller;
import Model.IRepositorio;
import Model.Coche;
import Model.Deportivo;
import Model.RepositorioCocheFile;
import View.UtilCMD;
import View.VCocheCrear;
public class CCocheCrear {
	private IRepositorio repositorio;
	private VCocheCrear vac;
	public CCocheCrear(VCocheCrear vac) {
		super();
		this.vac = vac;
		repositorio = new RepositorioCocheFile();
	}
    	public boolean create() {
		vac.modelo = UtilCMD.leerCadena("Introduce un modelo:");
		vac.marca = UtilCMD.leerCadena("Introduce un marca: ");
		 vac.descuento = UtilCMD.leerCodigoDouble("Introduce un descuento: ");
		Coche a = (vac.descuento > 0) ? new Deportivo(vac.modelo, vac.marca, vac.descuento) : new Coche(vac.modelo, vac.marca);
		boolean bret = repositorio.create(a);
		return bret;
	}

}
