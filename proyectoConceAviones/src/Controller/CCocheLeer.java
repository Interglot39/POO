
package Controller;

import Model.RepositorioCocheFile;
import View.UtilCMD;
import View.VCocheLeer;

/**
 *
 * @author Javier Franco
 */
public class CCocheLeer {
       private VCocheLeer val;
       private  RepositorioCocheFile repositorio;
       public CCocheLeer(VCocheLeer val){
       super();
       this.val=val;
       repositorio = new RepositorioCocheFile();

}
    public void read() {
		val.Salida=(UtilCMD.listar("Coche", repositorio.read()));
		

	}
}
