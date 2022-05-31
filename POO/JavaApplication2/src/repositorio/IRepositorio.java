package repositorio;

import java.util.List;

public interface IRepositorio<T> {

    /**
     * Class made for using multiple Repositories and create different methods for each class. In the future the idea is to divide each repository
     * depending on the entity that is implementing. It's very useful for implementing the C.R.U.D.S methodology and reusing code constantly. Each method uses generics objects.
     */

    public void init();

    public boolean create(T o);

    public List<T> read();

    public boolean update(int posicion, T o);

    public T delete(int posicion);

    public T search(T o);

}
