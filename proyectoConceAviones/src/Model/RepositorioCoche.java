package Model;
import java.util.List;
import java.util.Vector;

public class RepositorioCoche implements IRepositorio {
	private List<Object> lista;

	public RepositorioCoche() {
		lista = new Vector<>();
		init();
	}

	public void init() {
		lista.add(new Coche("modelo 1", "marca1"));
		lista.add(new Deportivo("modelo 1", "marca1", 0.1));

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
