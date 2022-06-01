
package Controller;

import Model.RepositorioClienteFile;
import View.UtilCMD;
import View.VClienteLeer;

/**
 *
 * @author tatom
 */
public class CClienteLeer {
       private VClienteLeer val;
       private  RepositorioClienteFile repositorio;
       public CClienteLeer(VClienteLeer val){
       super();
       this.val=val;
       repositorio = new RepositorioClienteFile();

}
    public void read() {
		val.Salida=(UtilCMD.listar("Cliente", repositorio.read()));
		

	}
}
