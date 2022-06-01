package Model;
/**
 * 
 * @author Ismael Bouatman
 * Esta es la clase DronEspia que proviene de la clase Dron (extends)
 * Tambien se guardara tanto la  Marca, Modelo y descuento del DronEspia.
 * Para guardar tanto la Marca como el Modelo se guardan medienate una clase y el descuento mediante otra clase
 * 
 *
 */
public class DronEspia extends Dron {
	private double descuento;

	public DronEspia(String Marca, String Modelo, double descuento) {
		super(Marca, Modelo);
		this.descuento = descuento;
	}
	public double getDescuento() {
		return descuento;
	}
/**
 * Convertimos con el toString descuento en objeto
 */
	@Override
	public String toString() {
		return "DronEspia descuento=" + descuento + "%";
	}


	
}
	


