
package View;
import Controller.CCocheLeer;
/**
 *
 * @author Javier Franco 
 */
public class VCocheLeer {
     private CCocheLeer cal;
     public String Salida;
     public void read() {
		System.out.println(Salida);
		

	}
    public VCocheLeer(){
      cal= new CCocheLeer(this);
      cal.read();
}

}
