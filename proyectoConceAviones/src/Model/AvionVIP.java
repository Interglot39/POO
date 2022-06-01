package Model;
/**
 * En esta clase nos encontramos un avion VIp el cual hereda de la clase AvionNormal y simplemente tiene un 
 * plus de precio debido a que es VIP.
 * @author Jaime de Mora
 *
 */
public class AvionVIP extends AvionNormal {
	private double incrementoPrecio;

	public AvionVIP(String nombre, boolean vuelosInternacionales, double precio, double incrementoPrecio) {
		super(nombre, vuelosInternacionales, precio);
		this.incrementoPrecio = incrementoPrecio;
	}
	/**
	 * @return toString muestra caracteristicas propias de los objetos y no heredadas. 
	 * 
	 */

	@Override
	public String toString() {
		return "AvionVIP incrementoPrecio =" + incrementoPrecio + " ";
	}
	

}
