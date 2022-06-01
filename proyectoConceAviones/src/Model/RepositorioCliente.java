package Model;
import java.util.List;
import java.util.Vector;

public class RepositorioCliente implements IRepositorio {
	private List<Object> lista;

	public RepositorioCliente() {
		lista = new Vector<>();
		init();
	}

	public void init() {
		lista.add(new Cliente("Nombre 1", "Correo1"));
		lista.add(new ClienteVip("Nombre 1", "Correo1", 0.1));

	}

	public boolean create(Object o) {
		try {
			lista.add(o);

		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public List<Object> read() {
		return lista;
	}

	public boolean update(int pos, Object o) {
		return false;
	}

	public Object delete(int pos) {
		return null;
	}
}
