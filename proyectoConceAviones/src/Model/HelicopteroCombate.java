package Model;
/**
 * Nos encontramos en la Helicoptero VIP que proviene de la Helicoptero normal  donde guardaremos el Marca, precio y el incremento de precio
 * de este tipo de Helicoptero mas letal
 * @author Ismael Bouatman
 *
 */
public class HelicopteroCombate extends Helicoptero {
	private double incrementoPrecio;

	public HelicopteroCombate(String Marca, boolean online, double precio, double incrementoPrecio) {
		super(Marca, online, precio);
		this.incrementoPrecio = incrementoPrecio;
	}
	/**
	 * Con el toString convertiremos el incremento de precio en objeto al ser la Helicoptero VIP una Helicoptero mas cara
	 * 
	 */

	@Override
	public String toString() {
		return "HelicopteroCombate incrementoPrecio =" + incrementoPrecio + " ";
	}
	

}
