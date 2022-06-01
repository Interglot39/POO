package Model;
/**
 * Nos encontramos en la Entrada VIP que proviene de la Entrada normal  donde guardaremos el nombre, precio y el incremento de precio
 * de este tipo de entrada mas exclusiva
 * @author Santiago Moreno
 *
 */
public class EntradaVIP extends EntradaNormal {
	private double incrementoPrecio;

	public EntradaVIP(String nombre, boolean online, double precio, double incrementoPrecio) {
		super(nombre, online, precio);
		this.incrementoPrecio = incrementoPrecio;
	}
	/**
	 * Con el toString convertiremos el incremento de precio en objeto al ser la entrada VIP una entrada mas cara
	 * 
	 */

	@Override
	public String toString() {
		return "EntradaVIP incrementoPrecio =" + incrementoPrecio + " ";
	}
	

}
