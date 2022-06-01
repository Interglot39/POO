package Model;

import java.io.Serializable;
/**
 * Clase Coche donde se guardara tanto el modelo del cliente como la marca del coche, tambien
 * programamos una clase para el descuento que tendra tanto la clase Coche y la clase Deportivo
 * Para guardar tanto el modelo como el marca se guardan medienate una clase y el descuento mediante otra clase
 * finalmente con el metodo toString convertiremos el modelo y marca en un objeto
 * @author Javier Franco
 *
 */
public class Coche implements Serializable {
	protected String modelo;
	protected String marca;
	public Coche(String modelo, String marca) {
		super();
		this.modelo = modelo;
		this.marca = marca;
	}
	/**
	 * Cramos el descuento
	 * @return
	 */
	public double getDescuento() {
		return 0;
	}
	/**
	 * Con el toStirng convertimos modelo y marca en objeto
	 */
	@Override
	public String toString() {
		return "Coche modelo = " + modelo + ", marca = " + marca + " ";
	}
	
}
