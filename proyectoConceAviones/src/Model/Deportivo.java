package Model;
/**
 * 
 * @author Javier Franco
 * Esta es la clase Deportivo que proviene de la clase programada con anterioridad Coche donde 
 * tambien se guardara tanto el modelo, marca y descuento del cliente.
 * Para guardar tanto el modelo como el marca se guardan medienate una clase y el descuento mediante otra clase
 * finalmente con el metodo toString convertiremos el descuento en un objeto
 *
 */
public class Deportivo extends Coche {
	private double descuento;

	public Deportivo(String modelo, String marca, double descuento) {
		super(modelo, marca);
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
		return "Deportivo descuento=" + descuento + "%";
	}


	
}
	


