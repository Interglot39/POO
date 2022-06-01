package Model;
import Model.*;
/**
 * En esta parte de nuestro Proyecto Concesionario programaremos la parte de las motos, empezando por la clase 
 * de la cual partira el otro tipo de motos(Motocarreras) donde guardaremos el modelo, precio, y online de las
 * motos, para finalmente por el metodo toString convertir todo lo anterior en objeto.
 * @author Javier Franco
 *
 */
public class Moto {
	protected String modelo;
	protected boolean online;
	protected double precio;
	public Moto(String modelo, boolean online, double precio) {
		super();
		this.modelo = modelo;
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
	 * Con el toString convertimos modelo, online y precio en objetos
	 */
	@Override
	public String toString() {
		return "Moto modelo= " + modelo + ", online=" + online + ", precio=" + precio ;
	}
	

}
