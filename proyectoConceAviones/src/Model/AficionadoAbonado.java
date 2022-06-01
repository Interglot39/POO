package Model;
/**
 * 
 * @author Santiago Moreno
 * Esta es la clase AficionadoAbonado que proviene de la clase programada con anterioridad Aficionado donde 
 * tambien se guardara tanto el nombre, correo y descuento del cliente.
 * Para guardar tanto el nombre como el correo se guardan medienate una clase y el descuento mediante otra clase
 * finalmente con el metodo toString convertiremos el descuento en un objeto
 *
 */
public class AficionadoAbonado extends Aficionado {
	private double descuento;

	public AficionadoAbonado(String nombre, String correo, double descuento) {
		super(nombre, correo);
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
		return "AficionadoAbonado descuento=" + descuento + "%";
	}


	
}
	


