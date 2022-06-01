
package View;
import Controller.CClienteLeer;
/**
 *
 * @author tatom
 */
public class VClienteLeer {
      private CClienteLeer cal;
      public String Salida;
      public void read() {
        System.out.println(Salida);
  }
    public VClienteLeer(){
        cal = new CClienteLeer(this);
        cal.read();
    }

}
