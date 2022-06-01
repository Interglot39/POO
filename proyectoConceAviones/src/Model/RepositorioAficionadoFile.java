package Model;

import java.util.List;
import java.util.Vector;

public class RepositorioAficionadoFile implements IRepositorio {
	private String filePathCliente= "data/aficionados.dat";
	private List lista;

	public RepositorioAficionadoFile() {
		init();
	}

	public void init() {
		List<Aficionado> cTemp = FileUtil.deserializeFromFileToList(filePathCliente);
		if (cTemp == null)
			lista = new Vector<>();
		else
			lista = cTemp;
	}

	public boolean create(Object o) {
		try {
			lista.add((Aficionado)o);
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
