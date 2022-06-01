package Model;
import Model.*;
/**
 * En esta parte de nuestro Proyecto Estadio programaremos la parte de las entradas, empezando por la clase 
 * de la cual partira el otro tipo de entradas(EntradaVIP) donde guardaremos el nombre, precio, y online de las
 * entradas, para finalmente por el metodo toString convertir todo lo anterior en objeto.
 * @author Santiago Moreno
 *
 */
public class EntradaNormal {
	protected String nombre;
	protected boolean online;
	protected double precio;
	public EntradaNormal(String nombre, boolean online, double precio) {
		super();
		this.nombre = nombre;
		this.online = online;
		this.precio = precio;
	}
	/**
	 * Programamos un double para conservar el precio de la compra
	 * @return
	 */
	public double getPrecio() {
		return precio;
	}
	/**
	 * Con el toString convertimos nombre, online y precio en objetos
	 */
	@Override
	public String toString() {
		return "EntradaNormal nombre= " + nombre + ", online=" + online + ", precio=" + precio ;
	}
	

}
