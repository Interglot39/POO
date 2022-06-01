package Model;
import Model.*;
/**
 * En esta parte de nuestro Proyecto Estadio programaremos la parte de las Helicopteros, empezando por la clase 
 * de la cual partira el otro tipo de Helicopteros(HelicopteroCombate) donde guardaremos el Marca, y precio
 *
 */
public class Helicoptero {
	protected String Marca;
	protected boolean online;
	protected double precio;
	public Helicoptero(String Marca, boolean online, double precio) {
		super();
		this.Marca = Marca;
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
	 * Con el toString convertimos Marca, online y precio en objetos
	 */
	@Override
	public String toString() {
		return "Helicoptero Marca= " + Marca + ", online=" + online + ", precio=" + precio ;
	}
	

}
