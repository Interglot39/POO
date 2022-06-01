package Model;

import java.io.Serializable;
/**
 * En la clase cliente vamos a almacenar datos relevantes como el nombre del cliente y el correo. Aparte 
 * tendremos mas clases en otros archivos para definir los diferentes tipos de clientes
 * @author Jaime de Mora
 *
 */
public class Cliente implements Serializable {
	protected String nombre;
	protected String correo;
	public Cliente(String nombre, String correo) {
		super();
		this.nombre = nombre;
		this.correo = correo;
	}
	/**
	 * Al ser un cliente normal no tiene descuento alguno.
	 * @return
	 */
	public double getDescuento() {
		return 0;
	}
	/**
	 * @return toString en la misma linea de todas las clases, nos imprime por pantalla datos de la clase.
	 */
	@Override
	public String toString() {
		return "Nombre del Cliente " + nombre + ", Correo = " + correo + " ";
	}
	
}
