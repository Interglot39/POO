
package Controller;

import Model.RepositorioAficionadoFile;
import View.UtilCMD;
import View.VAficionadoLeer;

/**
 *
 * @author tatom
 */
public class CAficionadoLeer {
       private VAficionadoLeer val;
       private  RepositorioAficionadoFile repositorio;
       public CAficionadoLeer(VAficionadoLeer val){
       super();
       this.val=val;
       repositorio = new RepositorioAficionadoFile();

}
    public void read() {
		val.Salida=(UtilCMD.listar("Aficionado", repositorio.read()));
		

	}
}
