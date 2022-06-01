
package View;
import Controller.CAficionadoLeer;
/**
 *
 * @author tatom
 */
public class VAficionadoLeer {
     private CAficionadoLeer cal;
     public String Salida;
     public void read() {
		System.out.println(Salida);
		

	}
    public VAficionadoLeer(){
      cal= new CAficionadoLeer(this);
      cal.read();
}

}
