package repositorio;

import domain.Pedido;

import java.util.ArrayList;
import java.util.List;

public class RepositorioPedido implements IRepositorio<Pedido>{

    /**
     * Class made for following the C.R.U.D model that implements the Repositorio.IRepositorio. In this case, this class is made for representing the repository of Model.Pedido.
     */

    private List<Pedido> pedidos;

    public RepositorioPedido() {
        pedidos= new ArrayList<>();
    }

    /**
     * Method that initialize and add to the list the Model.Pedido object, it's like creating an order inside de program. Method made for following the C.R.U.D.S made in Repositorio.IRepositorio.
     */
    @Override
    public void init() {
        //vacio porque no quiero inicializarlo con ningun pedido
    }

    /**
     * In this part of the class, I start implementing the C.R.U.D method, the first method is for creating a Model.Pedido and adding it to the list.
     * @param pedido is the Model.Pedido that will be added to the list pedidos.
     * @return boolean depending if the Model.Pedido was created or not.
     */
    @Override
    public boolean create(Pedido pedido) {
        try{
            pedidos.add(pedido);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    /**
     * Method that reads the list of Pedidos, this is where all the Pedidos are store. Method made for following the C.R.U.D.S made in Repositorio.IRepositorio.
     * @return the list pedidos
     */
    @Override
    public List<Pedido> read() {
        return pedidos;
    }

    /**
     * Continuing with the C.R.U.D.S methodology, now I implement the Update class for Model.Pedido. This method will get the position where the pedido is
     * and change the attributes of the pedido, updating it's values and characteristics.
     * @param posicion the position in the list pedidos where i want to change the Model.Pedido.
     * @param pedido the new Model.Pedido that will be change for the old Model.Pedido that is now updated.
     * @return true or false depending if the Model.Pedido was update successfully or not.
     */
    @Override
    public boolean update(int posicion, Pedido pedido) {
        try{
            pedidos.set(posicion,pedido);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    /**
     * Continuing with the C.R.U.D.S methodology, now I implement the Delete method for Model.Pedido. This method will get the position where the pedido is and change the Model.Pedido information depending on the new information that the user adds.
     * @param posicion is use to know which Model.Pedido i want to delete, this is the position with in the pedidos array.
     * @return the Model.Pedido that was delete
     */
    @Override
    public Pedido delete(int posicion) {
        try{
            return pedidos.remove(posicion);
        }catch(Exception e){
            return null;
        }
    }

    /**
     * Last but not least, search is a method that will find the Model.Pedido inside the pedidos array, in case the pedido is not there, it will return null. Is very useful for checking if a Model.Pedido exists or not.
     * @param pedido the entity Model.Pedido that will be searched.
     * @return the Model.Pedido object if the pedido was find, if not , it return's null.
     */
    @Override
    public Pedido search(Pedido pedido) {
        for (int i=0;i< pedidos.size();i++){
            if(pedidos.get(i).equals((Object)pedido)){
                return pedidos.get(i);
            }
        }
        return null; //sino encontre nada es porque no esta
    }
}
