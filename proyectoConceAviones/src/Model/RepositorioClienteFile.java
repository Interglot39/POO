package Model;

import java.util.List;
import java.util.Vector;

public class RepositorioClienteFile implements IRepositorio {
	private String filePathCliente = "data/clientes.dat";
	private List lista;

	public RepositorioClienteFile() {
		init();
	}

	public void init() {
		List<Cliente> cTemp = FileUtil.deserializeFromFileToList(filePathCliente);
		if (cTemp == null)
			lista = new Vector<>();
		else
			lista = cTemp;
	}

	public boolean create(Object o) {
		try {
			lista.add((Cliente)o);
			FileUtil.serializeFromListToFile(filePathCliente, lista);

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
