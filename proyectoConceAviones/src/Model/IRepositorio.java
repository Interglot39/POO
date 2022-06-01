package Model;
import View.*;
import java.util.List;
public interface IRepositorio {
	public void init();
	public boolean create(Object o);
	public List<Object> read();
	public boolean update(int pos, Object o);
	public Object delete(int pos);
}
