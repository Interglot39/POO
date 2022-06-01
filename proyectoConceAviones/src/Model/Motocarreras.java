package Model;
/**
 * Nos encontramos en la motocarreras que proviene de la moto normal  donde guardaremos el modelo, precio y el incremento de precio
 * de este tipo de moto mas exclusiva
 * @author Javier Franco
 *
 */
public class Motocarreras extends Moto {
	private double incrementoPrecio;

	public Motocarreras(String modelo, boolean online, double precio, double incrementoPrecio) {
		super(modelo, online, precio);
		this.incrementoPrecio = incrementoPrecio;
	}
	/**
	 * Con el toString convertiremos el incremento de precio en objeto al ser la motocarreras una moto mas cara
	 * 
	 */

	@Override
	public String toString() {
		return "Motocarreras incrementoPrecio =" + incrementoPrecio + " ";
	}
	

}
