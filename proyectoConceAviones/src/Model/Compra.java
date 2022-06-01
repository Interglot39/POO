package Model;
/**
 * En esta seccion el codigo hecho tendra como tarea la de almacenenar y administrar los datos de 
 * de las compras. Tendremos funciones las cuales nos ayudaran a calcular precios de compras finales y 
 * mostrar los datos de la clase.
 * @author Jaime de Mora
 *
 */
public class Compra {
	private Cliente Cliente;
	private AvionNormal AvionNormal;
	
	public Compra(Cliente cliente, AvionNormal avionNormal) {
		super();
		Cliente = cliente;
		AvionNormal = avionNormal;
	}
/**
 * Utilizaremos la clases aviones para recibir datos del precio del mismo y si fuese
 * cliente vip aplicarle el descuento correspondiente.
 * @return
 */
	public double precioFinal() {
		return AvionNormal.getPrecio()*(1-Cliente.getDescuento());
	}
/**
 * Parametros a un String para mostrar los datos de la compra.
 */
	@Override
	public String toString() {
		return "Compra [Cliente = " + Cliente + ", AvionNormal = " + AvionNormal + " ] precio = " + precioFinal();
	}
	
}
