
package Controller;

import Model.RepositorioDronFile;
import View.UtilCMD;
import View.VDronLeer;

/**
 *
 * @author Ismael Boautman
 */
public class CDronLeer {
       private VDronLeer val;
       private  RepositorioDronFile repositorio;
       public CDronLeer(VDronLeer val){
       super();
       this.val=val;
       repositorio = new RepositorioDronFile();

}
    public void read() {
		val.Salida=(UtilCMD.listar("Dron", repositorio.read()));
		

	}
}
