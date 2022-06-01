package Model;

import java.util.List;
import java.util.Vector;

public class RepositorioCocheFile implements IRepositorio {
	private String filePathCliente= "data/Coches.dat";
	private List lista;

	public RepositorioCocheFile() {
		init();
	}

	public void init() {
		List<Coche> cTemp = FileUtil.deserializeFromFileToList(filePathCliente);
		if (cTemp == null)
			lista = new Vector<>();
		else
			lista = cTemp;
	}

	public boolean create(Object o) {
		try {
			lista.add((Coche)o);
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
