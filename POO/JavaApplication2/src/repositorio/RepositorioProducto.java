package repositorio;

import domain.Empresa;
import domain.Producto;

import java.util.ArrayList;
import java.util.List;

public class RepositorioProducto implements IRepositorio<Producto>{

    /**
     * Class made for following the C.R.U.D model that implements the Repositorio.IRepositorio. In this case, this class is made for representing the repository of Model.Producto.
     */

    private List<Producto> productos;

    public RepositorioProducto() {
        this.productos = new ArrayList<>();
        init();
    }

    /**
     * Method that initialize and add to the list the Model.Producto object, it's like creating product inside de program. Method made for following the C.R.U.D.S made in Repositorio.IRepositorio.
     */
    @Override
    public void init() {
        Empresa empresaApple= new Empresa(2131,"Apple.Inc", "Silicon Valley");
        productos.add(new Producto("Iphone 13", "ultimo telefono de apple , el mejor del mercado!", 1200, empresaApple));
        productos.add(new Producto("Galaxy S21", "El mejor telefono de Samsung, mejor precio de mercado", 850, new Empresa(1214,"Samsung S.A", "China")));
        productos.add(new Producto("Ipad 12", "La mejor tablet del mercado!", 780, empresaApple));
    }

    /**
     * In this part of the class, I start implementing the C.R.U.D method, the first method is for creating a Model.Producto and adding it to the list.
     * @param producto is the Model.Producto that will be added to the list productos.
     * @return boolean depending if the Model.Producto was created or not.
     */
    @Override
    public boolean create(Producto producto) {
        try{
            productos.add(producto);
            return true;
        }catch(Exception e){
            return false;
        }

    }

    /**
     * Method that reads the list of Productos, this is where all the Productos are store. Method made for following the C.R.U.D.S made in Repositorio.IRepositorio.
     * @return the list productos
     */
    @Override
    public List<Producto> read() {
        return productos;

    }

    /**
     * Continuing with the C.R.U.D.S methodology, now I implement the Update class for Model.Producto. This method will get the Model.Producto where the producto is
     * and change the attributes of the producto, updating it's values and characteristics.
     * @param posicion the position in the list productos where i want to change the Model.Producto.
     * @param producto the new Model.Producto that will be change for the old Model.Producto that is now updated.
     * @return true or false depending if the Model.Producto was update successfully or not.
     */
    @Override
    public boolean update(int posicion, Producto producto) {
        try{
            productos.set(posicion,producto);
            return true;
        }catch(Exception e){
            return false;
        }

    }

    /**
     * Continuing with the C.R.U.D.S methodology, now I implement the Delete method for Model.Producto. This method will get the position where the producto is and change the Model.Producto information depending on the new information that the user adds.
     * @param posicion is use to know which Model.Producto i want to delete, this is the position with in the productos array.
     * @return the Model.Producto that was delete
     */
    @Override
    public Producto delete(int posicion) {
        try{
            return productos.remove(posicion);
        }catch(Exception e){
            return null;
        }
    }

    /**
     * Last but not least, search is a method that will find the Model.Producto inside the productos array, in case the producto is not there, it will return null. Is very useful for checking if a Model.Producto exists or not.
     * @param producto the entity Model.Producto that will be searched.
     * @return the Model.Producto object if the producto was find, if not , it return's null.
     */
    @Override
    public Producto search(Producto producto) {
        for (int i=0;i< productos.size();i++){
            if(productos.get(i).equals(producto)){
                return productos.get(i);
            }
        }
        return null; //sino encontre nada es porque no esta
    }
}
