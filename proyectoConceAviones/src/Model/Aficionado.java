package Model;

import java.io.Serializable;
/**
 * Clase aficionado donde se guardara tanto el nombre del cliente como su correo electronico, tambien
 * programamos una clase para el descuento que tendra tanto la clase Aficionado y la clase AficionadoAbonado
 * Para guardar tanto el nombre como el correo se guardan medienate una clase y el descuento mediante otra clase
 * finalmente con el metodo toString convertiremos el nombre y correo en un objeto
 * @author Santiago Moreno
 *
 */
public class Aficionado implements Serializable {
	protected String nombre;
	protected String correo;
	public Aficionado(String nombre, String correo) {
		super();
		this.nombre = nombre;
		this.correo = correo;
	}
	/**
	 * Cramos el descuento
	 * @return
	 */
	public double getDescuento() {
		return 0;
	}
	/**
	 * Con el toStirng convertimos nombre y correo en objeto
	 */
	@Override
	public String toString() {
		return "Aficionado nombre = " + nombre + ", correo = " + correo + " ";
	}
	
}
