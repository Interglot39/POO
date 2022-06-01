package Model;
import java.util.List;
import java.util.Vector;

public class Repositorio implements IRepositorio {
	private List<Cliente> Cliente;
	private List<AvionNormal> AvionNormal;
	private List<Compra> Compra;

	/**
	 */
	public Repositorio() {
		Cliente = new Vector<>();
		AvionNormal = new Vector<>();
		Compra = new Vector<>();
		inicializarCliente();
		inicializarAvion();

	}

	public void inicializarCliente() {
		Cliente.add(new Cliente("Nombre1", "Correo1"));
		Cliente.add(new ClienteVip("Nombre2", "Correo2", 0.1));

	}

	public void inicializarAvion() {
		AvionNormal.add(new AvionNormal("Avion1", true, 20));
		AvionNormal.add(new AvionVIP("Avion2", true, 30, 0.5));

	}

	public boolean crearCliente(String nombre, String correo, double descuento) {
		try {
			if(descuento>0) Cliente.add(new ClienteVip(nombre,correo,descuento));
			Cliente.add(new Cliente(nombre, correo));
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public List<Cliente> leerCliente() {
		return Cliente;
	}

	public List<AvionNormal> leerAvionNormal() {
		return AvionNormal;
	}

	public List<Compra> leerCompra() {
		return Compra;
	}

	public boolean createCompra(Compra c) {
		try {
			Compra.add(c);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean create(Object o) {
		return false;
	}

	@Override
	public List<Object> read() {
		return null;
	}

	@Override
	public boolean update(int pos, Object o) {
		return false;
	}

	@Override
	public Object delete(int pos) {
		return null;
	}

	

}
