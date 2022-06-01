package Model;

import java.util.List;
import java.util.Vector;

public class RepositorioDronFile implements IRepositorio {
	private String filePathDronEspia= "data/Drons.dat";
	private List lista;

	public RepositorioDronFile() {
		init();
	}

	public void init() {
		List<Dron> cTemp = FileUtil.deserializeFromFileToList(filePathDronEspia);
		if (cTemp == null)
			lista = new Vector<>();
		else
			lista = cTemp;
	}

	public boolean create(Object o) {
		try {
			lista.add((Dron)o);
			FileUtil.serializeFromListToFile(filePathDronEspia, lista);

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
