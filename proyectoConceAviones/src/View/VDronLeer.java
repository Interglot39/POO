
package View;
import Controller.CDronLeer;
/**
 *
 * @author Ismael Boautman
 */
public class VDronLeer {
     private CDronLeer cal;
     public String Salida;
     public void read() {
		System.out.println(Salida);
		

	}
    public VDronLeer(){
      cal= new CDronLeer(this);
      cal.read();
}

}
