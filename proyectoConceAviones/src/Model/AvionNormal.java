package Model;
import Model.*;
/**
 * En esta parte del Proyecto es donde crearemos las clases avion donde guardaremos parametros como nombre, precio y vuelos internacions
 * aparte tenemos metodos para devolver el precio del avion y de mostrar la informacion con una funciona a string.
 * @author Jaime de Mora
 */
public class AvionNormal {
	protected String nombre;
	protected double precio;
	protected boolean vuelosInternacionales;
	public AvionNormal(String nombre, boolean vuelosInternacionales, double precio) {
		super();
		this.nombre = nombre;
		this.vuelosInternacionales = vuelosInternacionales;
		this.precio = precio;
	}
	/**
	 * UN getter del precio para devolver el precio del avion
	 * @return
	 */
	public double getPrecio() {
		return precio;
	}
	/**
	 * Metodo para mostrar todos los parametros el cual compone al objeto.
	 */
	@Override
	public String toString() {
		return "Avion Normal Nombre del Modelo = " + nombre + ", ¿Capacidad de Vuelos Internacionales?=" + vuelosInternacionales + ", Precio =" + precio ;
	}
	

}
