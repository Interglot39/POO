package Model;

import java.io.Serializable;
/**
 * 
 * @author Ismael Bouatman
 *
 */
/**
 * Esta clase contiene a las variables protegidas para que no haya modifiaciones en ellas
 * 
 */
public class Dron implements Serializable {
	
	protected String Marca;
	protected String Modelo;
	public Dron(String Marca, String Modelo) {
		super();
		this.Marca = Marca;
		this.Modelo = Modelo;
	}
	/**
	 * Cramos el descuento
	 * @return
	 */
	public double getDescuento() {
		return 0;
	}
	/**
	 * Con el toStirng convertimos Marca y Modelo en objeto
	 */
	@Override
	public String toString() {
		return "Dron Marca = " + Marca + ", Modelo = " + Modelo + " ";
	}
	
}
