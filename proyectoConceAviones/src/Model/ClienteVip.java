package Model;
/**
 * 
 * Esta clase representa un cliente de tipo vip, es decir es cliente normal pero con un descuento vip. Por lo cual 
 * hereda de la clase Cliente. Por ultimo el toString nos muestra todos los datos del cliente VIP.
 * @author Jaime de Mora
 */
public class ClienteVip extends Cliente {
	private double descuento;

	public ClienteVip(String nombre, String correo, double descuento) {
		super(nombre, correo);
		this.descuento = descuento;
	}
	public double getDescuento() {
		return descuento;
	}
/**
 * @return toString muestra todos los datos del cliente VIP.
 */
	@Override
	public String toString() {
		return "ClienteVip descuento=" + descuento + "%";
	}


	
}
	


